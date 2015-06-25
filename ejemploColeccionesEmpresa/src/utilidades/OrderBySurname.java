package utilidades;

import java.util.*;
import trabajador.Trabajador;

public class OrderBySurname implements Comparator<Trabajador>{

	@Override
	public int compare(Trabajador trab1, Trabajador trab2) {
		
		return trab1.getApellidos().compareToIgnoreCase(trab2.getApellidos());
	}
}
