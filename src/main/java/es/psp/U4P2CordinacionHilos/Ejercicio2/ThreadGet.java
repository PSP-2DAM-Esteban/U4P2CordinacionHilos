package es.psp.U4P2CordinacionHilos.Ejercicio2;

public class ThreadGet extends Thread {

	
	 private ColaMensajes cola;
	

	public ThreadGet(String name, ColaMensajes cola) {
		super(name);
		this.cola = cola;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			System.out.println(getName() + " ha leido -> "+ this.cola.get());
	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	 
	 
	 
	 
}
