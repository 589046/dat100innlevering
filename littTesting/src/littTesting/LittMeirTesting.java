package littTesting;

import java.io.*;

public class LittMeirTesting {

	String studentnr = "123";
	String fornavn = "Kuk";
	String etternavn = "Mann";
	
	public void skriv() throws Exception{
		String fil = "navn.txt";
		PrintWriter skriver = new PrintWriter(fil);
		
		String[] navnTab = {studentnr, fornavn, etternavn};
		
		for (int i = 0; i < navnTab.length; i++) {
			skriver.print(navnTab[i]);
		}
		
		skriver.close();
	}
}