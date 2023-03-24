package Model;

public class Alumno {
	
	private String nombreAlumno;

	public Alumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	
	@Override
	public String toString() {
		return this.nombreAlumno;
	}
	
	
	

}
