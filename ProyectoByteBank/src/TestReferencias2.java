
public class TestReferencias2 {
	public static void main(String[] args) {

		Cliente diego = new Cliente();
//WITH OUT ENCAPSULATING
//		diego.nombre = "Diego";
//		diego.documento = "171915068-1";
//		diego.telefono = "0962554156";

//ENCAPSULATED
		
		diego.setNombre("Diego");
		diego.setDocumento("171915068-1");
		diego.setTelefono("0962554156");
		
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.setAgencia(1);
		cuentaDeDiego.titular = diego;
		System.out.println("El numero de telefono del cliente es: " + diego.getTelefono());
	}
}
