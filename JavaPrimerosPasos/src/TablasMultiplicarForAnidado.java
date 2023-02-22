
public class TablasMultiplicarForAnidado {
	public static void main(String[] args) {

		for (int contador = 0; contador <= 12; contador++) {

			for (int tabla = 0; tabla <= 12; tabla++) {
				
			int total = tabla*contador;
				System.out.println(contador + " por " + tabla + " = " + total);
			}
			System.out.println("");
		}
	}
}
