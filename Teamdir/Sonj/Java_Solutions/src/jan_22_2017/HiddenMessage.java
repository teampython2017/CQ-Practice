package jan_22_2017;

import java.io.*;

public class HiddenMessage {
	
	private static final String PATH = "Easiest/Prob04.in.txt";

	public static void main(String[] args) {
		try {
			File f = new File(PATH);
			FileReader fr = new FileReader(f);
			BufferedReader lines = new BufferedReader(fr);
			String line = null;
			String[] alpha = new String[26];
			int count = 0;
			String completed = "";
			
			while ((line = lines.readLine()) != null) {
				if (count == 0) {
					alpha = line.split("");
				}
				else {
					String[] words = line.split(" ");
					for (String s : words) {
						String[] magic = s.split("-");
						for (int i=0; i<magic.length; i++) {
							completed += alpha[Integer.parseInt(magic[i])-1];
						}
						completed += " ";
					}
				}
				count++;
				
			}
			System.out.println(completed);
			
			lines.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
