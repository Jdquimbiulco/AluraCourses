
public class ValoresVariables {
	public static void main(String[] args) {
		
		int numeroUno = 5;
		int numeroDos = 9;
		
		System.out.println(numeroDos);
		
		numeroDos = numeroUno;
		System.out.println(numeroDos);
		
		numeroUno = 55;
		System.out.println(numeroDos); //Keeps the value that was given to the variable
		System.out.println(numeroUno); //Contain the new value that was given to the variable.
	}
}
