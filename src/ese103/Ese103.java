package ese103;

import geometricshape.*;
/**
 * 
 * @author Lorenzo Carfagna
 *
 */
public class Ese103 {

	public static void main(String[] args) {
		
		int i;
		Circle a,b,c;
		// TODO Auto-generated method stub
		
		Circle cerchi[] = new Circle[4];

		cerchi[0]= new Circle(2,2,1);
		cerchi[1]= new Circle(3,3,1);
		cerchi[2]= new Circle(5,6,1);
		cerchi[3]= new Circle(2,2,2);
		
		System.out.println("Valore atteso per XMin del cerchio con "+cerchi[0]+" : 1  valore restituito"+cerchi[0].getXMin());
		System.out.println("Valore atteso per YMin del cerchio con "+cerchi[0]+" : 1  valore restituito"+cerchi[0].getYMin());
		System.out.println("Valore atteso per XMax del cerchio con "+cerchi[0]+" : 3  valore restituito"+cerchi[0].getXMax());
		System.out.println("Valore atteso per YMax del cerchio con "+cerchi[0]+" : 3  valore restituito"+cerchi[0].getYMax());
		
		for(i=0;i<cerchi.length;i++){
			a=cerchi[i];
			b=cerchi[(i+1) % cerchi.length] ;
			if(a.contains(b))
				System.out.println("Il cerchio con "+a+" CONTIENE il cerchio "+b);
			else
				System.out.println("Il cerchio con "+a+" NON CONTIENE il cerchio "+b);
		}
		
		System.out.println("Inizialmente il cerchio aveva  "+cerchi[0]);
		cerchi[0].setR(5);
		cerchi[0].setXC(4);
		cerchi[0].setYC(3);
		System.out.println("ora ha coordinate ("+cerchi[0].getXC()+","+cerchi[0].getYC()+") e raggio="+cerchi[0].getR());
		
		
		c = new Circle(4,3,5);  // imposto campi di c uguali a quelli di cerchi[0]
		System.out.println("Il cerchio con "+cerchi[0]+"  e' uguale al cerchio"+cerchi[1]+"?------>"+cerchi[0].equals(cerchi[1])); //prova campi differenti
		System.out.println("Il cerchio con "+cerchi[0]+"  e' uguale al cerchio"+c+"? (stessa istanza)----->"+cerchi[0].equals(c)); //prova stessi campi
		System.out.println("Il cerchio con "+cerchi[0]+"  e' uguale al cerchio"+c+"?------> "+cerchi[0].equals(cerchi[0])); //prova stessa istanza
		
	}
	

}
