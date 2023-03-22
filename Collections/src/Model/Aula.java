package Model;

public class Aula implements Comparable<Aula> {
	
	private String nombre;

	public Aula(String nombre) {
		this.nombre = nombre;
		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}

	@Override
	public int compareTo(Aula o) {
		return this.nombre.compareTo(o.getNombre());
	}
	
}
