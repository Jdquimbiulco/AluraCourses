
public class Gerente extends Funcionario {
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean logIn(String clave) {
		return this.clave == clave;
	}
	
	public double getBonificacion() {
		return super.getSalario();
	}
	
}
