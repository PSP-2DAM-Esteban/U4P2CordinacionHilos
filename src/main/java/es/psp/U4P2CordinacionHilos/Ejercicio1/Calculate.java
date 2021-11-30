package es.psp.U4P2CordinacionHilos.Ejercicio1;

public class Calculate{

	
	private int suma=0;
	private int numeroSumados=0;
	private int averageValue;
	
	
	public Calculate() {
		super();
		
	}




	public synchronized void newValue(int numSuma) {
		
		this.suma += numSuma;
		this.numeroSumados++;
		
		this.averageValue=this.suma/numeroSumados;
		
	}
	
	public int getSuma() {
		return this.suma;
	}
	
	
	public int getAverageValue() {
		return this.averageValue;
	}
}
