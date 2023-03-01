
public class TestConAtributoPrivado {
	public static void main(String[] args) {
		
		Cuenta cuentaDiogenes = new Cuenta();
		System.out.println("El saldo inicial del cliente es: " + cuentaDiogenes.getSaldo());
		cuentaDiogenes.depositar(3000);
		System.out.println("El saldo actual del cliente es: " + cuentaDiogenes.getSaldo());
		
		cuentaDiogenes.setAgencia(33);
		System.out.println("Su agencia es: " + cuentaDiogenes.getAgencia());
		

	}
}
