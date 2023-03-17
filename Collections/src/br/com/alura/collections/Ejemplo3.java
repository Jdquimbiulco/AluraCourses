package br.com.alura.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo3 {
	public static void main(String[] args) {
		
		System.out.println("Formas de ordenar un ArryList");
		
		String curso1 = "Algebra";
		String curso2 = "Geometria";
		String curso3 = "Calculo";
		String curso4 = "POO";
		
	ArrayList<String> cursos = new ArrayList<>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println("Lista Desordenada");
		System.out.println(cursos);
		System.out.println();
		
	//Sorting array by Collections
		
		System.out.println("Lista Ordenada de menor a mayor");
		Collections.sort(cursos);
		System.out.println(cursos);
		
		System.out.println("Lista Ordenada de mayor a menor");
		Collections.sort(cursos, Collections.reverseOrder());
		System.out.println(cursos);
		
		
	//Sorting array by sort method on ArrayList
		/*
		System.out.println("Lista Ordenada de mayor a menor");
		cursos.sort(Comparator.naturalOrder());
		System.out.println(cursos);
		
		System.out.println();
		
		System.out.println("Lista Ordenada de menor a mayor");
		cursos.sort(Comparator.reverseOrder());
		System.out.println(cursos);
			*/
		
	//We can use too the Stream method
		/*
		List<String> CursosLista = cursos.stream().sorted().collect(Collectors.toList());
		System.out.println(CursosLista);
		*/
	}
}
