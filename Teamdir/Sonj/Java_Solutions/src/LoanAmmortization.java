

import java.io.*;

public class LoanAmmortization {
	
	private static final String PATH = "Prob05.in.txt";

	public static void main(String[] args) {
		try {
			File f = new File(PATH);
			FileReader fr = new FileReader(f);
			BufferedReader lines = new BufferedReader(fr);
			String line = null;
			
			while((line = lines.readLine()) != null) {
				
			}
			
			lines.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
