
public class TestEncapsulamiento {
	public static void main(String[] args) {

		Cuenta cuentaZeus = new Cuenta();
		cuentaZeus.titular.setNombre("Zeus");
		System.out.println("El propietario de la cuenta es: " + cuentaZeus.titular.getNombre());
	}
}
