package POO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

		//Metodo principal para instanciar mis clases
	public static void main(String[] args) {
		
		/* Se comenta para poder implementar colecciones
		 * 
		//Instancia de Persona
		Persona Oscar = new Persona("Oscar", "Aceves", (byte)31, "3315744876", "example@mail.com");
		
		
		System.out.println(Oscar);//Imprime el lugar en la memoria
		Oscar.imprimirInfo();//Imprime informacion mediante un método
		Oscar.saludar();
		
		
		//Instancia de Dentista
		Dentista Jairo = new Dentista("Dr. Jairo", "Campos", (byte)50, "123456789", "jairo@example.com", "Odontologo", "555555454", "Consultorio 500","avanzado", "matutino", 500);
		System.out.println("****************");
		Jairo.calcularSalario();
		Jairo.imprimirInfoDentista();
		
		
		//Instancia paciente con todos los datos
		Paciente Chencho = new Paciente("CHNCH1234", "RH +", true, true, "05/Oct/2023", "Dr. Jairo Campos", false);
		System.out.println("**************");
		System.out.println(Chencho);
		
		
		//Instancia de paciente con datos obligatorios
		Paciente Masiosare = new Paciente("MAS12345", false, false);
		System.out.println("**************");
		System.out.println(Masiosare);
		
		//Cambiar el false de seguro medico a true
		//Masiosare.seguroGastosMedicos = true;
		System.out.println("**************");
		System.out.println(Masiosare);
		
		Se comenta para poder implementar colecciones*/
		
		
		//Implementación de ArrayList de Dentistas
		List<Dentista> listaDentistasArrayList = new ArrayList<>();
		
		//Se genera una instancia del dentista
		Dentista DrChapatin = new Dentista("Dr.Chapatin", "Chespirito", (byte)75, "1111122222", "chapatin@mail.com", "General", "6665554443", "Consultorio 200", "Avanzado", "matutino", 450);
		
		//Despues se agrega a la lista
		listaDentistasArrayList.add(DrChapatin);
		
		//Si se agrega la instancia a una variable, se puede imprimir su informacion usando un metodo toString, o un metodo mostrarInfo();
		
		
		//Se realiza una instancia y se agrega directamente a la lista
		listaDentistasArrayList.add(new Dentista ("Dr. Jairo", "Campos", (byte)50, "123456789", "jairo@example.com", "Odontologo", "555555454", "Consultorio 500","avanzado", "matutino", 500));
		
		//Si se genera la instancia y se agrega directamente al arrayList, para sacar el dato se tendrá que utilizar un ForEach o algun ciclo para imprimir el dato
		
		
		
		
		
		//Implementacion de la lista de Dentistas con un HashSet
		Set<Dentista> conjuntoDentistas = new HashSet<>();
		
		
		//Agregando Dentista al conjunto
		conjuntoDentistas.add(new Dentista ("Dr. Jairo", "Campos", (byte)50, "123456789", "jairo@example.com", "Odontologo", "555555454", "Consultorio 500","avanzado", "matutino", 500));
		
		
		//Implementación de un HashMap de Dentistas
		Map<String, Dentista> mapaDentistas = new HashMap<>();
		
		//Agregar un dentista al mapa
		mapaDentistas.put("Dr House", new Dentista ("Gregory", "House", (byte)55, "15555559", "house@example.com", "Cirujano", "555555454", "Consultorio 500","avanzado", "vespertino", 1400));
		
		//Imprimir el objeto Doctor
		Dentista doctorBuscado = mapaDentistas.get("Dr House");
		
		//doctorBuscado.imprimirInfoDentista();
		
		System.out.println(doctorBuscado);
		
		
		
		
	}//cierre del metodo main

}//cierre class persona
