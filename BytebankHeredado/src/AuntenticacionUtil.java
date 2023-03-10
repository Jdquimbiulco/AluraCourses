
public class AuntenticacionUtil {
	private String clave;

	public boolean logIn(String clave) {
		return this.clave == clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
}
