
public class SistemaInterno {
	
	private String clave = "Alura";
	
	public boolean auntentica(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.logIn(clave);
		if (puedeIniciarSesion) {
			System.out.println("Log in Exitoso");
			return true;
		}else {
			System.out.println("Error en Log In");
			return false;
		}
		
	}
}
