package org.lessons.java;
import java.util.Scanner;
public class CalcolaBiglietto {
	public static void main(String [] args) {
		// Variabili utente
		Scanner in = new Scanner(System.in);
		System.out.print("Km che vuoi percorrere");
		int kmUtente = in.nextInt();
		System.out.print("Quanti anni hai ?");
		int anniUtente = in.nextInt();
		// Variabili treno
		double prezzoBiglietto = kmUtente * 0.21;
		double scontoMinorenni = prezzoBiglietto * 0.2;
		double scontoAnziani = prezzoBiglietto * 0.4;
		if(anniUtente < 18) {
			System.out.print("il tuo prezzo : " + (prezzoBiglietto - scontoMinorenni));
		}else if(anniUtente > 65) {
			System.out.print("il tuo prezzo : " + (prezzoBiglietto - scontoAnziani));
		}else {
			System.out.print("il tuo prezzo : " + prezzoBiglietto);
		}
		in.close();
	}

}

