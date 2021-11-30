package es.psp.U4P2CordinacionHilos.Ejercicio2;

public class MainEjercicio2 {

	private final static int QUEUE_SIZE=0;
	private final static int MAX_WRITTEN_MESSAGES = 10;
	private final static int NUM_READERS=3;
	private final static int NUM_WRITERS=5;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread addText[]=  new Thread[NUM_WRITERS]; 
		Thread getText[]=  new Thread[NUM_READERS]; 
		

		ColaMensajes colaMensajes = new ColaMensajes(MAX_WRITTEN_MESSAGES);
		
		for (int i = 0; i < addText.length; i++) {
			
			addText[i]= new ThreadPut("HiloPut"+i, colaMensajes, "Mensaje escrito por el hilo: HiloPut"+i);
			addText[i].start();
			
			}
		
		for (int i = 0; i < getText.length; i++) {
			getText[i] = new ThreadGet("HiloGet"+i, colaMensajes);
			getText[i].start();
		}
		
		for (int i = 0; i < getText.length; i++) {
			try {
				getText[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Veces leido = "+colaMensajes.getVecesLeido());
		colaMensajes.datosArrayRestantes();
		
	}

}
