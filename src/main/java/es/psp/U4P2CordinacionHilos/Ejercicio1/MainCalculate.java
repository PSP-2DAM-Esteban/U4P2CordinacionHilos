package es.psp.U4P2CordinacionHilos.Ejercicio1;

import java.util.Scanner;

public class MainCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
	
		Calculate calculate= new Calculate();
		
		Integer numHilos;
		Integer numASumar;
		
		
		System.out.println("Introduce los hilos numero entre 50 - 100");
		numHilos= sc.nextInt();
		
		if (numHilos <=100 && numHilos>=50) {
			
			System.out.println("Introduce el numero que deseas Sumar");
			numASumar = sc.nextInt();
			
			Thread calculates[]= new Thread[numHilos];
			
			for (int i = 0; i < calculates.length; i++) {
				
				calculates[i] = new CalculateThread(calculate ,numASumar);
				calculates[i].start();
			
				
			}
			
			for (int i = 0; i < calculates.length; i++) {
				try {
					calculates[i].join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("SumaCompartida " + calculate.getSuma());
			System.out.println("Primedio "+calculate.getAverageValue());
			
			
			
		}else {
			main(args);
			
		}
		
		
	}

}
