//Utilizar clases abstractas para evitar la instanciacion de objetos que no son necesarios (generalmente son objetos muy abstractos, como Persona, Figura, transporte, Animal, Comida, Arte, Operaciones Matematicas, Lecturas, ropa, Plantas, paises, etc)

package Figura;

//Utilizar clases abstractas, se evita las instancias no necesarias

//Para que una clase se vuelca abstracta, se usa la palabra "abstract" antes de "class"
public abstract class Figura {
	
	//Se declara un metodo abstracto (no tiene cuerpo)
	//Metodo abstracto dice QUE SE TIENE QUE HACER, PERO NO DICE EL COMO.
	public abstract double calcularArea();
	
	
	
}//cierre clase figura



/*
 Nota: Las clases abstractas pierden capacidad de instanciar.
 Una clase abstracta, necesita obligatoriamente metodos abstractos
 Cuando se usan clases abstractas, se está obligado a utilizar todos los métodos abstractos
 
 */