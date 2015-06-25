package main;

import java.util.Scanner;

public class Menu {

	static Scanner sc = new Scanner(System.in);
	
	public static int opcion(){
		int opcion=0;
		boolean error=true;
		while(error){
			try {
				opcion=Integer.parseInt(sc.nextLine());
				error=false;			
			} catch (Exception e) {
				System.err.println("Error. Número no válido: "+ e.getMessage());
			}
		}
		return opcion;
	}
	
	
	public static double pedirNumero(){
		double opcion=0.;
		boolean error=true;
		while(error){
			try {
				opcion=Double.parseDouble(sc.nextLine());
				error=false;			
			} catch (Exception e) {
				System.err.println("Error. Número no válido: "+ e.getMessage());
			}
		}
		return opcion;
	}
}
