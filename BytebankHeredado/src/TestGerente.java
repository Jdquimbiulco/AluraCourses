
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerenteDiego = new Gerente();
		gerenteDiego.setSalario(6000);
		gerenteDiego.setTipo(1);
		gerenteDiego.setClave("Alara");
		
		
		System.out.println("El salario del Gerente es: " + gerenteDiego.getSalario());
		System.out.println("La bonificaion del gerente es de: " + gerenteDiego.getBonificacion());
		System.out.println("La clave esta correcta? " + gerenteDiego.logIn("Alara"));
	}
}
