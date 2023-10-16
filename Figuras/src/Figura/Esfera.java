package Figura;

//Clase concreta que implementa metodos de una interfaz llamada calculable
public class Esfera implements Calculable{
	double radio;
	double pi = 3.1416;

	@Override
	public double calcularArea() {
				//Area  A = 4 π r^2	
		double area = (4 * pi)*(radio*radio);
		return area;
	}

	@Override
	public double calcularVolumen() {
		//Volumen V = 4/3 π r³
		double volumen = (4/3) * pi * (Math.pow(radio, 3));
		return volumen;
	}

	@Override
	public double calcularPerimetro() {
		//Perimetro P = 2 * π * r
		double perimetro = 2 * pi * radio;
		return perimetro;
	}
	
	
	
	
}//Cierre clase esfera
