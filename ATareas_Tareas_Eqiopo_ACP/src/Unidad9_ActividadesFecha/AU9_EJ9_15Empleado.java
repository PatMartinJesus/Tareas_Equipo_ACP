package Unidad9_ActividadesFecha;

public class AU9_EJ9_15Empleado extends AU9_EJ9_14JerarquíaEmpleado {
  private double horas;
	private double sueldo;

	public AU9_EJ9_15Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double sueldo, double horas) {
	super(primerNombre, apellidoPaterno, numeroSeguroSocial); 
	establecerSueldo(sueldo);
	establecerHoras(horas);
	}

	public void establecerHoras(double horas) { if (horas >= 0 && horas <= 168) {
	this.horas = horas;
	} else {
	throw new IllegalArgumentException("Horas trabajadas deben ser >= 0 y <= 168");
	}
	}

	public double obtenerHoras() { return horas;
	}
	 

	public void establecerSueldo(double sueldo) { if (sueldo >= 0) {
	this.sueldo = sueldo;
	} else {
	throw new IllegalArgumentException("Sueldo debe ser >= 0");
	}
	}

	public double obtenerSueldo() { return sueldo;
	}

	public double ingresos() { if (horas <= 40) {
	return sueldo * horas;
	} else {
	return 40 * sueldo + (horas - 40) * sueldo * 1.5;
	}
	}

	@Override
	public String toString() {
	return String.format("Empleado por horas: %s%n%s: $%,.2f; %s: %,.2f", super.toString(), "Sueldo por hora", obtenerSueldo(), "Horas trabajadas", obtenerHoras());
	}
	}

