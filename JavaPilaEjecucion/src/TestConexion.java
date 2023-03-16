
public class TestConexion {
	public static void main(String[] args) {
		Conexion con = new Conexion();
		
		try { //Intenta esto
			
			con.leerDatos();
			
		} catch(IllegalStateException excep) { //Atrapa la excepcion
			
			System.out.println("Atrapando la exepcion");
			excep.printStackTrace();
			
		} finally { //Finalmente cierra la conexion
			
			System.out.println("Ejecutando Finally");
			con.cerrar();
			
		}

	}
}
