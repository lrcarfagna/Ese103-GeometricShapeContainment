package ese103;
import geometricshapes.*;
/**
 *
 * @author Lorenzo Carfagna
 *
 */
public class Ese103 {
	public static void main(String[] args) throws Exception {
		int i;
		Circle a, b, c;
		
		Circle cerchi[] = new Circle[4];
		
		// --------------------------------------------------------------TEST 1 CONTROLLO COSTRUTTORE----------------------------------------------------------------------------------
		try {
			a = new Circle(0, 0, 0);
			throw new Exception(
					"Test 1 NON SUPERATO Errore nell'implementazione di Costruttore");
		} catch (IllegalArgumentException e) {
			System.out.println("Test numero 1 SUPERATO");
		}
		
		cerchi[0] = new Circle(2, 2, 1);
		
		// --------------------------------------------------------------TEST >1 CONTROLLO COSTRUTTORE E METODI GETTER---------------------------------------------------------
		controllaValore(2, 2, cerchi[0].getXC());
		controllaValore(3, 2, cerchi[0].getYC());
		controllaValore(4, 1, cerchi[0].getR());
		
		// ----------------------------------------------------------------CONTROLLO contains(Circle) E toString()---------------------------------------------------------------------------------
		// I RISULTATI DI CONTAINS NON SONO VERIFICATI AUTOMATICAMENTE
		cerchi[1] = new Circle(3, 3, 1);
		cerchi[2] = new Circle(5, 6, 1);
		cerchi[3] = new Circle(2, 2, 2);
		System.out.println("\nTest numero 5 , Contains va verificato manualmente\n");
		for (i = 0; i < cerchi.length; i++) {
			a = cerchi[i];
			b = cerchi[(i + 1) % cerchi.length];
			if (a.contains(b))
				System.out.println("Il cerchio con " + a
						+ " CONTIENE il cerchio " + b);
			else
				System.out.println("Il cerchio con " + a
						+ " NON CONTIENE il cerchio " + b);
		}
		
		// ---------------------------------------------------TEST 10 CONTROLLO COORDINATE BOUNDING BOX----------------------------------------------------------
		controllaValore(11, 1, cerchi[0].getXMin());
		controllaValore(12, 1, cerchi[0].getYMin());
		controllaValore(13, 3, cerchi[0].getXMax());
		controllaValore(14, 3, cerchi[0].getYMax());
		
		// ----------------------------------------------------TEST 20 CONTROLLO METODI SETTER------------------------------------------------------------------------
		cerchi[0].setXC(4);
		cerchi[0].setYC(3);
		cerchi[0].setR(5);
		controllaValore(21, 4, cerchi[0].getXC());
		controllaValore(22, 3, cerchi[0].getYC());
		controllaValore(23, 5, cerchi[0].getR());
		
		// ---------------------------------------------------TEST NUMERO 24---->CONTROLLO setR(RAGGIO NEGATIVO)----------------------------------------------------------------
		try {
			cerchi[0].setR(-1);
			throw new Exception("Errore nell'implementazione di setR,Test24 NON SUPERATO");
		} catch (IllegalArgumentException e) {
			System.out.println("Test numero 24 SUPERATO");
		}
		// ----------------------------------------------------TEST 30 CONTROLLO METODO equals(Obj)------------------------------------------------------------------------
		
		c = new Circle(4, 3, 5); // imposto campi di c uguali a quelli di// cerchi[0]
		
		
		controllaVerita(31, false, cerchi[0].equals(cerchi[1])); // controllo campi differenti
		controllaVerita(32, true, cerchi[0].equals(cerchi[0])); // controllo stessa istanza
		controllaVerita(33, true, cerchi[0].equals(c)); // controllo campi uguali
		
		//----------------------------------------------------TEST 41 CONTROLLO COSTRUTTORE TRIANGLE L<0----------------------------------
		Triangle triangoli[] = new Triangle[4];
		
		try {
			triangoli[0] = new Triangle(0, 0, 0);
			throw new Exception("Test 41 NON SUPERATO Errore nell'implementazione di Costruttore");
		} catch (IllegalArgumentException e) {
			System.out.println("Test numero 41 SUPERATO");
		}
		
		//-------------------------------------------------TEST > 41 CONTROLLO COSTRUTTORE E METODI GETTER DI TRIANGLE----------------------------
		
		triangoli[0] = new Triangle(5, 4, 3);
		controllaValore(42, 5, triangoli[0].getXV());
		controllaValore(43, 4, triangoli[0].getYV());
		controllaValore(44, 3, triangoli[0].getL());
		
		// ----------------------------------------------------------------CONTROLLO contains(Triangle) E toString()---------------------------------------------------------------------------------
		//---------------------------------------------------- I RISULTATI DI CONTAINS NON SONO VERIFICATI AUTOMATICAMENTE------------------------------------
		triangoli[1] = new Triangle(6, 4, 1);
		triangoli[2] = new Triangle(5, 6, 3);
		triangoli[3] = new Triangle(5, 4, 3);
		
		Triangle t1, t2;
		
		System.out.println("\nTest numero 45 , Contains va verificato manualmente\n");
		for (i = 0; i < triangoli.length; i++) {
			t1 = triangoli[i];
			t2 = triangoli[(i + 1) % triangoli.length];
			if (t1.contains(t2))
				System.out.println(t1 + " CONTIENE " + t2);
			else
				System.out.println(t1 + " NON CONTIENE " + t2);
		}
		
		// ---------------------------------------------------TEST 50 CONTROLLO COORDINATE BOUNDING BOX TRIANGLE----------------------------------------------------------
				
				controllaValore(51, 5, triangoli[0].getXMin());
				controllaValore(52, 4, triangoli[0].getYMin());
				controllaValore(53, 8, triangoli[0].getXMax());
				controllaValore(54, 4 + 3 * Math.sqrt(3) / 2, triangoli[0].getYMax());
				
		// ----------------------------------------------------TEST 60 CONTROLLO METODI SETTER------------------------------------------------------------------------
				
				triangoli[0].setXV(4);
				triangoli[0].setYV(3);
				triangoli[0].setL(5);
				controllaValore(61, 4, cerchi[0].getXC());
				controllaValore(62, 3, cerchi[0].getYC());
				controllaValore(63, 5, cerchi[0].getR());
				
	  // ----------------------------------------------------TEST 70 CONTROLLO METODO equals(Obj) TRIANGLE ------------------------------------------------------------------------
				t1 = new Triangle(4, 3, 5);                  // imposto campi di t1 uguali a quelli di// triangoli[0]
				
				
				controllaVerita(71, false, triangoli[0].equals(triangoli[1])); // controllo campi differenti
				controllaVerita(72, true, triangoli[0].equals(triangoli[0])); // controllo stessa istanza
				controllaVerita(73, true, triangoli[0].equals(t1)); // controllo campi uguali
				
	//------------------------------------------------------TEST 80 CONTROLLO contains tra classi diverse-----------------------------------------
	 System.out.println("\nTest 80 contains va verificato manualmente");
	 cerchi[0] = new Circle(0, 0, 1);
	 cerchi[1] = new Circle(0.5, 0.5, 0.5);
	 cerchi[2] = new Circle(1, 1, 1);
	 triangoli[0] = new Triangle(0, 0, 1);
	 triangoli[1] = new Triangle(-2, -2, 4);
	 System.out.println("\nI cerchi contengono i triangoli?");
	 for(i=0; i<cerchi.length; i++) {
		 c = cerchi[i];
		 for(int j=0; j<triangoli.length; j++) {
		 t1 = triangoli[j];
		 if(c.contains(t1))
			 System.out.println("Il cerchio con "+ c + " contiene il " + t1);
		 else
			 System.out.println("Il cerchio con "+ c + " NON contiene il " + t1);
		 }
	 }
	 System.out.println("\nI triangoli contengono i cerchi?");
	 for(int j=0; j<triangoli.length; j++) {
		 t1 = triangoli[j];
		 for(i=0; i<cerchi.length; i++) {
			 c = cerchi[i];
			 if(t1.contains(c))
				 System.out.println("il "+t1 + " contiene Il cerchio con " + c);
			 else
				 System.out.println("il "+t1 + " NON contiene Il cerchio con  " + c);
		 }
	 }
	 System.out.println("Test completato, sembra che vada tutto bene!");
	
}
	static void controllaValore(int numeroTest, double valoreAtteso,
			double valoreRicevuto) throws Exception {
		String Messaggio = "Test numero " + numeroTest + " SUPERATO";
		if (valoreAtteso != valoreRicevuto) {
			throw new Exception("ERRORE! Test numero " + numeroTest+ " Valore atteso:" + valoreAtteso + " Valore restituito:"+ valoreRicevuto);
		} else
			System.out.println(Messaggio);
	}

	static void controllaVerita(int numeroTest, boolean valoreAtteso,
			boolean valoreRicevuto) throws Exception {
		String Messaggio = "Test numero " + numeroTest + " SUPERATO";
		if (valoreAtteso != valoreRicevuto) {
			throw new Exception("ERRORE! Test numero " + numeroTest+ " Valore atteso:" + valoreAtteso + " Valore restituito:"+ valoreRicevuto);
		} else
			System.out.println(Messaggio);
	}
}