import java.util.Scanner;
import java.util.*;

public class Raggedness {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> lines = new ArrayList<String>();
		// String s = input.toString();

		// input = new Scanner(s);

		String store;
		int n = 0, raggedness = 0;

		do {
			store = input.nextLine().trim();
			lines.add(store);
			if (store.length() > n) {
				n = store.length();
			}
		} while (input.hasNextLine());

		// input = new Scanner(s);

		// store = input.nextLine().trim();
		for (int i = 0; i < lines.size() - 1; i++) {
			raggedness = raggedness + (n - lines.get(i).length())
					* (n - lines.get(i).length());
			// store = input.nextLine();
		}
		System.out.println(raggedness);
	}

}
