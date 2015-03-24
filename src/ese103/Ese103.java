package ese103;
import geometricshapes.*;
/**
 *
 * @author Lorenzo Carfagna
 * 
 */


// 	TUTTI GLI ALTRI TEST SONO STATI FATTI NEI PASSI PRECENDENTI.

public class Ese103 {
	public static void main(String[] args) throws Exception {
		GeometricShape figure[]= new GeometricShape[5];
		
		figure[0]= new Circle(0,0,1);
		figure[1]= new Circle(0.5,0.5,0.5);
		figure[2]= new Circle(1,1,1);
		figure[3]= new Triangle(0,0,1);
		figure[4]= new Triangle(-2,-2,4);
		
		GeometricShape a,b;
		
		for(int i=0;i<figure.length;i++){
			a=figure[i];
			for(int j=0;j<figure.length;j++){
				b=figure[j];
				if(a!=b){
					if(a.contains(b)==true){
						System.out.println(a+" CONTIENE "+b);
					}
					else System.out.println(a+" NON CONTIENE "+b);
				}
				
			}
		}
	}
}