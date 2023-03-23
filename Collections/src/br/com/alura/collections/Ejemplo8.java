package br.com.alura.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Ejemplo8 {
	public static void main(String[] args) {
		
		System.out.println("Conociendo la interface Set");
		
		String alumno1 = "Juan Diego";
		String alumno2 = "Dionicio Alvarez";
		String alumno3 = "Apolo Acres";
		String alumno4 = "Efesio Marte";
		String alumno5 = "Apocrifo Hernandez";
		String alumno6 = "Leutania Lariz";
		
		//Creating a collection with set
		Set<String> listaAlumnos = new HashSet<>();
		
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		
		//One good thing about this set method is that it will not print duplicate values
		for (String alumno  : listaAlumnos) {
			System.out.println(alumno);
		}
		
		// Review if exist some value inside the colecction
		
			boolean valida = listaAlumnos.contains("Apolo Acres");
			if (valida == true) {
				System.out.println("Si existe tal nombre" );
			} else {
				System.out.println("No existe tal nombre");
			}
		
		//With this method we can know the string with the most length of letters
		
			String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
			System.out.println("El nombre con mas letras es: " + max + ", contiene un total de " + max.length() + " caracteres.");
		
	}
}
