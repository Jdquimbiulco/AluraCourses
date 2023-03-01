
public class TestMetodos {
	public static void main(String[] args) {

		Cuenta cuentaDiego = new Cuenta();
		System.out.println("Su saldo disponible actualmente es de: " + cuentaDiego.getSaldo());

		cuentaDiego.depositar(200);
		System.out.println("A depositado, su ingreso actual es de: " + cuentaDiego.getSaldo());

		cuentaDiego.retirar(100);
		System.out.println("A retirado, su ingreso actual es de: " + cuentaDiego.getSaldo());
		
		Cuenta cuentaMaria = new Cuenta();
		cuentaMaria.depositar(1000);;
		System.out.println("Saldo de Maria: " + cuentaMaria.getSaldo());
		cuentaMaria.transferir(400, cuentaDiego);
		System.out.println("El saldo de Juan es: " + cuentaDiego.getSaldo());
		System.out.println("A Maria le queda: " + cuentaMaria.getSaldo());

	}
}
