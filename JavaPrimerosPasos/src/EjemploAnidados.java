
public class EjemploAnidados {
	public static void main(String[] args) {
		
		for( int fila = 0; fila <= 5;fila ++ ) {
			for( int columna = 0; columna <=5;columna ++ ) {
				if(columna > fila) {
					break;
			}
			System.out.print(columna);	
		}
			System.out.println();
	}
}
}