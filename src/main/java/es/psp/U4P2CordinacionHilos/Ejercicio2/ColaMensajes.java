package es.psp.U4P2CordinacionHilos.Ejercicio2;

import java.util.ArrayList;

public class ColaMensajes {

	private ArrayList<String> mensajes;
	private int maxWrittes;
	private int vecesLeido=0;
	
	
	public ColaMensajes(int maxWrittes) {
		super();
		this.mensajes= new ArrayList<>(maxWrittes);
		this.maxWrittes=maxWrittes;
	}
	

	public synchronized void put(String text) throws InterruptedException {
		
		if (this.mensajes.size() == maxWrittes) {
			wait();
		}else {
			this.mensajes.add(text);
		}
		notifyAll();
		
	}
	
	public synchronized String get() throws InterruptedException {
		
		if (this.mensajes.size()==0) {
			wait();
		}else {
			
			notifyAll();
		}
		
		String texto = this.mensajes.get(0);
		this.mensajes.remove(0);
		vecesLeido++;
		return texto;
	}
	
	public int getVecesLeido() {
		return vecesLeido;
	}
	
	public void datosArrayRestantes() {
		System.out.println("Estos son los datos que quedan en el array: ");
		
		for (String string : mensajes) {
			System.out.println(string);
		}
	}
	
}
