package dominio.cumpleaños;

public class Plato extends Carta {
	
	private Integer id;
	private String nombrePlato;
	public Plato(Integer id, String nombrePlato) {
		super();
		this.id = id;
		this.nombrePlato = nombrePlato;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombrePlato() {
		return nombrePlato;
	}
	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Plato other = (Plato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	

}
