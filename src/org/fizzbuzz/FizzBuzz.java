package org.lesson.fizzbuzz;


public class FizzBuzz {
	public static void main(String [] args) {
		for(int i = 1; i <= 100; i++ ) {
			if(i % 3 == 0 && i % 5 == 0){
				System.out.print("  FIZZBUZZ  ");
			} else if(i % 5 == 0) {
				System.out.print("  BUZZ  ");
			} else if (i % 3 == 0){
				System.out.print("  FIZZ  ");
			} else {
				System.out.print(i);
			}
		}
	}

}
