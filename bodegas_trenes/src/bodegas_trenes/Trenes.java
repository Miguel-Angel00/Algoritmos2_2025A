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

public class Trenes {

	private String tipo_carga;
	private int carga_max; 
	private int carga_actual;
	
		
	public Trenes() {
		// TODO Auto-generated constructor stub
	}


	public String getTipo_carga() {
		return tipo_carga;
	}


	public void setTipo_carga(String tipo_carga) {
		this.tipo_carga = tipo_carga;
	}


	public int getCarga_max() {
		return carga_max;
	}


	public void setCarga_max(int carga_max) {
		this.carga_max = carga_max;
	}


	public int getCarga_actual() {
		return carga_actual;
	}


	public void setCarga_actual(int carga_actual) {
		this.carga_actual = carga_actual;
	}

}
