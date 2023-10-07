package POO;

public class Persona {

	/*public static void main(String[] args) {
		// La funcion principal del metodo main es ejecutar todo lo que esté en su interior
		}*/

	//1. Atributos (Info de como se mostrara el objeto cuando se instancia)
	String nombre;
	String apellido;
	byte edad;//para tener una correcta asignacion de memoria
	String telefono;
	String email;
	
	
	//2. Constructor con parametros
	Persona(String nombre, String apellido, byte edad, String telefono, String email){
		this.nombre= nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.email = email;
	}//cierre del Constructor
	
	
	//3. Metodos (Lo que puede hacer el objeto)
	void imprimirInfo (){
		System.out.println("El nombre es: " + nombre);
		System.out.println("El apellido es: " + apellido);
		System.out.println("El edad es: " + edad);
		System.out.println("El telefono es: " + telefono);
		System.out.println("El email es: " + email);
	}//cierre imprimirInfo
	
	
	void saludar() {
		System.out.println("Saludos!");
	}//cierre saludar

	
	//toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono + ", email=" + email + "]";
	}
	
	
	
	
	//4. Instancia
	
	
	
}//Cierre de POO
