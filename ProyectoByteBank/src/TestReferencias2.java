
public class TestReferencias2 {
	public static void main(String[] args) {

		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.documento = "171915068-1";
		diego.telefono = "0962554156";

		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.agencia = 1;
		cuentaDeDiego.titular = diego;
		System.out.println("El numero de telefono del cliente es: " + diego.telefono);
	}
}
