//problem 5789
import java.util.*;


class Main{

	public static void main(String[] args) {
		int S;
		int B;
		Integer firstDead = 0;
		Integer lastDead = 0;
		LinkedList<Integer> frontLine;
		String newLeftBuddy = "";
		String newRightBuddy  = "";
		Scanner in = new Scanner(System.in);
		
		S = in.nextInt();
		B = in.nextInt();
		while(!(S == 0 && B == 0)){
			frontLine = new LinkedList<Integer>();
			for(int i = 1; i <= S; i++){
				frontLine.add(i);
			}
			for(int i = 1; i <= B; i++){
				firstDead = in.nextInt();
				lastDead = in.nextInt();
				if(frontLine.indexOf(firstDead) == 0){
					newLeftBuddy = "*";
				}else{
					newLeftBuddy = frontLine.get(frontLine.indexOf(firstDead)-1).toString();
				}
				if(frontLine.indexOf(lastDead) == frontLine.size()-1){
					newRightBuddy = "*";
				}else{
					newRightBuddy = frontLine.get(frontLine.indexOf(lastDead)+1).toString();
				}
				removeFromList(frontLine, firstDead, lastDead);
				System.out.println(newLeftBuddy + " " + newRightBuddy);
			}
			System.out.println("-");
			S = in.nextInt();
			B = in.nextInt();
		}
		
		in.close();
		System.exit(0);
	}

	static void removeFromList(LinkedList<Integer> frontLine,
	int firstDead, int lastDead) {
		for(Integer i = firstDead; i <= lastDead; i++){
			frontLine.remove(i);
		}
	}

}