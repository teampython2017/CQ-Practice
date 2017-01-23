package jan_22_2017;

import java.io.*;

public class PiggyBank {
	
	private static final String PATH = "Easiest/Prob01.in.txt";

	public static void main(String[] args) {
		try {
			File f = new File(PATH);
			FileReader fr = new FileReader(f);
			BufferedReader lines = new BufferedReader(fr);
			//int T = Integer.parseInt(lines.readLine());
			String line = null;
			int sum = 0;
			
			while ((line = lines.readLine()) != null) {				
				String[] tok = line.split("=");
				
				if (tok[0].equals("HALFDOLLAR")) {
					sum += (Integer.parseInt(tok[1]) * 50);
				}
				else if (tok[0].equals("QUARTER")) {
					sum += (Integer.parseInt(tok[1]) * 25);
				}
				else if (tok[0].equals("DIME")) {
					sum += (Integer.parseInt(tok[1]) * 10);
				}
				else if (tok[0].equals("NICKEL")) {
					sum += (Integer.parseInt(tok[1]) * 5);
				}
				else if (tok[0].equals("PENNY")) {
					sum += (Integer.parseInt(tok[1]));
				}
				else {
					sum += 0;
				}
			}
			String pretty = Integer.toString(sum);
			System.out.println("$"+pretty.substring(0, pretty.length()-2)+"."+pretty.substring(pretty.length()-2));
			
			lines.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
