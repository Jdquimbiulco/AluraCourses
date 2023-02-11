
public class TipoVariable {
	
	public static void main(String[] args){
		System.out.println("Hola Mundo! Me llamo Diego");
		
		
		int edad = 22;
		double salario = 450.000;
		double salarioEnUnAnho = salario * 12;
		double division = 5.0/2;
		int transformacionDeTipo = (int) salario; //"Cast" method transforms type of data.
		float valor1 = 0.1F;
		float valor2 = 0.2F;
		float total = valor1 + valor2;
		
		System.out.println("Mi edad actual es: " + edad);
		System.out.println("Mi salario basico es: " + salario);
		System.out.println("Mi salario anual es: " + salarioEnUnAnho);
		System.out.println("El resultado de la division es: " + division);
		System.out.println("Mi salario redondeado es: " + transformacionDeTipo);
		System.out.println("El total de la suma es: " + total);
	}
	
}
