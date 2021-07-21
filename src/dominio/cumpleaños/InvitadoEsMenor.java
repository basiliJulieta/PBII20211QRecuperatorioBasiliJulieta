package dominio.cumpleaños;

public class InvitadoEsMenor extends Exception {
	public InvitadoEsMenor(){
		super("El invitado no puede tomar alcohol");
	}
}
