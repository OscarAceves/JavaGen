//En esta clase se hereda el atributo de la clase abstracta "figura", y se va a sobreescribir


package Figura;

//Se aplica herencia
public class Rectangulo extends Figura{

	//Parámetros
	double base;
	double altura;
	
	
	//Constructor
	Rectangulo (double base, double altura){
		this.base = base;
		this.altura = altura;
	}//cierre constructor
	
	
	//Metodos
	@Override
	public double calcularArea() {
		double formulaRectangulo = base * altura;
		return formulaRectangulo;
	}//cierre metodo calcular area

}//cierre figura
