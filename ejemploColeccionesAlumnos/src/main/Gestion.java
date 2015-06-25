package main;
import java.util.List;
public class Gestion {


	/**
	 * Muestra el men� principal de las opciones de la aplicaci�n
	 */
	public void mostrarMenu(){
		System.out.println("\n------\nElija la opci�n que desea: \n"
				+ "1.- A�adir alumnos \n"
				+ "2.- Mostrar todos los alumnos \n"
				+ "3.- Mostrar un alumno \n"
				+ "4.- Modificar un alumno \n"
				+ "5.- Borrar un alumno \n"
				+ "OTRO N�MERO --> Salir");
	}
	
	/**
	 * Muestra men� secundario perteneciente a la utilidad de edici�n de registros (Alumnos)
	 * @return	Devuelve entero v�lido con la opci�n seleccionada
	 */
	public int menuEditar(){
		int eleccion = 0;
		do {
			System.out.println("\n------\nElija que desea editar: \n"
					+ "\t1.- Nombre \n"
					+ "\t2.- Apellidos \n"
					+ "\t3.- Edad \n");
		
			eleccion = Leer.datoInt();
			
		} while (eleccion < 0 || eleccion > 3);
		return eleccion;
	}
	
	/**
	 * A�adir nuevos registros (Alumnos)
	 * @return	Devuelve un nuevo objeto alumno
	 */
	public Alumno anadirAlumno(){
		System.out.println("Introduzca nombre");	String nom	= 	Leer.dato();
		System.out.println("Introduzca apellidos");	String ape	=	Leer.dato();
		System.out.println("Introduzca edad");		int edad	=	Leer.datoInt();
		
		Alumno alum = new Alumno(nom, ape, edad);
		
		return alum;
	}
	
	/**
	 * Comprueba que el usuario ha introducido un objeto (Alumno) v�lido y existente en la colecci�n de Alumnos
	 * @param listaAlumnos		Colecci�n (array) de los alumnos existentes
	 * @param posicionAlumno	Posici�n de un objeto Alumno, introducida por el usuario, dentro la colecci�n
	 * @return					Booleano que indica si existe dicho objeto
	 */
	public boolean noVacio(List<Alumno> listaAlumnos, int posicionAlumno){
		boolean existeElemento = false;
		if (listaAlumnos.size() < posicionAlumno)	existeElemento = true;
		
		return existeElemento;
	}
	
	/**
	 * Obtiene un alumno indicado por la posici�n que ocupa en la colecci�n
	 * @param listaAlumnos		Colecci�n (array) de los alumnos existentes
	 * @param posicionAlumno	Posici�n de un objeto Alumno, introducida por el usuario, dentro la colecci�n
	 * @return					Devuelve un nuevo objeto alumno indicado por el usuario por su posici�n
	 */
	public Alumno obtenerAlumno(List<Alumno> listaAlumnos, int posicionAlumno){
		//Llamada al m�todo booleano "noVacio". Si no es v�lida la posici�n, no se continua
		while (this.noVacio(listaAlumnos, posicionAlumno)) {
			System.out.println("La posici�n elegida no existe. \nPor favor, introduzca otra");
			//Se solicita nueva posici�n
			posicionAlumno = Leer.datoInt();
		}
		//Devuelve el objeto alumno
		return listaAlumnos.get(posicionAlumno-1);
	}
	
	/**
	 * Elimina un objeto alumno de la colecci�n
	 * @param listaAlumnos		Colecci�n (array) de los alumnos existentes
	 * @param posicionAlumno	Posici�n de un objeto Alumno, introducida por el usuario, dentro la colecci�n
	 */
	public void eliminarAlumno(List<Alumno> listaAlumnos, int posicionAlumno){
		//Llamada al m�todo "obtenerAlumno" (recuerdo, este m�todo ya se encarga de obtener una posici�n v�lida)
		//Se elimina el alumno con el m�todo "remove" de ArrayList
		listaAlumnos.remove(this.obtenerAlumno(listaAlumnos, posicionAlumno));
		
		System.out.println("Registro eliminado correctamente");
	}
	
	/**
	 * Permite editar nombre, apellidos y edad. Individualmente
	 * @param listaAlumnos		Colecci�n (array) de los alumnos existentes
	 * @param posicionAlumno	Posici�n de un objeto Alumno, introducida por el usuario, dentro la colecci�n
	 */
	public void modificarAlumno(List<Alumno> listaAlumnos, int posicionAlumno){
		//Llamada al m�todo "obtenerAlumno" (recuerdo, este m�todo ya se encarga de obtener una posici�n v�lida)
		this.obtenerAlumno(listaAlumnos, posicionAlumno);

		//Se presenta el men� de edici�n. Posibilita: Editar nombre, apellidos y edad.
		//Se modifica con los "set" creados en la clase "Alumno"
		switch (this.menuEditar()) {
			case 1://Se modifica el nombre
				System.out.println("Introduzca el nuevo nombre");
				this.obtenerAlumno(listaAlumnos, posicionAlumno).setNombre(Leer.dato());
				break;
			case 2://Se modifican los apellidos
				System.out.println("Introduzca los nuevos apellidos");
				this.obtenerAlumno(listaAlumnos, posicionAlumno).setApellidos(Leer.dato());
				break;
			case 3://Se modifica la edad
				System.out.println("Introduzca la nueva edad");
				this.obtenerAlumno(listaAlumnos, posicionAlumno).setEdad(Leer.datoInt());
				break;
			default://No es necesaria esta opci�n
				break;
		}
		
		System.out.println("Modificaci�n realizada correctamente");
		
	}
	
	
}
