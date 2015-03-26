package geometricshapes;

public class Square extends Rectangle{

	/**
	 * Inizializza i campi della padre a xV,yV,l,l
	 * @param xV
	 * @param yV
	 * @param l
	 */
	public Square(double xV, double yV, double l){
		
		if(l<=0) throw new IllegalArgumentException("Il lato del quadrato deve essere maggiore di 0");
		else{
				this.setXSideLength(l);
				this.setYSideLength(l);
				this.setXV(xV);
				this.setYV(yV);
		}
		
	}
	/**
	 * Setta la lunghezza del lato a l
	 * @param l
	 */
	public void setL(double l){
		if(l<=0) throw new IllegalArgumentException("Il lato del quadrato deve essere maggiore di 0");
		
		else{
				//richiamo il metodo ridefinito per il quadrato
				this.setXSideLength(l);
		}
		
	}
	/**
	 * restituisce la lunghezza del lato
	 * @return
	 */
	public double getL(){
		return this.getYSideLength();
	}
	
	/**
	 * stringa preformattata per il quadrato
	 */
	@Override
	public String toString() {
		return "Quadrato [xV=" + this.getXV() + ", yV=" + this.getYV() + ", l="+ this.getXSideLength()+"]";
	}
	
	/**
	 * Setta la lunghezza dei due lati a l
	 */
	@Override 
	public void setXSideLength(double l){
		/*
		 * TUTTI E DUE I LATI ASSUMONO IL VALORE DI l PER  MANTENERE LA COERENZA DELLO STATO
		 */
		if(l <= 0)
			throw new IllegalArgumentException("La lunghezza del lato deve essere maggiore di 0");
			else {
				super.setXSideLength(l);
				super.setYSideLength(l);
			}
	}
	
	/**
	 * Setta la lunghezza dei due lati a l
	 */
	@Override 
	public void setYSideLength(double l){
		/*
		 * TUTTI E DUE I LATI ASSUMONO IL VALORE DI l PER  MANTENERE LA COERENZA DELLO STATO
		 */
		if(l <= 0)
			throw new IllegalArgumentException("La lunghezza del lato deve essere maggiore di 0");
			else {
				super.setXSideLength(l);
				super.setYSideLength(l);
			}
	}
	
}
