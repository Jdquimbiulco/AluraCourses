
public class EjemploMatriz {
	public static void main(String[] args) {
		
		for(int filas = 0; filas <=10; filas ++) {			
			
			for(int columnas = 0; columnas <= 10; columnas ++) {
				if (columnas < filas) {
				System.out.print("*");
				System.out.print(" ");
			}
			}
			System.out.println();
		}
	}
}
