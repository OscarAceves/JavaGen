package POO;

public class TestAsistenteDental {
	public static void main(String[] args) {
		
		//Instanciar asistente
		
		AsistenteDental Francisca = new AsistenteDental("05/10/2023", 875.40d);
		
		
		//Impresion de la informacion del asistente
		Francisca.mostrarDatosAsistente();
		
		
		
		//El sueldo de Francisca no es de 875.54, es de 87.54
		//Cambio de sueldo antes del setter
		//Francisca.salario = 87.54;//No se puede modificar así, porque es una variable privada
		
		
		
		//Mostrar solo e sueldo antes del getter
		//System.out.println(Francisca.salario);
		
		
		//cambio de sueldo despues del setter
		Francisca.setSalario(87.54);
		
		//Mostrar sueldo despues del getter
		System.out.println(Francisca.getsalario());
		
		
	}//Cierre del metodo main
}
