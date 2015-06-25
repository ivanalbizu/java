package main;
/**
 * Movil genera objetos de tipo móvil cuyos atributos son:
 * Precio, Marca, total vendidos, vendido o disponible y beneficio
 * 
 * @author ivan
 *
 */
public class Movil {

    //Atributos 
    private double precio; 
    private String marca; 
    private double totalVendido; 
    //Se inicializa a no ha vendido.
    //Sólo se modifica en el método "comprarMovil" mediante "setVendido(true)"
    private boolean vendido=false;
    private double beneficio=0.4;//Beneficio sobre las ventas
    
    //Constructores 
    public Movil (){ } 

    /**
     * Constructor de tipo Movil. Se rellena por el usuario
     * @param precio	Recibe un "double" introducido por el usuario
     * @param marca		Recibe un "string" introducido por el usuario
     */
    public Movil (double precio, String marca){ 
        this.precio = precio; 
        this.marca = marca; 
    }

    
    /** 
     * Muestra todos los móviles, precios guardados y si se han vendido
     *  
     * @param movil Recibe un tipo móvil
     * @author ivan <a href="http://ivanalbizu.eu" target="_blank">Iván González</a>
     */
    public void mostrarMovil(Movil[] movil) { 
        System.out.println(""
        		+ "Marca "		+ getMarca() + "\n"
        		+ "Precio "		+ getPrecio() + " ?");
        if(getVendido()) System.out.println("VENDIDO");
        else System.out.println("NO VENDIDO");
        System.out.println("------");
    }
    
    
    /**
     * Muestra precio y marca de un móvil elegido por el usuario.
     * Recibe dos parámetros
     * 
     * @param movil	Recibe un tipo Movil.
     * @param num	Recibe el identificador del móvil. Introducido por el usuario.
     * @author ivan <a href="http://ivanalbizu.eu" target="_blank">Iván González</a>
     */
    public void verPrecio(Movil[] movil) {
        System.out.println(""
        		+ "Marca: "		+ this.getMarca()+ "\n"
                + "Precio: "	+ this.getPrecio() + " ?"); 
        System.out.println("--------"); 	
    }
    
    
    //Getters and Setters
    public double getMargen() { 
        return this.beneficio; 
    }
    public void setMargen(double margen) { 
        this.beneficio = margen; 
    }
    public double getPrecio() { 
        return this.precio; 
    } 
    public void setPrecio(double precio) { 
        this.precio = precio; 
    }
    public String getMarca() { 
        return this.marca; 
    }
    public void setMarca(String marca) { 
        this.marca = marca; 
    }
    public double getTotalVendido() { 
        return this.totalVendido; 
    }
    public void setTotalVendido(double totalVendido) { 
        this.totalVendido = totalVendido; 
    }
    public boolean isVendido() { 
        return this.vendido; 
    }
    public void setVendido(boolean vendido) { 
        this.vendido = vendido; 
    } 
    public boolean getVendido(){ 
        return this.vendido; 
    } 
	
	
}
