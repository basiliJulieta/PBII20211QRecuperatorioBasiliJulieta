package dominio.cumpleaņos;

public class InvitadoEsMenor extends Exception {
	public InvitadoEsMenor(){
		super("El invitado no puede tomar alcohol");
	}
}
