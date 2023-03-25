package br.com.alura.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

import Model.Alumno;
import Model.Curso;

public class Ejemplo11 {
	
		public static void main(String[] args) {
			System.out.println("Utilizando Maps");
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
			
		//Using this method to find some value inside the collection
//			Optional<Alumno> alumno = curso1.getAlumnos().stream().filter(a ->"Juan Diego".equalsIgnoreCase(a.getNombreAlumno())).findFirst();
//			
//			if (alumno.isPresent()) {
//				System.out.println(alumno.get());
//			}
		
			
		//Using maps to find the value in this case is the name of the student
			
			Alumno alumnoMap = curso1.getAlumnoMap().get("Juan Diego");
			System.out.println("El alumno " + alumnoMap + ", si existe en la coleccion");
			

		
	}
}
