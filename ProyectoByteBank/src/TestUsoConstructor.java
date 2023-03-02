
public class TestUsoConstructor {
	public static void main(String[] args) {
		Constructor nuevoConstructor = new Constructor(1);
		nuevoConstructor.setNombre("Abis");
		System.out.println("El nombre del nuevo constructor es: " + nuevoConstructor.getNombre());
		System.out.println("La agencia definida es: " + nuevoConstructor.getAgencia());
		
		Constructor constructorDos = new Constructor(11);
//		Constructor constructorTres = new Constructor(125);
		
		System.out.println("El total de constructores creados es: " + Constructor.getContador());
		
		
	}
}
