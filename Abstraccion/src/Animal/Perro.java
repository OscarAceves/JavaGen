package Animal;

public class Perro extends Animal {//Herencia de la clase superior Animal

	
		
		//Polimorfear o sobreescribir el metodo heredado
		
		@Override //Con la anotacion "@override", se le dice a Java que el método hacerSonido será sobreescrito
		public void hacerSonido() {
			
			System.out.println("El perro ladra y hace guau");
	
		}//metodo hacerSonido heredado de Animal
		
		
		
		public static void main(String[] args) {	
		
		//Aqui no hay polimorfismo, ya que se instancia un animal generico, y se utiliza su metodo hacerSonido	
			Animal Generico = new Animal(); //Genera un animal generico (abstracto)
			Generico.hacerSonido();
			
		//Generar la instancia del perro
		//SI hay polimorfismo, porque es el equivalente a decir "Se instancia un animal que es un perro"
		//Referenciar primero la clase general, y luego la instancia particular, permite el polimorfismo
			Animal Chilaquil = new Perro();
			
			Chilaquil.hacerSonido();
			//Polimorfismo en tiempo de ejecucion
		
		
		}//Cierre de main
		
}//Cierre de clase Perro		
		
	


