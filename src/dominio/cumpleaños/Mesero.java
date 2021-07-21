package dominio.cumpleaños;

public class Mesero extends Persona {
	
	
	private Integer numeroDeMesero;
	
	public Mesero(String nombreYApellido, Integer edad, Integer dni, Integer numeroDeMesero) {
		super(nombreYApellido, edad, dni);
		this.numeroDeMesero= numeroDeMesero;
		// TODO Auto-generated constructor stub
	}

	public Integer getNumeroDeMesero() {
		return numeroDeMesero;
	}

	public void setNumeroDeMesero(Integer numeroDeMesero) {
		this.numeroDeMesero = numeroDeMesero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((numeroDeMesero == null) ? 0 : numeroDeMesero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mesero other = (Mesero) obj;
		if (numeroDeMesero == null) {
			if (other.numeroDeMesero != null)
				return false;
		} else if (!numeroDeMesero.equals(other.numeroDeMesero))
			return false;
		return true;
	}
	
	
	
	


}
