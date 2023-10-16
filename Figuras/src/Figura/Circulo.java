package Figura;


//Herencia de la clase abstracta Figura
public class Circulo extends Figura {
	
	//1. Atributos
	double pi;
	double radio;
	
	//2. Constructor
	Circulo (double pi,	double radio){
		this.pi = pi;
		this.radio = radio;
	}//Cierre constructor
	
	
	//3 Metodos(metodo abstracto heredado de figura)
	@Override
	public double calcularArea() {
		double areaCirculo = pi * (radio*radio);
		return areaCirculo;
	}//cierre metodo calcularArea
	

}//Cierre clase circulo
