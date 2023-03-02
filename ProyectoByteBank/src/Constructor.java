
public class Constructor {
	private String nombre;
	private int agencia;
	
	private static int contador =0;
	
	public Constructor(int agencia) {
		System.out.println("A sido creado un nuevo constructor");
		if (agencia > 0) {
			this.agencia = agencia;
		}else {
			System.out.println("No se permite valores inferiores a 0");
			this.agencia = 1;
		}
		contador++;
		System.out.println("Se van creando " + contador + " constructores");
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public static int getContador() {
		return Constructor.contador;
	}
}
