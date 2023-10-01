package dataTypes;

public class DatosPrimitivos {
	public static void main (String[] args) {
		//System.out.println("Hola");
		
		/*
		 Datos primitivos. Datos fundamentales en Java que sirven para gestionar  los tipos de información más básicos
		 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, double, boolean, char
		 */
		//byte age = 28;
		//System.out.println(age);
		//sysout + ctrl + espacio : se autocompleta la impresión
		//syso + ctrl + espacio : se autocompleta la impresión
		
		
		
		
		//Byte valor mínimo y máximo
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
		
		System.out.println("El valor máximo de Byte es: " + maxByte);
		System.out.println("El valor mínimo de Byte es: " + minByte);
		
		
		//short valor mínimo y máximo
		short maxShort = Short.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		
		System.out.println("El valor máximo de Short es: " + maxShort);
		System.out.println("El valor minimo de Short es: " + minShort);
		
		//char valor mínimo y máximo
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		
		System.out.println("El valor máximo de char es: " + maxChar);
		System.out.println("El valor minimo de char es: " + minChar);
		
		//long
		long isbn = 9788499169019L;	//Se debe indicar con una "L" que es un dato de tipo long	
		System.out.println(isbn);
		
		//float
		float salary = 15000f;//Se debe indicar por buena fráctica con un "f" que es un dato de tipo float
		System.out.println(salary);
		
		//double
		double ISR = 1239.45d;//Se debe indicar por buena fráctica con un "d" que es un dato de tipo double
		System.out.println(ISR);
		
		//Int valor mínimo y máximo
		int minInteger = Integer.MIN_VALUE;
		int maxInteger = Integer.MAX_VALUE;
		
		System.out.println("El valor máximo de int es: " + maxInteger);
		System.out.println("El valor minimo de int es: " + minInteger);
		
		//long valor mínimo y máximo
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		
		System.out.println("El valor máximo de long es: " + maxLong);
		System.out.println("El valor minimo de long es: " + minLong);
		
		//float valor mínimo y máximo
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		
		System.out.println("El valor máximo de float es: " + maxFloat);
		System.out.println("El valor minimo de float es: " + minFloat);
		
		//Double valor mínimo y máximo
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		
		System.out.println("El valor máximo de double es: " + maxDouble);
		System.out.println("El valor minimo de double es: " + minDouble);
		
		//Se toma valor decimal de la tabla ASCII
		char valorChar1 = 64;// Esperado : @
		char valorChar2 = 60;//Esperado : <
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		
		
		/*
		 Casteo (Conversion de tipos en Java).
		  Automatico (dato más pequeño a dato más grande)
		  Manual (tipo de dato más grande a dato mas pequeño)
		 */
		
		//Automatico
		int myNumber = 125;
		System.out.println(myNumber);
		//int < double
		double myCasting = myNumber;
		System.out.println(myCasting);
		
		
		short edad = 25;
		int valorEdad = edad;
		System.out.println(edad);
		System.out.println(valorEdad);
		
		
		
		//Manual
		int myNewCasting = (int) myCasting;
		System.out.println(myNewCasting);
		
		//float to int
		float myFloat = 1.99f;
		System.out.println(myFloat);
		
		int myNewFloat = (int)myFloat;
		System.out.println(myNewFloat);//Se redondea hacia abajo
		
		//convertir de char a int
		
		char myChar = 'M';
		
		int myNewChar = myChar;
		System.out.println(myNewChar);
		
		
		
		
		
		
		
		
		
	
	}//cierre de main

}//cierre de class
