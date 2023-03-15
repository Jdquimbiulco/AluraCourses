
public class Flujo3 {
	public static void main(String[] args) {
		System.out.println("Inicio de Main");
		try {
			metodo1();
		} catch (Exception excep2) { //Atrapa cualquier tipo de excepcion, pero es mejor crear una excepcion propia
			excep2.printStackTrace();
		}
		System.out.println("Final de Main");
	}

	public static void metodo1() throws MiException2{
		System.out.println("Inicio de metodo 1");	
			metodo2();
		System.out.println("Final de metodo 1");
	}


	public static void metodo2() throws MiException2 {
		System.out.println("Inicio de metodo 2");
		int a = 50/0;
		throw new MiException2("Mi excepcion fue lanzada");
		
	}
}
