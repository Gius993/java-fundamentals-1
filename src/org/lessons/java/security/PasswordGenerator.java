package org.lessons.java.security;

import java.util.Scanner; 



public class PasswordGenerator {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		 System.out.print("inserisci il tuo nome ");
		String nameUtent = in.nextLine();
		 System.out.print("inserisci il tuo cognome");
		String lastNameUtent = in.nextLine();
		System.out.print("inserisci il tuo colore ");
		String bestMyColor = in.nextLine();
		System.out.print("inserisci il tuo anno ");
		int ageDate = in.nextInt();
		System.out.print("inserisci il tuo mese ");
		int mounthDate = in.nextInt();
		System.out.print("inserisci il tuo giorno ");
		int dayDate = in.nextInt();
		
		in.close();
		
		System.out.println("ecco la tua password " + nameUtent + "-" + lastNameUtent + "-"  + bestMyColor + "-" + ageDate );
	}
}
