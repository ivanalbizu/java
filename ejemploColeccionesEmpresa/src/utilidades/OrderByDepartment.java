package utilidades;

import java.util.Comparator;

import trabajador.Trabajador;

public class OrderByDepartment implements Comparator<Trabajador>{

	@Override
	public int compare(Trabajador trab1, Trabajador trab2) {
		int ordDep = trab1.getDepartamento().compareToIgnoreCase(trab2.getDepartamento());

		return ordDep;
	}

	
}
