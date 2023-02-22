
public class TablasMultiplicarFor {
	public static void main(String[] args) {
		int tabla = 2;
		System.out.println("Tabla del " + tabla);
		for (int contador = 0; contador <= 12; contador++) {
			int total = tabla * contador;
			System.out.println(tabla + " por " + contador + " = " + total);
		}
	}
}
