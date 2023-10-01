package dataTypes;

public class DatosEstructurados {
	public static void main(String[] args) {
		/*
		 Datos estructurados. Son datos complejos que almacenan caracteres y/o cadenas de caracteres o bien, algún tipo de dato primitivo
		  -- String. Cadena de Caracteres, se declaran entre comillas y hay que definir el tipo de dato con la palabra reservada String. Los String en Java se considera n Objetos
		  -- Arrays.
		  -- Creados por el usuario (API Java)
		 */
		String myString = "Hola, soy un string";
		System.out.println(myString);
		
		String helloString = new String("Hola, soy un segundo String");
		System.out.println(helloString);
		
		/*
		 Método para Strings.
		 	-String length. Metodo que permite medir la longitud de una cadena de caracteres
		 */
		String texto = "ASDFGHJKLÑ";
		System.out.println("La longitud de la variable texto de tipo String es: " + texto.length());
		
		/*
		 * Guardando la variable texto en una nueva variable de tipo int para pasarle el método length
		 * int metodoLength = texto.length();
		 *--Output: 10
		 *Imprimimos en consola la nueva variable
		 *System.out.println(metodoLength);
		 */
		
		
		// String : toUpperCase() y toLowerCase()
		String lowerCase = texto.toLowerCase();
		System.out.println("Aplicando metodo toLowerCase: " + lowerCase);
		
		String upperCase = texto.toUpperCase();
		System.out.println("Aplicando metodo toLowerCase: " + upperCase);
		
		
		// indexOf() Devuelve el índice de la primera aparición de un texto especifico
		String fraseMotivacional = "Todo es temporal, echale ganitas";
		int indexOf = fraseMotivacional.indexOf("temporal");//8
		System.out.println("La palabra 'temporal inicia en el indice: " + indexOf);
		
		//concatenacion
		String firstName = "Daniel";
		String lastName = "Maldonado";
		
		String userName = firstName + " " + lastName;
		System.out.println(userName);
		
		System.out.println(firstName.concat(lastName));
		
		//Metodos de conversionv(parseo)
		String presupuesto = "50000";
		System.out.println("El presupuesto es de $" + presupuesto + " y el tipo de dato es " + presupuesto.getClass().getSimpleName());
		
		int parseao = Integer.parseInt(presupuesto);
		System.out.println("Aplicando parseInt, el valor de " + presupuesto + " de tipo " + presupuesto.getClass().getSimpleName() + " ahora es " + parseao + " de tipo " + ((Object)parseao).getClass().getSimpleName());
		//Se debe convertir la variable tipo INT a un objeto, para que pueda decirte el tipo de dato que se está manejando
		
		
		
		
		/*
		 Arrays. Conocidos como arreglos, se trata de una coleccion de datos del mismo tipo donde cada elemento corresponde a una posicion identificadada por indices numericos. Cuando trabajamos con arreglos de dos dimensiones (bidimensionales), usamos el término matriz
		  
		 */
		
		String[] cars = {"volkswagen", "Mazda", "Kia", "Ford"};
		System.out.println(cars);
		
		
		/*
		 Variable por tipo de declaracion
		 	- Variables dinamicas. Son aquellas que se declaran con un valor pero que dicho valor puede cambiar durante el proceso.
		 	- Variables constantes o finales. Su valor no puede modificarse
		 	- Variables literales (palabras reservadas). Su identificador es la representación de su valor y ya tiene un significado en el código fuente de Java 
		 */
		float gastosMensuales = 35684.30f;
		System.out.println(gastosMensuales);
		
		gastosMensuales = 42699.2f;
		System.out.println("Ahora mis gastos mensuales ascienden a " + gastosMensuales);
		
		//Variables finales o constantes
		final int SALARIO = 15000;
		System.out.println(SALARIO);
		
		//Variables literales
		
		
		
		
		
	}

}
