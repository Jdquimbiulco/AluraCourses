package br.com.alura.collections;

import java.util.ArrayList;

public class Ejemplo1 {
	public static void main(String[] args) {
		
		System.out.println("Creacion de Arreglos");
		
		String variable1 = "Ejemplo 1";
		String variable2 = "Ejemplo 2";
		String variable3 = "Ejemplo 3";
		String variable4 = "Ejemplo 4";
		
	//We create a list using "ArrayList" command, then we need to add the elements to the array using "add"
	ArrayList<String> lista = new ArrayList<>();
		
		lista.add(variable1);
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);
		System.out.println(lista);
	
		//With the command "remove" we can delete elements from the array using the position of the index,
		lista.remove(3);
		System.out.println(lista);
		
		//With the command size we can know the "size" of the array.
		System.out.println("El tamaho de la lista es: " + lista.size());
	
		//With the command "set" we can update an element od the array.
		lista.set(2, "valor Editado");
		System.out.println(lista);
		
	}
}
