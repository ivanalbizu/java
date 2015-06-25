package trabajador;

import persona.*;

public class Trabajador extends Persona implements Comparable<Persona>{

	private String departamento;
	private String puesto;
	private float salario;
	
	
	public Trabajador() {}
	public Trabajador(String nombre, String apellidos, String dni, String departamento, String puesto, float salario) {
		super(nombre, apellidos, dni);
		this.departamento	= departamento;
		this.puesto			= puesto;
		this.salario		= salario;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+ " | Departamento: " +getDepartamento()+ " | Puesto: " +getPuesto()+ " | Salario: " +getSalario()+ "\n";
	}
	
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

}
