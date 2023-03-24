package br.com.alura.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Model.Alumno;
import Model.Curso;

public class Ejemplo9 {
	public static void main(String[] args) {
		
		System.out.println("Trabajando con Iterators");
		
		Curso curso1 = new Curso("Historia" , 30);
		
		Alumno alumno1 = new Alumno("Juan Diego");
		Alumno alumno2 = new Alumno("Dionicio Alvarez");
		Alumno alumno3 = new Alumno("Apolo Acres");
		Alumno alumno4 = new Alumno("Efesio Marte");
		Alumno alumno5 = new Alumno("Apocrifo Hernandez");
		Alumno alumno6 = new Alumno("Leutania Lariz");
			
		curso1.addAlumno(alumno1);
		curso1.addAlumno(alumno2);
		curso1.addAlumno(alumno3);
		curso1.addAlumno(alumno4);
		curso1.addAlumno(alumno5);
		curso1.addAlumno(alumno6);
		
		
		//Para poder imprimir debemos sobreescribir el metodo to String en la clase Alumno
		//curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));
		
		
		
		Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();
		while (alumnoIterator.hasNext()) {
			System.out.println(alumnoIterator.next());
		}
		
		
	}
}
