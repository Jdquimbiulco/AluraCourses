
public class EjemploCondicionales2 {
	public static void main(String[] args) {
		System.out.println("Puedes manejar un vehiculo?");

		int edad = 20;
		boolean edadSuficiente = edad >= 18;
		boolean licencia;
		char opcion = 'y';

		if (opcion == 'y' || opcion == 'Y') {
			licencia = true;
		} else {
			licencia = false;
		}

		System.out.println("Tiene edad suficiente? : " + edadSuficiente);
		System.out.println("Tiene licencia? : " + licencia);

		if (edadSuficiente && licencia) {
			System.out.println("Usted es apto para manejar.");
		} else {
			System.out.println("Usten no es apto para manejar.");
		}

	}
}
