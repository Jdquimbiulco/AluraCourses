
public class TestControlBonificacion {
	public static void main(String[] args) {
		
		Funcionario morfeo = new Funcionario();
		morfeo.setNombre("Morfeo");
		morfeo.setSalario(2000);
		
		Gerente larisa = new Gerente();
		larisa.setNombre("Larisa");
		larisa.setSalario(10000);
		
		Contador palfes = new Contador();
		palfes.setSalario(3000);
		
//		System.out.println("la bonificacion de " + morfeo.getNombre() + " es de: " + morfeo.getBonificacion());
//		System.out.println("la bonificacion de " + larisa.getNombre() + " es de: " + larisa.getBonificacion());
		
		ControlBonificacion control = new ControlBonificacion();
		
		control.registrarSalario(morfeo);
		control.registrarSalario(larisa);
		control.registrarSalario(palfes);
		
		
	}
}
