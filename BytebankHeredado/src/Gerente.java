
public class Gerente extends Funcionario {
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean logIn(String clave) {
		return this.clave == clave;
	}
	
	//Sobre-escritura de metodos
	public double getBonificacion() {
		System.out.println("Ejecutando desde GERENTE");
		return super.getSalario() + this.getSalario()*0.5;
	}
	
	
}