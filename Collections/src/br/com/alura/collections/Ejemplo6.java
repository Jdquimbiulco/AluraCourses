package br.com.alura.collections;

import java.util.ArrayList;

import Model.Clase;
import Model.Curso;

public class Ejemplo6 {
	public static void main(String[] args) {
		
		System.out.println("Interface List");
		
		Curso curso1 = new Curso("Php", 30);
		curso1.addClase(new Clase("JavaScript"));
		curso1.addClase(new Clase("Phyton"));
		curso1.addClase(new Clase("Polymorphism"));

		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);



		System.out.println(cursos.get(0).getClaseList());
	
	
	}
}
