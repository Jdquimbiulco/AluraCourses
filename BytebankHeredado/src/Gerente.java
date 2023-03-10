
public class Gerente extends Funcionario implements Autenticable{
	
	private AuntenticacionUtil util;
	
	public Gerente() {
		this.util = new AuntenticacionUtil();
	}

	public void setClave(String clave) {
		this.util.setClave(clave);
	}

	public boolean logIn(String clave) {
		return this.util.logIn(clave);
	}
	
	//Sobre-escritura de metodos
	public double getBonificacion() {
		System.out.println("Ejecutando desde GERENTE");
		return super.getSalario() + this.getSalario()*0.5;
	}
	
	
}
