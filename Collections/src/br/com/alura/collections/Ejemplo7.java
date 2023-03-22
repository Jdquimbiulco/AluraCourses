package br.com.alura.collections;

import java.util.ArrayList;
import java.util.List;

import Model.Aula;
import Model.Curso;

public class Ejemplo7 {
	public static void main(String[] args) {
		
		System.out.println("Interface List");
		
		Curso curso1 = new Curso("Php", 30);
		curso1.addAula(new Aula("JavaScript"));
		curso1.addAula(new Aula("Phyton"));
		curso1.addAula(new Aula("Polymorphism"));

		List<Aula> aulaList = curso1.getAulaList();
		
		
		//Is not possible to add new elements to the list because is encapsulated
		try {
			aulaList.add(new Aula("Big Data"));
		} catch (UnsupportedOperationException excep) {
			excep.printStackTrace();
		}
		
		
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);



		System.out.println(cursos.get(0).getAulaList());
	
	
	}
}
