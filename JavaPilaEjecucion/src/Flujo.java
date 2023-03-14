
public class Flujo {

	public static void main(String[] args) {
		System.out.println("Inicio de Main");
		metodo1();
		System.out.println("Final de Main");
	}

	public static void metodo1() {
		System.out.println("Inicio de metodo 1");	
		try {
			metodo2();
		} catch (MiException excep) {
			excep.getMessage();
			excep.printStackTrace();
		}
		
		System.out.println("Final de metodo 1");
	}


	public static void metodo2() {
		System.out.println("Inicio de metodo 2");
		//throw new ArithmeticException(); //Lanza un nueva excepcion del tipo arithmetic
		throw new MiException("Mi excepcion fue lanzada");

	}
}
