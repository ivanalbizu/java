package test;

import utilidades.*;
import gestion.*;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenido al PROGRAMA GESTOR TRABAJADORES \n"
				+ "El programa permite: \n"
				+"\t Cargar trabajadores \n"
				+"\t Añadir nuevo trabajador \n"
				+"\t Mostrar trabajadores \n"
				+"\t Borrar trabajador \n"
				+"\t Editar trabajador \n"
				+"\t Ordenar trabajadores por nombre \n"
				+"\t Ordenar trabajadores por apellidos \n"
				+"\t Ordenar trabajadores por departamento \n");
		
		boolean repetir = true;
		boolean flag = true;
		
		Gestion gestion = new Gestion();
		
		do {
			//Se muestra men� al usuario y devuelve la elección
			switch (Mensaje.menu()) {
				case 0://exit
					repetir=false;
					break;
				case 1://add existent workers
					//Carga s�lo una vez los trabajadores predefinidos
					if(flag){
						gestion.cargarTrabajadores();
						flag = false;
					} else {Mensaje.mostrar("Ya se han cargado los contactos");}
					break;
				case 2://add new item
					//Añade nuevo trabajador definido por el usuario
					gestion.add(gestion.crearTrabajador());
					break;
				case 3://show all
					//Muestra la colección de trabajadores
					System.out.println(gestion.findAll());
					break;
				case 4://delete worker
					//Elimina un trabajador elegido por el usuario
					gestion.borrarTrabajador();
					break;
				case 5://delete worker
					//Edita el nombre de un trabajador elegido por el usuario
					gestion.editName();
					break;
				case 6://order by name
					gestion.orderByName();
					break;
				case 7://order by surname
					gestion.orderBySurname();
					break;
				case 8://order by department
					gestion.orderByDepart();
					break;
				default://wrong option: repeat
					break;
			}
			
		} while (repetir);
		
		System.out.println("\n-----  Gracias por usar la aplicación  -----");
	}
}
