package br.com.alura.collections;

import java.util.ArrayList;

import Model.Aula;
import Model.Curso;

public class Ejemplo6 {
	public static void main(String[] args) {
		
		System.out.println("Interface List");
		
		Curso curso1 = new Curso("Php", 30);
		curso1.addAula(new Aula("JavaScript"));
		curso1.addAula(new Aula("Phyton"));
		curso1.addAula(new Aula("Polymorphism"));

		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);



		System.out.println(cursos.get(0).getAulaList());
	
	
	}
}
