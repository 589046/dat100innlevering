package obligInnlevering;

import java.util.Scanner;

public class Oppg�ve5 {
	public static void main(String[] args) {
		System.out.println("Skriv inn poengsum i console");
		Scanner inn = new Scanner (System.in);
		
		for (int i=0; i < 10; i++){
			int poeng = inn.nextInt();
			
			if (poeng >= 90 && poeng <=100) {
				String karakter = "A";		
				System.out.println(karakter);
				
			}if (poeng >= 80 && poeng <=89) {
				String karakter = "B";		
				System.out.println(karakter);
				
			} if (poeng >= 60 && poeng <=79) {
				String karakter = "C";		
				System.out.println(karakter);
				
			} if (poeng >= 50 && poeng <=59) {
				String karakter = "D";		
				System.out.println(karakter);
				
			} if (poeng >= 40 && poeng <=49) {
				String karakter = "E";		
				System.out.println(karakter);
				
			} if (poeng < 40 && poeng >=0) {
				String karakter = "F";		
				System.out.println(karakter);
				
			} if (poeng > 100 || poeng < 0) {
				System.out.println("Poengsummen er ugyldig! Skriv inn riktig poengsum.");
				i--;
			}
		}
		inn.close();
	}
}
