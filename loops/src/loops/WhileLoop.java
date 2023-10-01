package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 while. El ciclo while ejecuta continuamente un bloque de codigo hasta que se cumpla una condicion dada.
		 
		 while(expresion){
		 //bloque de codigo a ejecutar
		 (contador - iterador)
		 }
		 */
		
		/*int cuenta = 1;
		while (cuenta < 11) {
			System.out.println("La cuenta es de " + cuenta);
			cuenta++;
		}*/
		
		int cuenta = 0;
		while (cuenta < 10) {
			cuenta++;
			System.out.println("La cuenta es de " + cuenta);
		}
		
		
		
		/*Crear un programa que solicite al usuario un número. Dicho número será tomado como el número final de una cuenta. Dicha cuenta inicia en 1. Debe mostrar en consola la cuenta del 1 hasta el número proporcionado.
		 
		 1. Importar un scanner e implementarlo
		 2. Mensaje para dar contexto al usuario
		 3. Almacenar el valor del usuario en una variable
		 4. Guardar un numero inicializador en una variable (1)
		 5. Implementar ciclo While
		 6. Mostrar por consola en resultado		  
		*/
		
		//1. Crear e Importar el scanner
		Scanner scanner = new Scanner(System.in);//se le da click en Scanner y se selecciona importar, se ve en las primeras líneas antes del main
		
		System.out.println("Escribe un numero que servirá como numero final de una cuenta");
		
		int numFinal = scanner.nextInt();
		
		int numInicial = 1;
		
		while(numInicial <= numFinal) {
			System.out.println("La cuenta va en " + numInicial);
			numInicial++;
		}
		
		scanner.close();
		
		

	}

}
