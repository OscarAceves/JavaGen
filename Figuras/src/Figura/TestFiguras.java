package Figura;

public class TestFiguras {

	public static void main(String[] args) {
		//Generar instancias de las clases
		
		
		//1. Instancia clase Figura
		//Figura Generica = new Figura(); //Error por ser una clase abstracta
		
		
		//2. Instancia de rectangulo
		Figura rectangulo = new Rectangulo(5.0, 6.5);

		//3. Instancia de un circulo
		Figura circulo = new Circulo(3.14, 3.0);
		
		//invocación del método
		System.out.println(rectangulo.calcularArea());
		System.out.println(circulo.calcularArea());
		
		
		
		

	}

}
