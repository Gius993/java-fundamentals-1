package org.sondaggio.esercizio;
import java.util.Scanner; 

public class SondaggioEsercizio {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
	
		System.out.print("quanti studenti usando windows ");
		int numeroStudentiWindows = in.nextInt();
		
		System.out.print("quanti studenti usando linux ");
		int numeroStudentilinux = in.nextInt();
		
		System.out.print("quanti studenti usando mac ");
		int numeroStudentiMac = in.nextInt();
		
		int numeroTotale = numeroStudentiWindows + numeroStudentilinux + numeroStudentiMac;
		
		double windwsPercentuale = (numeroStudentiWindows * 1.0 / numeroTotale) * 100;
		double linuxPercentuale = (numeroStudentilinux /(double) numeroTotale) * 100 ;
		double macPercentuale = (numeroStudentiMac /(double) numeroTotale) * 100;
		
		System.out.println("Percentuale studenti windows = " + (int)windwsPercentuale + "%" );
		System.out.println("Percentuale studenti linux = " + (int)linuxPercentuale + "%");
		System.out.println("Percentuale studenti mac = " + (int)macPercentuale + "%");
		in.close();			
		
	}
}

