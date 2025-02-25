package unidad1;

import java.util.Scanner;

public class EjercicioCiclos {
	public static void main(String[] args) {
		int tope, recolectado, num_personas, aporte_persona;
		Scanner lector = new Scanner(System.in);
		tope = 80000;
		recolectado = 0;
		System.out.println("cuantas personas van a aportar\n");
		num_personas = lector.nextInt();
		for(int i = 1; i <= num_personas && recolectado < tope; i++) {
			System.out.printf("\nCuanto va a aportar el estudiante %d\n", i);
			aporte_persona = lector.nextInt();
			recolectado = recolectado + aporte_persona;
			System.out.printf("\nRecolectado hasta ahora %d\n", recolectado);
			
			
		}
		
		
		
	}

}
