
public class TestReferencias3 {
	public static void main(String[] args) {
		
		Cuenta cuentaDePedro = new Cuenta ();
		
		cuentaDePedro.titular.setDocumento("1711300458");
		cuentaDePedro.titular.setTelefono("0684531145");
		cuentaDePedro.titular.setNombre("Pedro");
		
		System.out.println("El nombre del cliente es: " + cuentaDePedro.titular.getNombre());
		System.out.println("El ID de Pedro es: " + cuentaDePedro.titular.getDocumento());
	}

}
