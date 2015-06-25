package persona;

public class Persona implements Comparable<Persona> {

	//Attributes
	private String nombre;
	private String apellidos;
	private String dni;
	
	
	//Constructors
	public Persona() { }	
	public Persona(String nombre, String apellidos, String dni) {
		this.nombre		= nombre;
		this.apellidos	= apellidos;
		this.dni		= dni;
	}

	
	//Methods
	public String toString() {
		return	"Nombre: " +getNombre()+ " | Apellidos: " +getApellidos()+ " | Dni: " +getDni();
	}
	public boolean equals(Object o) {
		boolean r = false;
		if (o instanceof Persona) {
			Persona p = (Persona) o;
			r = this.getNombre().equalsIgnoreCase(p.getNombre())
					&& this.getApellidos().equalsIgnoreCase(p.getApellidos())
					&& this.getDni().equalsIgnoreCase(p.getDni());
		}
		return r;
	}
	public int compareTo(Persona p) {
		int r;
		r = getNombre().compareToIgnoreCase(p.getNombre());
		if(r == 0)
			r = getApellidos().compareToIgnoreCase(p.getApellidos());
			if(r == 0)
				r = getDni().compareToIgnoreCase(p.getDni());
		return r;
	}

		
	//Gets and Sets
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
}
