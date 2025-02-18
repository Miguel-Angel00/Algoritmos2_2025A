package unidad;

import java.util.Scanner;

public class Fabula {

		public static void main(String[] args) {
			int avance_t, avance_l, pasos_totales, pasos_t, pasos_l, distancia;
			Scanner lector = new Scanner(System.in);
			distancia = 20;
			avance_t = 0;
			avance_l = 0;
			
			//pedir al usuario pasos dados por la tortuga y la liebre en cada iteración,
			//mientras ninguno de los dos haya llegado aún
			
			//MIENTRAS AVANCE:T < DISTANCIA && AVANCE_T < DISTANCIA
			while(avance_t < distancia && avance_l < distancia) { //!!!!!!!!!!!
				
			
			//PEDIR PASOS DE LA TORTUGA:
			System.out.println("\nIngrese el numeor de pasos que avanza la tortuga;");
			pasos_t = lector.nextInt();
			
			
			//PEDIR PASOS DE LA LIEBRE:
			System.out.println("\nIngrese el numeor de pasos que avanza la liebre;");
			pasos_l = lector.nextInt();
			
			
			
			
			//SUMAR PASOS DE LA TORTUGA:
			avance_t = avance_t + pasos_t;
			
			
			//SUMAR PASOS DE LA LIEBRE:
			avance_l = avance_l + pasos_l;
			
			
			//MOSTRAR INFORMACION:
			System.out.printf("\nTortuga ha avanzado %d\nliebre ha avanzado %d", avance_t, avance_l);
			}
			
			
			
			if(avance_t >= distancia && avance_l < distancia) {
				System.out.println("\nLa tortuga ha ganado");
				
			}
			else {
				if(avance_l >= distancia && avance_t < distancia) {
					System.out.println("\nLa liebre ha ganado");
					
				}
				else {
					System.out.println("\nHa habido un empate");
				}
				
			}

			
			
			
			
		}
}
//Pedir un numero al usuario si es multiplo de 3 imprimir "FIZZ" si es multipl ode 3 "BUZZ" si es multiplo de ambos "FIZZBUZZ"
//SERIE ALTERNANTE
//PEDIR AL USUARIO
//INICIO = 1
//NUMERO DE TERMINOS: 6
//1, -2, 3, -4, 5, -6
