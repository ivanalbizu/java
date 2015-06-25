package main;

public class CEcuacion2Grado {

	public double calcularDiscriminante(double a, double b, double c) throws ExcepcionNegativo {
		return Math.pow(b, 2)-4*a*c;
	}
	public double comprobarDivisible(double a) throws ExcepcionNegativo {
		return a;
	}
	public double calcularUnSigno(double a, double b, double c) throws ExcepcionNegativo{
		return (-b+Math.sqrt(calcularDiscriminante(a, b, c)))/(2*a);
	}
	public double calcularOtroSigno(double a, double b, double c) throws ExcepcionNegativo{
		return (-b-Math.sqrt(calcularDiscriminante(a, b, c)))/(2*a);
	}
	
}
