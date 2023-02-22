
public class TablasMultiplicarWhile {
	public static void main(String[] args) {

		int tabla = 7;
		int contador = 0;

		System.out.println("Tabla de multiplicar del " + tabla);

		while (contador <= 12) {

			int respuesta = tabla * contador;
			System.out.println(tabla + " por " + contador + " = " + respuesta);
			contador++;
		}

	}
}
