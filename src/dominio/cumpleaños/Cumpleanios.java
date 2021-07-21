package dominio.cumpleaños;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Cumpleanios {
	private String nombre;
	private List <Invitado> invitados;
	private Set <Mesa> mesas;
	private Map <Integer, SentarAlInvitado> invitadosSentados;
	private Integer cantidadDeInvitadosSentados;
	
	public Cumpleanios(String nombre) {
		super();
		this.setNombre(nombre);
		this.invitados = new ArrayList<>();
		this.mesas = new HashSet<>();
		this.invitadosSentados= new HashMap<>();
	}
	
	public void ingresarInvitado(Invitado numeroDeInvitado){
		
		 this.invitados.add(numeroDeInvitado);
	}
	
	public void ingresarMesa(Mesa numeroDeMesa){
		this.mesas.add(numeroDeMesa);
	}
	
	public Integer sentarAlInvitado(Integer numeroDeMesa, String nombreDelInvitado) {
		
		invitadosSentados.put(++cantidadDeInvitadosSentados, new SentarAlInvitado(numeroDeMesa, nombreDelInvitado));
		return cantidadDeInvitadosSentados;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
	
	
	
	
}
