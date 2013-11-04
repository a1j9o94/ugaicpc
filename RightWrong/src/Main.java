//problem 6220

import java.io.BufferedReader;
import java.io.InputStreamReader;


class Main {
	public static void main(String args[]){
		Main mine = new Main();
		String rawInput = getInput();
		String[] in = rawInput.split(" ");
		int b = Integer.parseInt(in[0]);
		int n = Integer.parseInt(in[1]);
		double a = 0;
		StringBuilder results = new StringBuilder();
		
		while (!(b == 0 && n == 0)) {
			for (int m = 2 * n; m >= 0; m--) {
				a = mine.mToA(m, b, n);
				if (mine.isRightWhenWrong((int) a, m, b, n)) {
					results.append((int) a + "/" + (int) m);
					results.append(" ");
				}
			}
			results.append("\n");
			rawInput = getInput();
			in = rawInput.split(" ");
			b = Integer.parseInt(in[0]);
			n = Integer.parseInt(in[1]);
		}
		System.out.print(results);
		
		System.exit(0);
	}
	
	
	boolean isRightWhenWrong(int a, int m, int b, int n){
		double value1 = (double)a/m - (double)b/n;
		double value2 = ((double)a-b)/((double)m-n);
		return (m-n != 0) && Math.abs(value1-value2) < .000001;
	}
	
	double mToA(double m, double b, double n){
		return (m*(b*m-2*b*n))/(-(n*n));
	}
	
	static String getInput() {
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.flush();
		
		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}
}