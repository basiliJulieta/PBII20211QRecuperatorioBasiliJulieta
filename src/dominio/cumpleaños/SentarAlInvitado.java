package dominio.cumpleaños;

public class SentarAlInvitado {
	
	private String nombreDelInvitado;
	private Integer numeroDeMesa;
	
	public SentarAlInvitado(Integer numeroDeMesa, String nombreDelInvitado){
		
		this.nombreDelInvitado= nombreDelInvitado;
		this.numeroDeMesa = numeroDeMesa;
		
	}

	public String getNombreDelInvitado() {
		return nombreDelInvitado;
	}

	public void setNombreDelInvitado(String nombreDelInvitado) {
		this.nombreDelInvitado = nombreDelInvitado;
	}

	public Integer getNumeroDeMesa() {
		return numeroDeMesa;
	}

	public void setNumeroDeMesa(Integer numeroDeMesa) {
		this.numeroDeMesa = numeroDeMesa;
	}
	
	
	

}
