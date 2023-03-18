package br.com.alura.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import Model.Curso;

public class Ejemplo5 {
	
	public static void main(String[] args) {
		
		System.out.println("Creando Listas con Objetos");
		
		//First we need to create a class  with their getters and setters and constructor
		
		Curso curso1 = new Curso("Php", 30);
		Curso curso2 = new Curso("Java", 20);
		Curso curso3 = new Curso("JavaScript", 50);
		Curso curso4 = new Curso("Ruby", 10);
	
		//then added to the arrayList,but we need to set the type as the class we created.
		ArrayList<Curso> cursos = new ArrayList<>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);

		System.out.println("Lista Desordenada");
		System.out.println(cursos);
		System.out.println();
		
		Collections.sort(cursos);
		System.out.println("Lista Ordenada");
		System.out.println(cursos);
		System.out.println();
		
		
		System.out.println("Listo ordenada por horas");
		Collections.sort(cursos,Comparator.comparing(Curso::getTiempo));
		//Collections.sort(cursos,Comparator.comparing(Curso::getTiempo).reversed());
		System.out.println(cursos);

		
	}
}
