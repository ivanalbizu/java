package gestion;

import java.util.*;

import trabajador.*;
import utilidades.*;


public class Gestion {
	
	//Attribute
	private List<Trabajador> trabajadores;

	//Constructors
	public Gestion() {
		trabajadores = new ArrayList<Trabajador>();
	}
	/**
	 * 
	 * @param trab	Objeto trabajador cargado a la colección de trabajadores
	 */
	public void add(Trabajador trab){
		trabajadores.add(trab);
	}
	
	/**
	 * 
	 * @return		Devuelve la colección de trabajadores
	 */
	public List<Trabajador> findAll(){
		return trabajadores;
	}
	
	/**
	 * Muestra la lista de trabajadores
	 */
	public void mostrarTodo(){
		if (findAll().size() != 0) {//Comprueba que la colección no est� vac�a
			for (Trabajador trabajador : findAll())
				System.out.println(trabajador);
		}
		else
			Mensaje.mostrar("No se encuentran trabajadores");
	}
	
	/**
	 * Devuelve un trabajador si la cadena de b�squeda encuentra coincidencia
	 * @param busqueda	Cadena para realizar la b�squeda
	 * @return			Devuelve objeto tipo trabajador
	 */
	public Trabajador findByName(String busqueda){
		int i = 0;
		boolean encontrado = false;
		
		while (i < trabajadores.size() && !encontrado){
			// Se recorre la coleción mientras existen (y no se encuentre coincidencia) elementos: i < trabajadores.size()
			if (trabajadores.get(i).getNombre().equalsIgnoreCase(busqueda))
				//Se ha encontrado elemento, se sale del bucle while
				encontrado = true;
			else
				//Se recorre el siguiente item
				i++;
		}
		if (encontrado)
			//Se devuelve el elemento encontrado
			return trabajadores.get(i);
		else
			return null;	
	}
	
	/**
	 * Devuelve un trabajador si la cadena de b�squeda encuentra coincidencia
	 * @param busqueda	Cadena para realizar la b�squeda
	 * @return			Devuelve objeto tipo trabajador
	 */
	public Trabajador findBySurname(String busqueda){
		int i = 0;
		boolean encontrado = false;
		
		while(i < trabajadores.size() && !encontrado){
			// Se recorre la coleción mientras existen (y no se encuentre coincidencia) elementos: i < trabajadores.size()
			if (trabajadores.get(i).getApellidos().equalsIgnoreCase(busqueda))
				//Se ha encontrado elemento, se sale del bucle while
				encontrado=true;
			else
				//Se recorre el siguiente item
				i++;
		}
		if (encontrado)
			//Se devuelve el elemento encontrado
			return trabajadores.get(i);
		else
			return null;
	}
	
	/**
	 * Se borra un objeto tipo trabajador
	 */
	public void borrarTrabajador(){
		Trabajador trab = null;
		System.out.println("Nombre de la persona que desea borrar");
		//Se llama a m�todo "findByName"
		trab = findByName(Leer.dato());
		if (trab != null){
			//Se si ha encontrado coincidencia, se elimina de la colección el objeto trabajador
			trabajadores.remove(trab);
			Mensaje.exito();
		} else
			Mensaje.error();
	}
	
	/**
	 * Se edita un objeto tipo trabajador
	 */
	public void editName(){
		Trabajador trab = null;
		System.out.println("Nombre de la persona que desea editar");
		//Se llama a m�todo "findByName"
		trab = findByName(Leer.dato());
		if (trab != null) {
			//Si se ha encontrado coincidencia, se edita el nombre de la colección el objeto trabajador
			System.out.println("Introduzca nuevo nombre");
			//Se establece nuevo nombre
			trab.setNombre(Leer.dato());
			Mensaje.exito();
		} else
			Mensaje.error();
	}
	
	/**
	 * Se ordena por nombre la colección de tipo trabajador
	 * @return		Devuelve la colección ordenada por nombre
	 */
	public List<Trabajador> orderByName(){
		Collections.sort(trabajadores);
		return trabajadores;
	}
	
	/**
	 * Se ordena por apellido la colección de tipo trabajador
	 * @return		Devuelve la colección ordenada por apellido
	 */
	public List<Trabajador> orderBySurname(){
		Collections.sort(trabajadores, new OrderBySurname());
		return trabajadores;
	}
	
	/**
	 * Se ordena por departamento la colección de tipo trabajador
	 * @return		Devuelve la colección ordenada por departamento
	 */
	public List<Trabajador> orderByDepart(){
		Collections.sort(trabajadores, new OrderByDepartment());
		return trabajadores;
	}
	
	/**
	 * Se crea nuevo trabjador
	 * @return		Devuelve un objeto tipo trabajador
	 */
	public Trabajador crearTrabajador(){
		System.out.println("Introduzca nombre");		String nom = Leer.dato();
		System.out.println("Introduzca apellidos");		String ape = Leer.dato();
		System.out.println("Introduzca DNI"); 			String dni = Leer.dato();
		System.out.println("Introduzca Departamento");	String dep = Leer.dato();
		System.out.println("Introduzca puesto");		String pue = Leer.dato();
		System.out.println("Introduzca salario");		Float sal = Leer.datoFloat();
		Trabajador trabajador = new Trabajador(nom, ape, dni, dep, pue, sal);
		if (trabajador != null)
			Mensaje.exito();
		return trabajador;
	}
	
	/**
	 * Carga objetos trabajadores a la colección de trabajadores
	 * @return		Devuelve la colección con los trabajadores
	 */
	public List<Trabajador> cargarTrabajadores(){
		trabajadores.add(new Trabajador("Juan", "Pérez Blanco", "28796333V", "Diseño Web", "Diseñador", 1200));
		trabajadores.add(new Trabajador("Pepe", "Roldón Ruiz", "30796333X", "Programación", "Programador Java", 1600));
		trabajadores.add(new Trabajador("Lucas", "Naranjo Encina", "28333333Z", "Programación", "Programador Php", 1500));
		trabajadores.add(new Trabajador("Ivón", "Pére Blanco", "60096339Y", "Diseño Web", "Maquetador web", 1500));
		trabajadores.add(new Trabajador("Javier", "Pérez Negro", "90096333H", "Programación", "Programador Java", 1300));
		trabajadores.add(new Trabajador("Alejandro", "Pérez Negrón", "30766633Z", "Diseño gráfico", "Diseñador gráfico", 1250));
		trabajadores.add(new Trabajador("Ivón", "González González", "29796333K", "Programación", "Programación Php", 1800));
		Mensaje.exito();
		return trabajadores;
	}
	
}
