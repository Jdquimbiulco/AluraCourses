package br.com.alura.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Model.Curso;

public class Ejemplo10 {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Algebra", 10);
		Curso curso2 = new Curso("Geometria", 20);
		Curso curso3 = new Curso("Aritmetica", 30);
		Curso curso4 = new Curso("Calculo", 40);
		Curso curso5 = new Curso("Edo", 50);
		Curso curso6 = new Curso("Aritmetica", 50);
		Curso curso7 = new Curso("Edo", 50);
		Curso curso8 = new Curso("Calculo", 50);
		
		ArrayList<Curso> cursos = new ArrayList<>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(curso5);
		cursos.add(curso6);
		cursos.add(curso7);
		cursos.add(curso8);
		
		
		System.out.println(cursos);
		//OBTENER EL PROMEDIO/MAX/MIN DE UNA LISTA 
		System.out.println("El Promedio es " + cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
		System.out.println("El Maximo es " + cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
		System.out.println("El Minimo es " + cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());
		System.out.println();
		
		System.out.println("Lista de Cursos");
		Map<String, List<Curso>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
		
		//Imprime el valor de los cursos sin importar si hay repetidos?
		
		//groupCurso.forEach((key, value) -> System.out.println(key));
		
		//Imprime si hay cursos repetidos
		groupCurso.forEach((key, value) -> System.out.println(key + " - " + value.size()));
	}
	
	
	

}
