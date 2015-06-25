package main;

import leer.*;

/**
 * Principal presenta la aplicación al usuario donde se gestionan todas sus instrucciones y peticiones
 * 
 * @author ivan <a href="http://ivanalbizu.eu" target="_blank">Iván González</a>
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		//Atributos
        double precio = 0.0, caja = 0.0; 
        String marca = null; 
        int opcion = 0; 
        boolean repetir = true; 
  
        System.out.println("Bienvenido a Venca");
        System.out.println("El programa gestiona las venta de móviles por catálogo.\n"
        		+ "Se puede consultar catálogo, vender móviles, ver precios, cajas, beneficios de un móvil\n-----");
        
        System.out.println("¿Con cuántos móviles quiere salir a la calle?");
        
        //Se crea el array "catalogo" de tipo "Movil". Con la dimensión introducida por el usuario
        Movil catalogo[] = new Movil[Leer.datoInt()];
        //Se crea el objeto "gestion" de tipo "GestionMovil"
        GestionMovil gestion = new GestionMovil();
        
        System.out.println("Elija los moviles que pondrá a la venta hoy");
        
        //Se rellena el array con los móviles (marca y precio)
        for (int i = 0; i < catalogo.length; i++) { 
            System.out.println("Introduzca la marca del móvil " + (i + 1));
            marca = Leer.dato();
            System.out.println("Introduzca el precio del móvil " + (i + 1));
            precio = Leer.datoFloat();
            Movil movil = new Movil(precio, marca);
            catalogo[i] = movil;
        } 
  
        //Se repiteel programa al menos una vez
        do { //Men� para gestionar el programa
            System.out.println("Menú:\n"
            		+ "1. Ver Catálogo\n"
            		+ "2. Ver precio de un móvil\n"
            		+ "3. Vender un móvil\n"
            		+ "4. Ver caja\n"
            		+ "5. Ver beneficios de un móvil\n"
            		+ "6. Ver beneficios del día\n"
            		+ "Otro número. Salir"); 

            opcion = Leer.datoInt(); 
            switch (opcion) {
	            case 1: //Se muestra el catálogo
	                gestion.mostrarMoviles(catalogo); 
	                break;
	            case 2: //Se consulta el precio de un móvil
	                System.out.println("Introduce el número de movil del catálogo"); 
	                gestion.verPrecio(catalogo, Leer.datoInt()); 
	                break;
	            case 3: //Se compra un móvil
	                System.out.println("Introduce el número de movil del catálogo"); 
	                caja = gestion.comprarMovil(catalogo, Leer.datoInt()); 
	                break;
	            case 4: //Se muestra todas las ventas
	                System.out.println("La caja total es :" + caja + " ?"); 
	                break;
	            case 5: //Se muestran el importe de un móvil
	                System.out.println("Introduce el nómero de movil del cual quiere ver ganacias"); 
	                gestion.verGanancias(catalogo, Leer.datoInt()); 
	                break;
	            case 6: //Se muestran las ganancias netas
	                gestion.cerrarCaja(catalogo);
	                break;
	            default: //Se sale del programa
	                repetir= false; 
	                break;
            } 
        } while (repetir); //Se sale del programa si en el switch se introduce número diferente de entre 1-6
        System.out.println("Hasta pronto");
		
	}

}
