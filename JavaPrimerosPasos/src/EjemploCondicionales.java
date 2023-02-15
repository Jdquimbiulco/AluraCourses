
public class EjemploCondicionales {
	public static void main(String[] args) {
		System.out.println("Bar");

		int edad = 17;
		int cantidad = 1;

		if (edad >= 18) {
			System.out.println("Eres mayor de edad puedes entrar");
		} else {
			if (cantidad >= 2) {
				System.out.println("Usted no es mayor de edad, pero esta acompahado, puede entrar");
			} else 
			System.out.println("No eres mayor de edad, no puedes entrar");
		}
	}

}
