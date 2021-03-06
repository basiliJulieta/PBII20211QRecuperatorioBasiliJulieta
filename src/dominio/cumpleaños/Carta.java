package dominio.cumpleaņos;

import java.util.HashSet;
import java.util.Set;

public abstract class Carta {

		private String nombre;
		private Set<String> ingredientes = new HashSet<>();
		private Integer id;
		private Double importe;
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Carta other = (Carta) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Set<String> getIngredientes() {
			return ingredientes;
		}

		public void setIngredientes(Set<String> ingredientes) {
			this.ingredientes = ingredientes;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
		public double getImporte() {
			return importe;
		}
		public void setImporte(Double importe) {
			this.importe=importe;
		}


		
	}
