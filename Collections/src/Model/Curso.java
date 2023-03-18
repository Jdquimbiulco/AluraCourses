package Model;

import java.util.ArrayList;
import java.util.List;

public class Curso implements Comparable<Curso> {
	
	private String nombre;
	private int tiempo;
	private List<Clase> claseList = new ArrayList<>();
	

	
	public Curso(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	public Curso(String nombre, int tiempo, List<Clase> claseList) {
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.claseList = claseList;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	public int getTiempo() {
		return tiempo;
	}
	
	public List<Clase> getClaseList() {
		return claseList;
	}

	public void setClaseList(List<Clase> claseList) {
		this.claseList = claseList;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

	@Override
	public int compareTo(Curso o) {
		return this.nombre.compareTo(o.getNombre());
	}
	
	public void addClase(Clase clase) {
		this.claseList.add(clase);
	}
	
}
