package unidad2_POO;
import java.util.Date;
public class Empleado {
	//Atributos:
	private String nombre, direccion, telefono, tipo, eps, pension;
	private double salario_base;
	private Date fechanac;
	private static float SALARIO_MINIMO = 1423000.0f;
	/*Constructor de la clase empresa: crea un objeto de esta clase
	 * Sin atributos inicializados
	 * /
	 */
public Empleado() {
	
}

public Empleado(String nombre, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

public Empleado(String nombre, String direccion, String telefono, String tipo, String eps, String pension,
			double salario_base, Date fechanac) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipo = tipo;
		this.eps = eps;
		this.pension = pension;
		this.salario_base = salario_base;
		this.fechanac = fechanac;
	}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	if (!nombre.isEmpty())
		this.nombre = nombre;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	if(!direccion.isEmpty())
		this.direccion = direccion;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	if(!telefono.isEmpty())
		this.telefono = telefono;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getEps() {
	return eps;
}
public void setEps(String eps) {
	this.eps = eps;
}
public String getPension() {
	return pension;
}
public void setPension(String pension) {
	this.pension = pension;
}
/*
 * Este metodo permite consultar el valor del atributo salario_base
 */
public double getSalario_base() {
	return salario_base;
}
/*
 * Este metodo permite cambiar el valor del atributo salario_Base
 * permite controlar la logica de la modificacion del atributo @param salario_ base
 */
public void setSalario_base(double salario_base) {
	if (salario_base >= SALARIO_MINIMO) {
		this.salario_base = salario_base;
	}
}
public Date getFechanac() {
	return fechanac;
}
public void setFechanac(Date fechanac) {
	this.fechanac = fechanac;
}




}
