package br.com.alura.collections;

import java.util.ArrayList;

import Model.Curso;

public class Ejemplo4 {
	
	public static void main(String[] args) {
		
		System.out.println("Creando Listas con Objetos");
		
		//First we need to create a class  with their getters and setters and constructor
		
		Curso curso1 = new Curso("Geometria", 10);
		Curso curso2 = new Curso("Algebra", 20);
		Curso curso3 = new Curso("Calculo", 30);
		Curso curso4 = new Curso("Poo", 40);
	
		//then added to the arrayList,but we need to set the type as the class we created.
		ArrayList<Curso> cursos = new ArrayList<>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(new Curso("Historia", 40));

		System.out.println(cursos);
	}
}
