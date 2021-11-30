package es.psp.U4P2CordinacionHilos.Ejercicio2;

public class ThreadPut extends Thread {

	private String texto;
	private ColaMensajes cola;

	public ThreadPut(String name, ColaMensajes cola, String texto) {
		super(name);
		this.cola= cola;
		this.texto = texto;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		try {
			cola.put(texto);
			System.out.println(getName() + " ha escrito este mensaje -> "+ texto);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
