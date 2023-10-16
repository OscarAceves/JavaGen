package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		//Array
		//Tipo de dato del array, nombre, instancia del objeto arreglo, los datos
		String[] listaCompras = new String[] {"Leche", "Pan", "Huevos"};
		
		System.out.println(listaCompras);
		
		//Imprimirinfo de listaCompras con un ForEach
		//Para el dato de tipo String que llamaremos productoAImprimir de la lista de compras, lo vamos a tomar y lo vamos a imprimir
		for(String productoAImprimir : listaCompras) {
			System.out.println(productoAImprimir);
		}
		
		
		
		
		//Implementacion de un arrayList
		//Clase General (interfaz), tipo de datos que se usará, nombre de la estructura de datos, instancia de dicha clase general
		List<String> listaContactos = new ArrayList<>();
		
		//Se agregan elementos del tipo String al arrayList llamado listaContactos
		listaContactos.add("Felipe");
		listaContactos.add("Roberto");
		listaContactos.add("Fatima");
		listaContactos.add("Alicia");
		
		//Obtener un elemento de la lista - asignar a una variable
		String datoFelipe = listaContactos.get(0);
		
		System.out.println(datoFelipe);
		
		
		//Borrar un elemento
		listaContactos.remove(2);
		
		System.out.println(listaContactos);
		
		/*for(String contactoAImprimir : listaContactos) {
			System.out.println(contactoAImprimir);
		}*/
		
		
		
		
		//Implementacion de un conjunto (Set)
		//Sintaxis
		//Interface donde implemento + tipo de dato que se usará + nombre del conjunto + instancia de la clase específica
		
		Set<String> cartasJuego = new HashSet<>();
		
		//Agregar elementos
		cartasJuego.add("As de corazones");
		cartasJuego.add("2 de picas");
		cartasJuego.add("Reina de tréboles");
		
		
		//No es posible saber posiciones, solo saber si lo contiene
		if(cartasJuego.contains("Reina de tréboles")) {
			System.out.println("La carta SI esta en el conjunto");
		}else {
			System.out.println("No se encontró el elemento solicitado");
		}
		
		
		
		//Implementación de un mapa (HashMap)
	   //      K      V    
		Map<String, String> libretaDirecciones = new HashMap<>();
 		
				
		//Agregar elementos a la libreta de direcciones, Donde la K=nombre y V=dirección
		libretaDirecciones.put("Felipe", "Tlalnepantla");
		libretaDirecciones.put("Doctor Simi", "CDMX");
		
		//Metodo para sacar informacion de la libreta, creando una nueva variable
		String direccionFelipe = libretaDirecciones.get("Felipe");
		String direccionSimi = libretaDirecciones.get("Doctor Simi");
		String direccionInexistente = libretaDirecciones.get("Desaparecido");//null
		
		//impresion
		System.out.println(direccionFelipe);
		System.out.println(direccionSimi);
		System.out.println(direccionInexistente);
		
		

	}//cierre main

}//cierre colecciones



/*
 *Colecciones
 *
 * 	-Arrays
 *	Es una estructura de datos lineal que contiene elementos del mismo tipo. Lops elementos almacenados de forma contigua (uno al lado del otro), y se pueden acceder a ellos a traves de un índice. Las principales caracteristicas de un array son:
 *
 *		- Es una estructura de datos fija, generalmente almacena datos del mismo tipo.
 *		- La longitud de un array se establece al momento de crearlo, y no cambia
 *		- Se puede acceder a elementos por medio de un indice
 *		- Los arrays pueden contener datos primitivos y objetos
 *		- No proporciona metodos adicionales para agregar o eliminar elementos.
 *
 *
 *Un ejemplo de un array es una lista de compras del supermercado
 * 
 * 
 * 
 * 
 * 
 * 
 *  - ArrayList
 *  
 *  Es una implementacion de una lista (List), es decir, que esta en un nivel abajo de las listas. Utiliza un array dinámico que permite almacenar datos.
 *  
 *  Sus principales caracteristicas son:
 *  
 *  - Tamaño donamico. A diferencia de los arrays tradicionales, el tamaño de un arrayList si se puede modificar.
 *  - Acceso rapido. Se puede acceder al elemento del aarrayList por su posición o indice
 *  - Coste elevado al momento de insertar o eliminar elementos. Si se agrega un elemento, se tiene que recorrer todos los demas elementos.
 * 
 * 
 * 
 * 
 * Set (conjunto)
 * 
 * Estructura de datos que almacena datos unicos sin orden específico. Las principales caracteristicas del Set son:
 * 	
 * 	- No hay elementos duplicados, ya que losconjuntos no los pueden contener. Si se intenta agregar un elemento ya existente, la operacion se ignora.
 * 	- No hay un orden específico, los elementos se almacenan sin orden especifico
 * 	- La busqueda es mas sencilla, ya que al no tener elementos duplicados se usa una funcion hash para encontrar el elemento deseado
 * 
 * 
 * 
 * 
 * Map (mapas)
 * Un mapa es una estructura de datos que almacena pares de clave-valor.
 * 
 * 	- Almacenamiento con pares K-V (hey-value)
 * 	- Sin orden especifico (similar a un set)
 * 	- Busqueda rápida, la busqueda se hace por medio de un valor (key), y usa una función interna hash para buscar elementos.
 * 
 * 
 * 
 * Agenda telefonica (agregar, modificar, eliminar)
 * 
 * 
 * 
 */
 