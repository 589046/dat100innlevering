package littTesting;

public class TestingAvLittMeirTesting {
	public static void main(String[] args) {
		LittMeirTesting s1 = new LittMeirTesting();
		s1.skriv();
		
		s1.studentnr = 1;
		s1.fornavn = "Per";
		s1.etternavn = "Karlsen";
		
		s1.skriv();
	}
}
