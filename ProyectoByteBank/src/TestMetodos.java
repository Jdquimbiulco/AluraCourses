
public class TestMetodos {
	public static void main(String[] args) {
		
		Cuenta cuentaDiego = new Cuenta();
		cuentaDiego.saldo = 300;
		
		cuentaDiego.depositar(200);
		System.out.println(cuentaDiego.saldo);
	}
}
