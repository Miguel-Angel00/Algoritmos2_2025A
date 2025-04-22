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

import java.util.Scanner;


public class Principal {
	
	public static void clear() {
		for(int i = 0; i <= 50; i++) {
			System.out.println();
		}
		
	}
	
	
	public static Bodegas crear_bodega(int Peso, String tipo_almacenamiento) {	
		
		Bodegas bodega1  = new Bodegas();
		bodega1.setCapacidad_ton(Peso);
		return bodega1;
		
		
		
		
	}

	public static void main(String[] args) {
		boolean opcion_valida = false;
		System.out.println("Que desea hacer");
		while (opcion_valida == false) {
			
			System.out.println("A. crear nueva bodega\nB. Crear nuevo tren \nC. Almacenar bodegas");
			Scanner sc = new Scanner(System.in);
			String opcion = sc.nextLine().toUpperCase();
			if (opcion.equals("A")) {
				clear();
				
				
			}
			if (opcion.equals("A") || opcion.equals("B") || opcion.equals("C")) {
			opcion_valida = true;
			
			}
		}
			
		
		
		
		
		
		
		
	
}
}
