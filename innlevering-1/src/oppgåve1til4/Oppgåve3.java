package oppgåve1til4;

import static java.lang.Math.pow;

import java.util.Scanner;

public class Oppgåve3 {
	
	public static void main (String []args) {
		Scanner inn = new Scanner (System.in);
		
		double x = inn.nextDouble();
		
		for (int i = 1; i <=10; i++) {
			System.out.println(Math.pow(x, i));
		}
	}
}
