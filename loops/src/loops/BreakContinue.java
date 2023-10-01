package loops;

public class BreakContinue {

	public static void main(String[]args) {
		/*
		 Sentencias utilizadas en loops:
		 	- break. se utiliza para salir de un bucle en un punto específico
		 	- continue. Interrumpe la iteracion de un bucle, si se produce una condicion especifica y continua con la siguiente
		 */
		
		//Super otzito va a realizar una rifa en la cual el cliente numero 5 se ganará una coca-cola de bolsita
		
		
		//Con break finalizando el bucle antes de llegar a la condición final
		for (int cliente = 1; cliente <=20; cliente++) {
			if(cliente == 5) {
				System.out.println("Eres el cliente numero " + cliente + " GANASTE!");
				break;
			}
			System.out.println("Cliente numero " + cliente);
		}
		
		//Con continue finalizando el bucle antes de llegar a la condición final
				for (int cliente = 1; cliente <=20; cliente++) {
					if(cliente == 5) {
						System.out.println("Eres el cliente numero " + cliente + " GANASTE!");
						continue;
					}
					System.out.println("Cliente numero " + cliente);
				}
		
		
		
	}
}
