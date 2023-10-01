package loops;

public class ForLoop {
	public static void main (String[] args) {
		/*
		 El ciclo for proporciona na forma compacta de iterar sobre valores
		 
		 Estructura:
		 for(inicializacion; condicion; contador(incremento/decremento)){
		 //Bloque de código
		 }
		 */
		
		//for con variable local
		for(int numero = 1; numero <= 10; numero++) {
			System.out.println("Numero igual a " + numero);
		}
		
		//for con variable global
		int contador;
		
		for(contador = 1; contador <=5; contador++){
			System.out.println("La cuenta es " + contador);
		}
		
		/*
		 * Bucles anidados. Bucle dentro de otro bucle
		 */
		//Imprimir una forma triangular de asteriscos
		
		int filas = 5;
		
		for (int i = 0; i < filas; i++) {
			
			//Bloque de codigo que va a iterar sobre el primer bucle
			for (int j = 0; j <= i; j++) {
				System.out.print("*");//Aqui se retira el "ln" para que no de salto de linea en cada impresion
			}
			System.out.println("");
		}
		
		//Java API - Math
		//Calcular 5 potencias del valor Pi y mostrar en consola el valor de cada una de ellas.
		
		System.out.println("El valor de PI es " + Math.PI);
		
		int potencias = 5;
		for (int base = 1; base <= potencias; base++) {
			double resultado = Math.pow(Math.PI,base);
			System.out.println("Pi levado a la " + base + " es igual a " + resultado);
		}
		
		
		
		
		
		
		
	}

}
