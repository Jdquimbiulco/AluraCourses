
public class EjemploReferencias {
	public static void main(String[] args) {
		
		Cuenta primeraCuenta = new Cuenta();
		System.out.println("Primera cuenta: " + primeraCuenta.getSaldo());
		primeraCuenta.depositar(100);
		//System.out.println("Primera cuenta: " + primeraCuenta.saldo); Prints the first state of the variable
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.depositar(500);; //The value of the variable changes to the new value
		
		System.out.println("Primera cuenta: " + primeraCuenta.getSaldo());
		System.out.println("Segunda cuenta: " + segundaCuenta.getSaldo());
		
		segundaCuenta.depositar(300);
		//segundaCuenta.saldo += 300; // As the variable change to a new value it adds to new value.
		System.out.println("Primera cuenta: " + primeraCuenta.getSaldo());

	}
}
