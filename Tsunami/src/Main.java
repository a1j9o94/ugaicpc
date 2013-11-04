import java.util.Scanner;

public class Main {

	private static Main m = new Main();
	
	private class Point{
	    protected int x;
		protected int y;
	}
	public static void main(String[] args)
	{	Scanner Keys=new Scanner(System.in);
		Point City[];
		
		
		
		while (true)
			{//create new city array with correct num of city
			City=new Point[Keys.nextInt()];
			Keys.nextLine();//clear line
			
			//get city x,y
			for (int i=0;i<City.length;i++)
			{
				//System.out.println(Keys.next());
				City[i]=m.new Point();
				City[i].x=Keys.nextInt();
				City[i].y=Keys.nextInt();
				Keys.nextLine();//clear line
			}
			
			//sort points
			sort(City,City.length-1);
			
			System.out.println(City[0].y);
			System.out.println(City[1].y);
			System.out.println(City[2].y);
			
			
		}
	}
	private static void sort(Point[] city, int length) {
				
	}
	

}