
public class EjemploCondicionales {
	public static void main(String[] args) {
		System.out.println("Bar");

		int edad = 17;
		int cantidadPersonas = 1;

		if (edad >= 18 || cantidadPersonas >= 2) {
			System.out.println("Used Puede entrar");
		} else {
			System.out.println("No eres mayor de edad, no puedes entrar");
		}
	}

}
