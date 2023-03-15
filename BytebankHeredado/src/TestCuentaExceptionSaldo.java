
public class TestCuentaExceptionSaldo {
	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorros(111, 456);
		cuenta.depositar(200);
		System.out.println("Saldo Cuenta: " + cuenta.getSaldo());
		cuenta.retirar(210);
		System.out.println("Saldo Cuenta: " + cuenta.getSaldo());

	}
}
