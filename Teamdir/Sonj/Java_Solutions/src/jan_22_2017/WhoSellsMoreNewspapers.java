package jan_22_2017;

import java.io.*;

public class WhoSellsMoreNewspapers {
	
	private static final String PATH = "Easiest/Prob02.in.txt";

	public static void main(String[] args) {
		try {
			File f = new File(PATH);
			FileReader fr = new FileReader(f);
			BufferedReader lines = new BufferedReader(fr);
			//int T = Integer.parseInt(lines.readLine());
			
			String line = null;
			
			while ((line = lines.readLine()) != null) {
				int times = Integer.parseInt(line.split(" ")[0]);
				int herald = Integer.parseInt(line.split(" ")[1]);
				
				if (times > herald) {
					int diff = 2 * (times - herald);
					System.out.println("Times has " + diff + " more subscribers");
				}
				else if (herald > times) {
					int diff = 2 * (herald - times);
					System.out.println("Herald has " + diff + " more subscribers");
				}
				else if (herald == times) {
					System.out.println("Times and Herald have the same number of subscribers");
				}
			}
			
			lines.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
