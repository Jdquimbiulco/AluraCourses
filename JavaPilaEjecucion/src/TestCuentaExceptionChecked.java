
public class TestCuentaExceptionChecked {
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		
		try {
			cuenta.depositar();
		} catch (MiException2 excep2) {
			excep2.getMessage();
			excep2.printStackTrace();
		}
		
	}
}
