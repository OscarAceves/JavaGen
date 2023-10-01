package loops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		/* Do-While. Evalúa su expresión en la parte inferior del ciclo. POr lo tanto, las declaraciones dentro del bloque "do" siempre se ejecutan al menos una vez*/
		
		//Cuenta del 1 al 10
		int cuenta = 1;
		
		do {
			System.out.println(cuenta);
			cuenta++;
		}while(cuenta <0);//output: 1 , ya que se ejecutó al menos una vez

		
		
		/*
		 Crear programa para un cajero bancario
		 
		  	El programa mostrara 4 opciones:
		  	1. Consultar saldo
		  	2. Ingresar dinero
		  	3. Retirar dinero
		  	4. Salir
		  	
		  - Mostrar mensaje de bienvenida al usuario, darle contexto y solicitar que elija una opcion (Numero)
		  - Mostrar al usuario la opcion que eligio y permitir que elija otra opcion
		  - El usuario puede salir del progrma escribiendo 4 (salir)
		 */
		
		System.out.println("Bienvenido al Banco Generation, elige cualquiera de las opciones, para ello escribe el número que corresponda:");
		System.out.println("1. Consultar saldo");
		System.out.println("2. Ingresar dineros");
		System.out.println("3. Retirar dineros");
		System.out.println("4. Salir");
		
		Scanner skaner = new Scanner(System.in);
		int selectedOption;// = skaner.nextInt();
		//Se tuvo que declarar la variable global y se inicializa una vez dentro del ciclo para que pueda funcionar
		
		do {
			selectedOption = skaner.nextInt();
			
			switch(selectedOption) {
			case 1:
				System.out.println("Consultar saldo");
				break;
			case 2:
				System.out.println("Ingresar dineros");
				break;
			case 3:
				System.out.println("Retirar dineros");
				break;
			case 4:
				System.out.println("Salir");
				break;
				default:
					System.out.println("Elegir una opcion valida");
					break;
			}
		}while(selectedOption !=4);
	
		skaner.close();		
		
		
		
		
	}

}
