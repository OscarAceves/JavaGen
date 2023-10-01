package controlFlujo;

public class EstructurasControl {//Debe coincidir la clase con el nombre del documento

	public static void main(String[] args) {//Todo el código debe ir dentro del método main
		
		//Para que algo se ejecute, siempre debe ir dentro del metodo principal
		
		//Definir variable de tipo string para almacenar un dato
		
		String citaProgramada = "28-09-23";//La variable se declara inicialmente como null, para tener un espacio de memoria ya asignado para ser llenado despues por una fecha"28-09-23"
		
		if (citaProgramada !=null){
			System.out.println("Fecha ya asignada, elija otra fecha");
		}else {
			System.out.println("Puede registrar su cita");
		}
	//////////////////////////////////////////////////////////////
		
		//Seleccionar una opcion y almacenar la variable opcion
		int opcion = 1;
		
		//Se crea menu
		System.out.println("Menú del Diente Feliz Consultorio Dental");
		System.out.println("1. Programar una cita? ");
		System.out.println("2. Verificar cita programada");
		System.out.println("3. Cancelar cita");
		System.out.println("4. Salir del Menú");
		System.out.print("Seleccione una opción del menú(1-4): ");
		
		
		switch (opcion) {
		
		case 1:
			System.out.println("Usted seleccionó la opcion de programar cita");//Agregar logica para programar cita
			break;

		case 2:
			System.out.println("Usted seleccionó la opcion verificar cita");
			break;
			
		case 3:
			System.out.println("Usted seleccionó la opcion cancelar cita");
			break;
			
		case 4:
			System.out.println("Gracias por comunicarse");
			break;
			
		default:
			System.out.println("La opcion que ha elegido NO es valida, seleccione alguna opción del menú (1-4)");
			break;
		
		}

		
////////////////////////////////////////////////////////////////////////////////////////////////////////
//- Verificar  si la edad del paciente es apta para cierto tratamiento
//- Investigar operador ternario ?:
//- Ejemplo de consultorio

//Ingresando una edad del paciente
int edadPaciente = 20;

System.out.println("Evaluando si el paciente es apto para medicamento...");

//Condicion if
if (edadPaciente >= 18){
System.out.println("Podemos otorgar su medicamento respectivo :)");
} else {
System.out.println("Lo sentimos, no podemos otorgarle un medicamento :(");
} 

//- Operador ternario ejercicio

String estado = (edadPaciente >= 60) ? "es de la tercera edad, requiere atencion especial" : "no es de la tercera edad, no requiere atencion especial";

System.out.println("El paciente " + estado);
		
		

	}//Se cierra metodo main

}//cierre de clase
