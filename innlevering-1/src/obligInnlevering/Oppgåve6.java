package obligInnlevering;
import java.util.Scanner;

public class Oppg�ve6 {
	public static void main(String[] args) {
		System.out.println("Skriv inn eit heiltal i console");
		Scanner inn = new Scanner (System.in);
		int n = inn.nextInt();
		inn.close();
		int sum = 1;
		
		for (int i = n; i > 0; i--) {
			sum *=i;
		}
		System.out.println(sum);
	}
}
