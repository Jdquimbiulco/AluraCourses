package br.com.alura.collections;

import java.util.ArrayList;

public class Ejemplo2 {
	public static void main(String[] args) {
		
		System.out.println("Formas de leer una ArryList");
		
		String variable1 = "clase 1";
		String variable2 = "clase 2";
		String variable3 = "clase 3";
		String variable4 = "clase 4";
		
	ArrayList<String> lista = new ArrayList<>();
		
		lista.add(variable1);
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);
		System.out.println(lista);
	
	//We can read an arrayList using a loop For
		/*
		   	for(int i = 0;i < lista.size();i++) {
			System.out.println(lista.get(i));
		}
		*/

	//Another way to read an array is by using a For Each
		/*
		for (String clase : lista) {
			System.out.println(clase);
		}
		*/
	
	//Other way to read with a lambda method
		lista.forEach(clase -> {
			System.out.println(clase);
		});
	}
}
