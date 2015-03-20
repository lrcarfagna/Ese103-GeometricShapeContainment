package ese103;

import geometricshapes.*;
/**
 * 
 * @author Lorenzo Carfagna
 * 
 */
public class Ese103 {

	public static void main(String[] args) throws Exception {
		
		//Ese103 pippo = new Ese103(); CHIEDERE AL PROF A COSA SERVE UN ISTANZA DELLA CLASSE Ese103
		
		int i;
		Circle a,b,c;
		
		Circle cerchi[] = new Circle[4];
//--------------------------------------------------------------TEST 1 CONTROLLO COSTRUTTORE----------------------------------------------------------------------------------
		
		try{
			a = new Circle(0,0,0);
			throw new Exception("Test 1 NON SUPERATO Errore nell'implementazione di Costruttore");
		}
		catch(IllegalArgumentException e){
			System.out.println("Test numero 1 SUPERATO");
		}

		cerchi[0]= new Circle(2,2,1);
		
//--------------------------------------------------------------TEST >1 CONTROLLO COSTRUTTORE E METODI GETTER---------------------------------------------------------		
		controllaValore(2,2,cerchi[0].getXC());
	    controllaValore(3,2,cerchi[0].getYC());
	    controllaValore(4,1,cerchi[0].getR());
//----------------------------------------------------------------CONTROLLO contains(Circle) E toString()---------------------------------------------------------------------------------
		
	    //I RISULTATI DI CONTAINS NON SONO VERIFICATI AUTOMATICAMENTE
	    cerchi[1]= new Circle(3,3,1);
		cerchi[2]= new Circle(5,6,1);
		cerchi[3]= new Circle(2,2,2);
		
		System.out.println("Test numero 5 , Contains va verificato manualmente");
		
		for(i=0;i<cerchi.length;i++){
			a=cerchi[i];
			b=cerchi[(i+1) % cerchi.length] ;
			if(a.contains(b))
				System.out.println("Il cerchio con "+a+" CONTIENE il cerchio "+b);
			else
				System.out.println("Il cerchio con "+a+" NON CONTIENE il cerchio "+b);
		}
		
		
		
//---------------------------------------------------TEST 10 CONTROLLO COORDINATE BOUNDING BOX----------------------------------------------------------
		
		controllaValore(11,1,cerchi[0].getXMin());
		controllaValore(12,1,cerchi[0].getYMin());
		controllaValore(13,3,cerchi[0].getXMax());
		controllaValore(14,3,cerchi[0].getYMax());
		
//----------------------------------------------------TEST 20 CONTROLLO METODI SETTER------------------------------------------------------------------------	
		
		cerchi[0].setXC(4);
		cerchi[0].setYC(3);
		cerchi[0].setR(5);
		
	    controllaValore(21,4,cerchi[0].getXC());
	    controllaValore(22,3,cerchi[0].getYC());
	    controllaValore(23,5,cerchi[0].getR());
	    
	    
//---------------------------------------------------TEST NUMERO 24 -------->CONTROLLO setR(RAGGIO NEGATIVO)----------------------------------------------------------------
	    try {
	    	cerchi[0].setR(-1);
	    	
	    	throw new Exception("Errore nell'implementazione di setR");
	    	}
	    	catch(IllegalArgumentException e) {
	    		System.out.println("Test numero 24 SUPERATO");
	    	}
	    
//----------------------------------------------------TEST 30 CONTROLLO METODO equals(Obj)------------------------------------------------------------------------    
		
	    c = new Circle(4,3,5);  // imposto campi di c uguali a quelli di cerchi[0]
		
		controllaVerita(31,false,cerchi[0].equals(cerchi[1]));  //controllo campi differenti
		controllaVerita(32,true,cerchi[0].equals(cerchi[0]));   //controllo stessa istanza
		controllaVerita(33,true,cerchi[0].equals(c));           //controllo campi uguali
		
		System.out.println("Test completato, sembra che vada tutto bene!");
		
	}
	
	/*
	 * CHIEDERE PERCHE' SE I METODI SOTTOSTANTI SONO STATIC NON VANNO RICHIAMATI CON Ese103.nome_metodo
	 */
	static void controllaValore(int numeroTest, double valoreAtteso, double valoreRicevuto) throws Exception{
		
		String Messaggio="Test numero "+numeroTest+" SUPERATO";
		
		if(valoreAtteso!=valoreRicevuto){
			throw new Exception("ERRORE! Test numero  "+numeroTest+"  Valore atteso:"+valoreAtteso+" Valore restituito:"+valoreRicevuto);
		}
		else System.out.println(Messaggio);
	}
	
	static void controllaVerita(int numeroTest, boolean valoreAtteso, boolean valoreRicevuto) throws Exception{
		
		String Messaggio="Test numero "+numeroTest+" SUPERATO";
			
		if(valoreAtteso!=valoreRicevuto){
			throw new Exception("ERRORE! Test numero  "+numeroTest+"  Valore atteso:"+valoreAtteso+" Valore restituito:"+valoreRicevuto);
		}
		else 
			System.out.println(Messaggio);
	}
	
	
}