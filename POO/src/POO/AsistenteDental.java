package POO;

public class AsistenteDental {

	//1. Atributos privados
	private String fechaIngreso;
	private double salario;
	
	
	//2. Constructor publico (Se mantiene el constructor público para mantener el acceso sencillo)
	public AsistenteDental(String fechaIngreso, double salario) {
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
		
	}//se cierra constructor
	
	
	//3. Metodos
	
	//Metodo para imprimir información
	public void mostrarDatosAsistente() {
		System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
		System.out.println("El salario del asistente es: " + salario);
	}//Cierra metodo imprimir informacion
	
	
	//Crear Getters y setters para poder acceder a los datos privados y poder realizar operaciones con ellos.
	//Sin getters, la informacion aparece en null
	//Sin setter, no se puede cambiar la información
	
	
	//Getter que permite retornar el dato de la fecha de ingreso en formato String 
	public String getfechaIngreso() {
		return fechaIngreso;
	}//cierra getter fecha
	
	//getter para salario
	public double getsalario() {
		return salario;
	}//cierra getter salario
	
	//setter para salario (modificacion de datos)
			public void setSalario(double nuevoSalario) {
				if(nuevoSalario >= 0 && nuevoSalario < 100) {
					salario = nuevoSalario;				
				}//Cierre if
			}//cierre salario con setter
	
	
}
