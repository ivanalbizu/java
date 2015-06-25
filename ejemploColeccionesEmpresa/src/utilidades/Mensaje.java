package utilidades;

public class Mensaje {
	
	public static void error(){
		System.out.println("La operación no se ha podido realizar");
	}
	public static void exito(){
		System.out.println("Operación realizada con éxito");
	}
	public static void mostrar(String s){
		System.out.println(s);
	}
	
	public static int menu(){
		System.out.println("Elija una opción\n"
				+ "1.- Cargar trabajadores\n"
				+ "2.- Añadir nuevo trabajador\n"
				+ "3.- Mostrar trabajadores\n"
				+ "4.- Borrar trabajador\n"
				+ "5.- Editar trabajador\n"
				+ "6.- Ordenar trabajadores por nombre\n"
				+ "7.- Ordenar trabajadores por apellidos\n"
				+ "8.- Ordenar trabajadores por departamento\n"
				+ "----\n"
				+ "0.- SALIR");
		return Leer.datoInt();
	}
}
