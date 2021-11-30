package es.psp.U4P2CordinacionHilos.Ejercicio1;

public class CalculateThread extends Thread {

	
	Calculate cal;
	private Integer numero;
	
	public CalculateThread(Calculate cal, Integer numero) {
		super();
		this.cal=cal;
		this.numero = numero;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		cal.newValue(numero);
		
	}
	
	
	
}
