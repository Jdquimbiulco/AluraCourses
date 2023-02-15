
public class EjemploCaracteres {

	public static void main(String[] args) {
		
		char caracter = 'a';  
		System.out.println(caracter);
		
		caracter = 65; //Number on ASCII code.
		System.out.println(caracter);
		
		caracter = (char)(caracter + 3); //Is necessary to cast because is adding an int with a char.
		System.out.println(caracter);
		
		String palabra = "Cursos de Alura ";
		System.out.println(palabra);
		
		palabra = palabra + 2022;
		System.out.println(palabra);
	}
}

