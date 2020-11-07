package littTesting;

import java.io.PrintWriter;

public class TestingAvLittMeirTesting {
	public static void main(String[] args) throws Exception{

		String studentnr = "123 2";
		String fornavn = "Kuk2";
		String etternavn = "Mann2";
		
		String fil = "navn.txt";
		PrintWriter skriver = new PrintWriter(fil);
		
		String[] navnTab = {studentnr, fornavn, etternavn};
		
		for (int i = 0; i < navnTab.length; i++) {
			skriver.print(navnTab[i]);
		}
		skriver.println("");
	
		skriver.close();
	}
}
