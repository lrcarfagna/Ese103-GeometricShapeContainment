package ese103;

import circle.*;

public class Ese103 {

	public static void main(String[] args) {
		
		//boolean risposta = false;
		// TODO Auto-generated method stub

		Circle a = new Circle(5,4,10);
		Circle b = new Circle(6,6,5);
		
		System.out.println("Il cerchio"+a+ "contiene il cerchio"+b+": " +a.contains(b));
		System.out.println("Il cerchio"+b+ "contiene il cerchio"+a+": " +b.contains(a));
	}

}
