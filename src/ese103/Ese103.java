package ese103;

import circle.*;

public class Ese103 {

	public static void main(String[] args) {
		
		//boolean risposta = false;
		// TODO Auto-generated method stub

		Circle a = new Circle(5,4,10);
		Circle b = new Circle(6,6,5);
		Circle c = new Circle(5,4,5);
		Circle d = new Circle(6,6,3);
		
		System.out.println("Cerchio 1 "+a+ "  contiene il cerchio con "+b+"? " +a.contains(b));
		System.out.println("Cerchio 2 "+b+ "  contiene il cerchio con "+a+"? " +b.contains(a));
		System.out.println("Cerchio 1 "+a+ "  contiene il cerchio con "+c+"? " +a.contains(c));
		System.out.println("Cerchio 1 "+a+ "  contiene il cerchio con "+d+"? " +a.contains(d));
	}
	

}
