package main;


/**
 * GestionMovil gestiona las operaciones que se pueden hacer con un conjunto de objetos de clase "movil"
 * 
 * @author ivan
 * @version 1.0
 *
 */
public class GestionMovil {

    // Atributos 
    private Movil moviles[]; 
    private double caja; 
  
    // Constructor 
    public GestionMovil() { }
  
  
    // Métodos
       
    /** 
     * Muestra todos los móviles, precios guardados y si se han vendido
     *  
     * @param movil Recibe un tipo móvil
     * @author ivan <a href="http://ivanalbizu.eu" target="_blank">Iván González</a>
     */
    public void mostrarMoviles(Movil[] movil) { 
        for (int i = 0; i < movil.length; i++) { 
        	movil[i].mostrarMovil(movil);
        }
    }
  
    
    /**
     * Muestra precio y marca de un móvil elegido por el usuario.
     * Recibe dos parámetros
     * 
     * @param movil	Recibe un tipo Movil.
     * @param num	Recibe el identificador del móvil. Introducido por el usuario.
     * @author ivan <a href="http://ivanalbizu.eu" target="_blank">Iván González</a>
     */
    public void verPrecio(Movil[] movil, int num) { 
        System.out.println(""
        		+ "Marca: "		+movil[num - 1].getMarca()+ "\n"
                + "Precio: "	+movil[num - 1].getPrecio() + " ?"); 
        System.out.println("--------"); 
    }
    
    /**
     * Se elige el móvil que se desea comprar. Se comprueba que no está vendido anteriormente.
     * 
     * @param movil	Recibe un tipo Movil
     * @param num	Recibe el identificador del móvil. Introducido por el usuario.
     * @author ivan <a href="http://ivanalbizu.eu" target="_blank">Iván González</a>
     * @see			#getVendido()
     * @return		Devuelve tipo "double" en la variable caja. "caja" acumula las ventas de todos los móviles vendidos.
     */
    public double comprarMovil(Movil[] movil, int num) {
        if (!movil[num - 1].getVendido()) { //Comprueba que no est� vendido
            movil[num - 1].setVendido(true); //Modifica a verdadero booleano vendido 
            caja += movil[num - 1].getPrecio(); //Guarda(acumula) la venta
        }
        else { System.out.println("El móvil ya est� vendido"); } 
        return caja; 
    } 
  
    
    /**
     * Muestra las ganacias netas de un móvil concreto
     * 
     * @param movil	Recibe un tipo Movil
     * @param num	Recibe el identificador del móvil. Introducido por el usuario.
     * @author ivan <a href="http://ivanalbizu.eu" target="_blank">Iván González</a>
     */
    public void verGanancias(Movil[] movil, int num) {
        double gananciasMovil = 0; 
        if (movil[num - 1].getVendido()) { //Comprueba que no está vendido
        	//Se calcula el beneficio neto del móvil
            gananciasMovil = movil[num - 1].getMargen() * movil[num - 1].getPrecio(); 
            System.out.println("Las ganancias de la venta de "
                    + movil[num - 1].getMarca() + " es " + gananciasMovil);//Muestra la ganancia de un móvil concreto
            System.out.println("------");
        }
        else { System.out.println("El móvil todavía no ha sido vendido"); }
    }
    
    
    /**
     * Muestra las ganacias netas de todas la ventas realizadas durante el día
     * 
     * @param movil	Recibe un tipo Movil
     * @author ivan <a href="http://ivanalbizu.eu" target="_blank">Iván González</a>
     */
    public void cerrarCaja(Movil[] movil) {
        double gananciasDia = 0;
        for (int i = 0; i < movil.length; i++) {
            if (movil[i].getVendido()) {
                gananciasDia += movil[i].getMargen() * movil[i].getPrecio(); 
            }
        }
        System.out.println("Las ganacias del día han sido " +gananciasDia+ " ?"); 
    }
	
    
    
    // Getters and setters 
    public Movil[] getMoviles() { 
        return moviles; 
    }
    public void setMoviles(Movil[] moviles) {
        this.moviles = moviles;
    }
}