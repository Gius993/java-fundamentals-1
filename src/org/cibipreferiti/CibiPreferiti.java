package org.lesson.cibipreferiti;



public class CibiPreferiti {
	public static void main(String [] args) {
	
		//array cibi
		String[] cibiPreferiti = {"Capessante", "Calamari", "Manzo", "Verdure fritte", "Zampone"};
		
		System.out.print(" lunghezza classifica " + cibiPreferiti.length);
		System.out.print(" in prima posizione : " + cibiPreferiti[0]);
		System.out.print(" in ultima posizione : " + cibiPreferiti[cibiPreferiti.length - 1]);
		System.out.print(" in mezzo : " + cibiPreferiti[(cibiPreferiti.length - 1) / 2]);
	}
}
