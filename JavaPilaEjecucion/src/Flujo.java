
public class Flujo {

	public static void main(String[] args) {
		System.out.println("Inicio de Main");
		metodo1();
		System.out.println("Final de Main");
	}

	public static void metodo1() {
		System.out.println("Inicio de metodo 1");
		metodo2();
		System.out.println("Final de metodo 1");
	}

	public static void metodo2() {
		System.out.println("Inicio de metodo 2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);

			try { //Intenta esto
//				int num = 0;
//				int resultado = i / num;
//				System.out.println(resultado);
				
				String test = null;
				System.out.println(test.toString());
				
			} catch(ArithmeticException | NullPointerException exception) { //atrapa el error
				
				System.out.println("ATRAPO EXCEPCION");
				System.out.println(exception.getMessage());
				exception.printStackTrace();
				
			}
			


		}
		System.out.println("Final de metodo 2");
	}
}
