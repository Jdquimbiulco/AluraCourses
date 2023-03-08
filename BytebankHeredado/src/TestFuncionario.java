
public class TestFuncionario {
	public static void main(String[] args) {
		
		Funcionario diego = new Gerente(); //Changed from Funcionariio to Gerente because funcionario is an abstract class.
		diego.setNombre("Diego");
		diego.setDocumento("171915496");
		diego.setSalario(2500);
		
		System.out.println("El nombre del funcionario es: " + diego.getNombre());
		System.out.println("Bonificacion del 10% es: " + diego.getBonificacion());
	}
}
