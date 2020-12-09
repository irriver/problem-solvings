package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HotelRoom10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(buffer.readLine().trim()); //2
		
/*		2
		6 12 10
		30 50 72
*/
		String[][] testCase = new String[T][3];
		
		for (int i = 0; i < T; i++) {
			testCase[i] = buffer.readLine().split("\\s"); //6, 12, 10 | 30, 50, 72
			int H = Integer.parseInt(testCase[i ][0]);
			int W = Integer.parseInt(testCase[i][1]);
			int N = Integer.parseInt(testCase[i][2]);
			
			String space = (N / H) < 10 ? "0" : "";
			
			if (N % H == 0) {
				System.out.println(H + space + (N / H));
			} else {
				System.out.println((N % H) + space + (N / H + 1));
			}
		}
	}
}
