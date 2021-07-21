package dominio.cumpleaños;

public class Trago extends Carta{
	
	private Integer id;
	private String nombreTrago;
	public Trago(Integer id, String nombreTrago) {
		super();
		this.id = id;
		this.nombreTrago = nombreTrago;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreTrago() {
		return nombreTrago;
	}
	public void setNombreTrago(String nombreTrago) {
		this.nombreTrago = nombreTrago;
	}
	
	

}
