package dominio.cumpleaños;

import java.util.ArrayList;
import java.util.List;

public class Invitado extends Persona {
	
	private Integer numeroDeInvitado;
	private Integer edad;
	
	private List <Carta> pedidos;
	
	public Invitado(String nombreYApellido, Integer edad, Integer dni, Integer numeroDeInvitado) {
		super(nombreYApellido, edad,dni);
		this.numeroDeInvitado = numeroDeInvitado;
		this.pedidos = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	public Integer getNumeroDeInvitado() {
		return numeroDeInvitado;
	}

	public void setNumeroDeInvitado(Integer numeroDeInvitado) {
		this.numeroDeInvitado = numeroDeInvitado;
	}

	public List <Carta> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List <Carta> pedidos) {
		this.pedidos = pedidos;
	}
	
	public Boolean pedirTrago(Trago trago) throws InvitadoEsMenor{
		
		for (Carta pedido : pedidos) {
			if(edad>18)
				pedidos.add(trago);
				return true;
			}
		
		if(edad<18)
			
		throw new InvitadoEsMenor();
		
		return this.pedidos.add(trago);
		
		
	}
	
	
	
	
	
	

	
	
	

}
