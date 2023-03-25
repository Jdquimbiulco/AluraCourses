package Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Curso implements Comparable<Curso> {
	
	private String nombre;
	private int tiempo;
	private List<Aula> AulaList = new ArrayList<>();
	private Collection<Alumno> alumnos = new LinkedHashSet<>();
	private Map<String, Alumno> alumnoMap = new HashMap<>();
	

	
	public Curso(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	public Curso(String nombre, int tiempo, List<Aula> claseList) {
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.AulaList = claseList;
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
	
//	public List<Aula> getAulaList() {
//		return AulaList;
//	}
	
	//LISTAS QUE NPO SE PUEDAD MODIFICAR
	
	public List<Aula> getAulaList() {
		return Collections.unmodifiableList(AulaList);
	}

	public void setClaseList(List<Aula> claseList) {
		this.AulaList = claseList;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

	@Override
	public int compareTo(Curso o) {
		return this.nombre.compareTo(o.getNombre());
	}
	
	public void addAula(Aula clase) {
		this.AulaList.add(clase);
	}
	
	public void addAlumno(Alumno alumnos) {
		this.alumnos.add(alumnos);
		this.alumnoMap.put(alumnos.getNombreAlumno(), alumnos);
	}

	public Collection<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Collection<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public void setAulaList(List<Aula> aulaList) {
		AulaList = aulaList;
	}

	public Map<String, Alumno> getAlumnoMap() {
		return alumnoMap;
	}

	public void setAlumnoMap(Map<String, Alumno> alumnoMap) {
		this.alumnoMap = alumnoMap;
	}
	
	
	
}
