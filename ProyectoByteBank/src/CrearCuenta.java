
public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
//Primitive way of modifying "Saldo"
//		primeraCuenta.saldo = 1000;
//		System.out.println(primeraCuenta.saldo);

//With encapsulated attributes

		primeraCuenta.depositar(1000);
		System.out.println(primeraCuenta.getSaldo());

		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.depositar(500);
		System.out.println(segundaCuenta.getSaldo());
	}

}
