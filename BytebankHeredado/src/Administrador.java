
public class Administrador extends Funcionario implements Autenticable{

	private AuntenticacionUtil util;

	public Administrador() {
		this.util = new AuntenticacionUtil();
	}
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	public void setClave(String clave) {
		this.util.setClave(clave);
	}

	public boolean logIn(String clave) {
		return this.util.logIn(clave);
	}

}
