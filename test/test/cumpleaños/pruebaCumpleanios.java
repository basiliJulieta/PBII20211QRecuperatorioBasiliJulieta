package test.cumpleaños;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.cumpleaños.Cumpleanios;
import dominio.cumpleaños.Invitado;
import dominio.cumpleaños.InvitadoEsMenor;
import dominio.cumpleaños.Mesa;
import dominio.cumpleaños.Plato;
import dominio.cumpleaños.SentarAlInvitado;
import dominio.cumpleaños.Trago;


public class pruebaCumpleanios {

	@Test
	public void queSePuedaInstanciarUnTrago() {
		
		Trago fernet = new Trago (1, "fernet con coca");
		assertEquals("fernet con coca", fernet.getNombreTrago());
		
		
	}
	
	@Test
	public void queSePuedaInstanciarUnPlato() {
		
		Plato panchos = new Plato (88, "panchos");
		assertEquals("panchos", panchos.getNombrePlato());
		
		
	}
	
	@Test
	public void queSePuedaInstanciarUnCumpleanios() {
		
		Cumpleanios miCumple = new Cumpleanios ("Cumple de Juli");
		assertEquals("Cumple de Juli", miCumple.getNombre());
		
		
	}
	
	@Test
	
	public void queSePuedaIngresarUnaMesa(){
		Cumpleanios miCumple = new Cumpleanios ("Cumple de Juli");
		Mesa mesa = new Mesa (5, 1);
		
		miCumple.ingresarMesa(mesa);
		
		assertNotNull(mesa);
	}
	
	@Test
	public void queSePuedaIngresarUnInvitado(){
		Cumpleanios miCumple = new Cumpleanios ("Cumple de Juli");
		Invitado invitado = new Invitado ("Carlos Perez", 45, 123456, 1 );
		
		miCumple.ingresarInvitado(invitado);
		
		assertNotNull(invitado);
	}
	
	@Test
	public void queSePuedaSentarUnInvitado(){
		Cumpleanios miCumple = new Cumpleanios ("Cumple de Juli");
		Invitado invitado = new Invitado ("Carlos Perez", 45, 123456, 1 );
		Mesa mesa = new Mesa (5, 1);
		SentarAlInvitado invitadoSentado = new SentarAlInvitado(1,"Carlos Perez");
		
		miCumple.ingresarMesa(mesa);
		miCumple.ingresarInvitado(invitado);
		miCumple.sentarAlInvitado(1, "Carlos Perez");
		
		assertEquals(invitadoSentado, miCumple.sentarAlInvitado(1, "Carlos Perez"));
		
		
		
		
	}
	
	@Test (expected = InvitadoEsMenor.class)
	public void queSeNoSePidaUnTragoUnMenorDeEdad()throws InvitadoEsMenor{
		
		Cumpleanios miCumple = new Cumpleanios ("Cumple de Juli");
		Invitado invitado = new Invitado ("Carlos Perez", 45, 123456, 1 );
		Mesa mesa = new Mesa (5, 1);
		Trago fernet = new Trago (1, "fernet con coca");
		miCumple.ingresarMesa(mesa);
		miCumple.ingresarInvitado(invitado);
		
		
		invitado.pedirTrago(fernet);
		
		
		
	}

	
	

}
