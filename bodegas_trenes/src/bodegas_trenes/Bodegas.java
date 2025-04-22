/*El sistema debe permitir administrar la información de mínimo una bodega y máximo 10 bodegas.
Cada bodega puede recibir y alojar de 1 a 5 trenes (las bodegas pueden estar vacías)
Para cada bodega se maneja un identificador entero, una dirección, una capacidad máxima (en toneladas), una capacidad máxima (en n° de trenes), el uso actual (en toneladas) y el uso actual (en n° de trenes). Además, cada bodega tiene como atributo el tipo de carga que puede almacenar: alimentos o insumos químicos.
Cada tren maneja un tipo de carga, un identificador, una carga máxima (en toneladas), una carga actual (en toneladas), y un tipo de carga (como las bodegas)
 * Funcionalidades:
Agregar una nueva bodega con sus características
Crear un nuevo tren
Recibir un tren en una bodega
Dar salida a un tren de una bodega
 * Restricciones:

Una bodega no puede recibir un tren cuya carga no coincida
Al recibir un tren en una bodega, debe validarse que no se alcance su límite de almacenamiento.*/




package bodegas_trenes;

public class Bodegas {
	private int id_bodega;
	private int capacidad_trenes = 5;
	private int capacidad_ton = 10;
	private String tipo_almacenamiento;
	private int cap_ton_actual;
	private int cap_tren_actual;
	
	

	public Bodegas(int id_bodega, String tipo_almacenamiento ) {
		// TODO Auto-generated constructor stub
	}



	public int getCapacidad_trenes() {
		return capacidad_trenes;
	}



	public void setCapacidad_trenes(int capacidad_trenes) {
		this.capacidad_trenes = capacidad_trenes;
	}



	public int getCapacidad_ton() {
		return capacidad_ton;
	}



	public void setCapacidad_ton(int capacidad_ton) {
		this.capacidad_ton = capacidad_ton;
	}

	public int getCap_ton_actual() {
		return cap_ton_actual;
	}



	public void setCap_ton_actual(int cap_ton_actual) {
		this.cap_ton_actual = cap_ton_actual;
	}



	public int getCap_tren_actual() {
		return cap_tren_actual;
	}



	public void setCap_tren_actual(int cap_tren_actual) {
		this.cap_tren_actual = cap_tren_actual;
	}



	public int getId_bodega() {
		return id_bodega;
	}



	public void setId_bodega(int id_bodega) {
		if (id_bodega >= 1 && id_bodega <= 10) {
			this.id_bodega = id_bodega;
		}
		
	}



	public String getTipo_almacenamiento() {
		return tipo_almacenamiento;
	}



	public void setTipo_almacenamiento(String tipo_almacenamiento) {
		String[] tipos_almacenamiento = {"alimentos", "insumos quimicos"};
		if (tipo_almacenamiento.toLowerCase().equals(tipos_almacenamiento[0]) || tipo_almacenamiento.toLowerCase().equals(tipos_almacenamiento[1])) {
			this.tipo_almacenamiento = tipo_almacenamiento;
		}
		
	}

}
