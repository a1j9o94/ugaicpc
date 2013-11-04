/*
there is a number at y = x and y = x-2
if y is even y=x is y*2 and y=x+2 is 2+y*2
if y is odd y=x is (y*2)-1 and y=x+2 is ((y*2)-1)+2
*/
import java.util.*;
class NumberLadder{
    
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int numInputs = in.nextInt();
        clearBuffer();
        int x = 0;
        int y = 0;
        for(int i = 0; i < numInputs; i++){
            int hold = 0;
            x = in.nextInt();
            y = in.nextInt();
            clearBuffer();
            if(hasNumber(x,y)){
                if(y%2 == 0){
                    if(y == x){
                        hold = y*2;                    
                    }else{
                        hold = 2+y*2;                    
                    }
                }else{
                    if(y == x){
                        hold = (y*2)-1;                    
                    }else{
                        hold = 2+((y*2)-1);                    
                    }
                }
            }else{
                hold = -1;
            }

            if(hold == -1)
                System.out.println("No Number");
            else
                System.out.println(hold);
        }
        System.exit(0);
    }
    

    static boolean hasNumber(int x, int y){
        return y == x || y == (x-2);
    }
    static void clearBuffer(){
       String clear = in.nextLine();
    }
}
