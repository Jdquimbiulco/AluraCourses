
public class TestMetodos {
	public static void main(String[] args) {

		Cuenta cuentaDiego = new Cuenta();
		cuentaDiego.saldo = 300;
		System.out.println("Su saldo disponible actualmente es de: " + cuentaDiego.saldo);

		cuentaDiego.depositar(200);
		System.out.println("A depositado, su ingreso actual es de: " + +cuentaDiego.saldo);

		cuentaDiego.retirar(100);
		System.out.println("A retirado, su ingreso actual es de: " + cuentaDiego.saldo);
		
		Cuenta cuentaMaria = new Cuenta();
		cuentaMaria.saldo = 1000;
		System.out.println("Saldo de Maria: " + cuentaMaria.saldo);
		cuentaMaria.transferir(400, cuentaDiego);
		System.out.println("El saldo de Juan es: " + cuentaDiego.saldo);
		System.out.println("A Maria le queda: " + cuentaMaria.saldo);

	}
}
