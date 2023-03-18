package Model;

public class Clase implements Comparable<Clase> {
	
	private String nombre;

	public Clase(String nombre) {
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
	public int compareTo(Clase o) {
		return this.nombre.compareTo(o.getNombre());
	}
	
}
