package jan_22_2017;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class NumericalOrder {
	
	private static final String PATH = "Easiest/Prob03.in.txt";

	public static void main(String[] args) {
		try {
			File f = new File(PATH);
			FileReader fr = new FileReader(f);
			BufferedReader lines = new BufferedReader(fr);
			//int T = Integer.parseInt(lines.readLine());
			
			String line = null;
			
			while ((line = lines.readLine()) != null) {
				String[] numst = line.split(" ");
				Integer[] nums = new Integer[numst.length];
				for (int i=0; i < numst.length; i++) {
					try {
						nums[i] = Integer.parseInt(numst[i]);
					}
					catch (Exception e) {
						System.out.println("The input was invalid");
					}
				}
				if (!Arrays.asList(nums).contains(null)) {
					Integer[] greater = nums.clone(), less = nums.clone();
					Arrays.sort(greater);
					Arrays.sort(less, Collections.reverseOrder());
				
					if (Arrays.equals(nums, greater)) {
						System.out.println("The numbers are in ascending order");
					}
					else if (Arrays.equals(nums, less)) {
						System.out.println("The numbers are in descending order");
					}
					else {
						System.out.println("The numbers are in random order");
					}
				}
				
			}
			
			lines.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
