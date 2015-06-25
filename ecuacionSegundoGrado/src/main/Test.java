package main;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido al programa de cálculo de ecuación de 2� GRADO\n"
				+ "El programa realiza el cálculo de una ecuación de segundo grado para el que el usuario debe\n"
				+ "introducir los datos necesarios. El programa est� construido a prueba de 'BOMBAS'\n");

		int ejecutar = 0;
		boolean repetir=true, error=true;
		double a=0., b=0., c=0.;
		double resultado1=0., resultado2=0.;
		CEcuacion2Grado ecuacion = new CEcuacion2Grado();
		
		do{
			do{
				System.out.println("Introduzca valor para 'a'"); a=Menu.pedirNumero();
				System.out.println("Introduzca valor para 'b'"); b=Menu.pedirNumero();
				System.out.println("Introduzca valor para 'c'"); c=Menu.pedirNumero();
				try {
					if (ecuacion.calcularDiscriminante(a, b, c) <=0 || ecuacion.comprobarDivisible(a) == 0) {
						throw new ExcepcionNegativo("Operación no válida. La ecuación no tiene soluciones reales o no es cuadr�tica");
					}else{
						resultado1=ecuacion.calcularUnSigno(a, b, c);
						resultado2=ecuacion.calcularOtroSigno(a, b, c);		
						error=false;
					}
				} catch (ExcepcionNegativo en) {
					en.printStackTrace();
					System.out.println("Introduzca otros números");
				}
				
			}while(error);

		System.out.printf("\nLos resultados de la operación son: \n%.2f \n%.2f \n", resultado1, resultado2);
			
		if (ejecutar!=1) repetir = false;	
		}while(repetir);
		
		System.out.println("-----  Gracias por usar la aplicación  -----");
	}

}
