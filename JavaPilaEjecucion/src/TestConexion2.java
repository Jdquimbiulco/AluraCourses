
public class TestConexion2 {
	public static void main(String[] args) throws Exception {
		
		try (Conexion con = new Conexion()){
			con.leerDatos();
		
		} catch (IllegalStateException excep) {
			System.out.println("Atrapa la excepcion");
			excep.printStackTrace();
		}
		
		
		
		
		
		/*
		try {
			
			con = new Conexion();
			con.leerDatos();
			
		} catch (IllegalStateException excep) {
			
			System.out.println("Atrapando la exepcion");
			excep.printStackTrace();
			
		} finally {
			System.out.println("Ejecutando Finally");
			
			if (con != null) {
				con.cerrar();
			}
			
		}
		*/
	}
	
}
