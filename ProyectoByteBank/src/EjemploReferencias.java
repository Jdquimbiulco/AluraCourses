
public class EjemploReferencias {
	public static void main(String[] args) {
		
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 100;
		//System.out.println("Primera cuenta: " + primeraCuenta.saldo); Prints the first state of the variable
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 200; //The value of the variable changes to the new value
		
		System.out.println("Primera cuenta: " + primeraCuenta.saldo);
		System.out.println("Segunda cuenta: " + segundaCuenta.saldo);
		
		segundaCuenta.saldo += 300; // As the variable change to a new value it adds to new value.
		System.out.println("Primera cuenta: " + primeraCuenta.saldo);
	}
}
