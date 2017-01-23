import java.io.*;

public class Starter {
	
	private static final String PATH = "Starter.in.txt";

	public static void main(String[] args) {
		try {
			File f = new File(PATH);
			FileReader fr = new FileReader(f);
			BufferedReader lines = new BufferedReader(fr);
			int T = Integer.parseInt(lines.readLine());
			
			while (T > 0) {
				System.out.println(T);
				T--;
			}
			
			lines.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
