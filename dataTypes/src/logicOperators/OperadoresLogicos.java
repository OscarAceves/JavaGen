package logicOperators;

public class OperadoresLogicos {
	public static void main(String[] args) {
		/*
		 Operadores aritmeticos (+, -, *, /, %)
		 Operadores logicos
		 Operadores relacionales (=, +=, -=, *=, /=, <, >, <=, >=)
		 */
		
		float num1 = 12f;
		float num2 = 7f; //Mala practica nombrar num1
		
		float resultado = num1 / num2;
		System.out.println(resultado);
		
		
		/*Relacionales
		= asignación
		+= asignación suma
		-= asignación resta
		*= asignación multiplicación
		/= asignación división
		== igual que
		!= distinto que
		< menor que
		> mayor que
		<= menor igual que
		>= mayor igual que
*/
		System.out.println(num1 >= num2);//true
		System.out.println(num1 <= num2);//false
		
		
		/*
		 Operadores lógicos
		 AND (&&)
		 OR (||)
		 NOT (!)
		 */
		
		int numeroUno =5;
		int numeroDos = 7;
		
		boolean comparacionUno = numeroUno ==numeroDos;
		System.out.println(comparacionUno);
		
		
	boolean comparacionDos =(numeroUno < numeroDos) && (numeroUno > numeroDos);
	System.out.println(comparacionDos);
	
	boolean comparacionTres =(numeroUno < numeroDos) || (numeroUno > numeroDos);
	System.out.println(comparacionTres);
	
	boolean comparacionCuatro = false;
	System.out.println(!comparacionCuatro);
		
	}

}
