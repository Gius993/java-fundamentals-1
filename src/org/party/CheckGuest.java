package com.ferragnez.party;
import java.util.Scanner;

public class CheckGuest {
	// Creo lista
	public static void main(String[] args) {
		String [] listaOspiti = {"Biden", "Fizzbuzz", "Claudio", "Gionnigianni", "Fedez", "Priamo", "Mario", "Abdul"};
		// chiedo il nome
		Scanner in = new Scanner(System.in);
		System.out.println("Come ti chiami ? ");
		String nome = in.nextLine();
	
		in.close();
	
		//Controllo il nome in lista
		boolean nomePersona = false;
	
		// cliclo la lista
	
		for(int i = 0; i < listaOspiti.length; i++) {
			if(nome.equalsIgnoreCase(listaOspiti[i])) {
				nomePersona = true;
			}
		}
		if(nomePersona) {
			System.out.println("Benvenuto alla festona ");
		}else {
			System.out.println("Puoi gentilmente tornare da dove sei venuto ? ");
		}
	}
}
