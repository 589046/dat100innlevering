package obligInnlevering;

import java.util.Scanner;

public class Oppg�ve4 {
	public static void main(String[] args) {
		System.out.println("Skriv inn l�nna di i console");
		
		Scanner inn = new Scanner (System.in);
		int l�nn = inn.nextInt();
		inn.close();
		
		if (l�nn < 180800) {
			double skatt = 0;
			System.out.println(skatt);
			
		} if (l�nn >= 180800 && l�nn < 254500) { 	//reknar ut skatten for trinn1 
			l�nn = l�nn-180800;
			double trinn1 = (l�nn*0.019);
			System.out.println(trinn1);
			
			double skatt = + trinn1;
			System.out.println(skatt);
			
		} if (l�nn >= 254500 && l�nn < 639750) {	//reknar ut skatten for trinn2
			l�nn = l�nn-180800;
			
			double trinn1 = 73700 * 0.019;
			l�nn = l�nn-73700;
			double trinn2 = l�nn *0.042;
		
			System.out.println(trinn1);
			System.out.println(trinn2);
			
			double skatt = trinn1 + trinn2;
			System.out.println(skatt);
		}
		if (l�nn >= 639750 && l�nn < 999550) { 		//reknar ut skatten for trinn3
			l�nn = l�nn-180800;
			
			double trinn1 = 73700*0.019;
			l�nn = l�nn - 73700;
			
			double trinn2 = 385250*0.042;
			l�nn = l�nn - 385250;
			
			double trinn3 = l�nn*0.132;
			
			System.out.println(trinn1);
			System.out.println(trinn2);
			System.out.println(trinn3);
			
			double skatt = trinn1 + trinn2 + trinn3;
			System.out.println(skatt);
		}
		if (l�nn >= 999550) {						//reknar ut skatten for trinn4
			l�nn = l�nn-180800;
			
			double trinn1 = 73700*0.019;
			l�nn = l�nn - 73700;
			
			double trinn2 = 385250*0.042;
			l�nn = l�nn - 385250;
			
			double trinn3 = 359750*0.132;
			l�nn = l�nn - 359800;
			
			double trinn4 = l�nn*0.162;
			
			System.out.println(trinn1);
			System.out.println(trinn2);
			System.out.println(trinn3);
			System.out.println(trinn4);
			
			double skatt = trinn1 + trinn2 + trinn3 + trinn4;
			System.out.println("Din samanlagte trinnskatt er: " +skatt);
		}
		
	}
}
