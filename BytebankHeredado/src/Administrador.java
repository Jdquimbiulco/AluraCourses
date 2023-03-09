
public class Administrador extends Funcionario implements Autenticable{

	private String clave = "Alura";

	@Override
	public double getBonificacion() {
		return 0;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean logIn(String clave) {
		return this.clave == clave;
	}

}
