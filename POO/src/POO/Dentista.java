package POO;

public class Dentista extends Persona{//Se realiza el extens para poder heredar informacion de otra clase

	
	//1. Atributos
	
	/*
	 Ya no se crean valores como nombre, edad, apellido, etc., porque estos valores se van a heredar de la clase Persona
	 */
	
	


	String especialidad;
	String cedula;
	String consultorioAsignado;
	String experiencia;
	String turno;
	int salario;
	
	
	//2 Constructor
	public Dentista(String nombre, String apellido, byte edad, String telefono, String email, String especialidad,String cedula, String consultorioAsignado, String experiencia, String turno, int salario) {
		
		super(nombre, apellido, edad, telefono, email);//informacion traída de la clase Persona
		
		//Información clase Dentista
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.consultorioAsignado = consultorioAsignado;
		this.experiencia = experiencia;
		this.turno = turno;
		this.salario = salario;
		
	}//cierre constructor Dentista con información heredada
	
	
	
	
	//3 Metodos (Metodo para calcular salario basado en la experiencia)
	//Experiencia = basico, intermedio, avanzado
	
	//Si el dentista esta en rango basico, gana 30,000. Si es intermedio, gana 40000, si es avanzado gana 50000
	
	void calcularSalario() {
		//logica de programación
		if (experiencia.equals("basico")){
			salario = 30000;
		}else if (experiencia.equals("intermedio")) {
			salario = 40000;
		}else if (experiencia.equals("avanzado")){
			salario = 50000;
		}
	}//Cierre de calcular salario
	
	
	void imprimirInfoDentista(){
		System.out.println("La especialidad: " + especialidad);
		System.out.println("El salario es: " + salario);
	}//Cierre de imprimirInfoDentista




	@Override
	public String toString() {
		return "Dentista [especialidad=" + especialidad + ", cedula=" + cedula + ", consultorioAsignado=" + consultorioAsignado + ", experiencia=" + experiencia + ", turno=" + turno + ", salario=" + salario	+ ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono	+ ", email=" + email + "]";
	}
	
	
		
	

	
	
	
}//cierre de clase Dentista
