
public class FactorialFor {
	public static void main(String[] args) {
	
		int factorial = 1;
		
		for (int n = 1; n <=10;n++) {
			factorial *= n;
			System.out.println("El factorial de " + n + " es " + factorial);
		}
	
  }
}
