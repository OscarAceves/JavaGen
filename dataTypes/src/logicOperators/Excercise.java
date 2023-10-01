package logicOperators;

public class Excercise {

	public static void main(String[] args) {
		//Enrique, Paola y Mariana se dirigen a la MacStore y deciden comprar un iPhone 15 cada uno, con un precio de $20,000. La tienda tiene una promoción por el mes patrio: "Si el total de tu compra supera los 25 mil pesos, obtén un 10% de descuento". Enrique, Paola y Mariana deciden comprar los tres equipos con una sola tarjeta. Al llegar a caja, la cajera les menciona que la tienda en estos momentos cuenta con una promoción de 12 meses sin intereses, por lo tanto, deciden pagar con la TDC de Mariana. ¿Cuál sería el costo total por los 3 equipos sin descuento? ¿Aplicaría el descuento en su compra? ¿Cuál sería el costo total con el descuento aplicado? ¿Cuánto pagarían mensualmente?
		
	int iphonePrice = 20000;
	int totalBuyers = 3;
	float discountPlus25 = 0.1f;
	int MSI = 12;
	boolean monthSeptember = true;
	//float totalPrice = null;
	
	
	float iphoneTotal = iphonePrice * totalBuyers;
	System.out.println("El precio total es: $" + iphoneTotal);
	
	if(iphoneTotal >= 25000 && monthSeptember == true){
		System.out.println("Felicidades, eres acredor a un descuento del 10%!");
		float discountPrice = iphoneTotal - (iphoneTotal * discountPlus25); 		
		System.out.println("El nuevo precio es: $" + discountPrice);
		
		System.out.println("Eres acreedor a la promoción de 12 meses sin intereses con tu tarjeta de Crédito");
		float monthlyPay = discountPrice / MSI;
		
		System.out.println("El pago mensual sería de: $" + monthlyPay);
		
	}else {
		System.out.println("El precio total sin descuento es: $" + iphoneTotal);
		System.out.println("Eres acreedor a la promoción de 12 meses sin intereses con tu tarjeta de Crédito");
		float monthlyPay = iphoneTotal / MSI;
		System.out.println("El pago mensual sería de: $" + monthlyPay);
	}
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
