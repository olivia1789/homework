
package gridbattleships;
import java.util.Random;
import java.util.Scanner;

public class Gridbattleships {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Random random = new Random();               
        int shipX = random.nextInt(9);
        int shipY = random.nextInt(9);
        System.out.println("this is a bad version of battle ships, the aim of the game is to hit a ship within 5 tries by entering an x and y co-ordinate. good luck");
        int tries = (0);
        while (tries<5){       
        System.out.println("please enter the X co-ordinate");
        int Xco = input.nextInt();
        
        if (Xco<0){
            System.out.println("error: X co-ordinate was too small");
            System.out.println("please enter the X co-ordinate");
            Xco = input.nextInt();            
        }
        if (Xco>10){
            System.out.println("error: X co-ordinate was too big");
            System.out.println("please enter the X co-ordinate");
            Xco = input.nextInt(); 
        }
        System.out.println("please enter the Y co-ordinate");
        int Yco = input.nextInt();
        if (Yco<0){
            System.out.println("error: Y co-ordinte was too small"); 
            System.out.println("please enter the Y co-ordinate");
            Yco = input.nextInt();
        }
        if (Yco>10){
            System.out.println("error: Y co-ordinate was too big");
            System.out.println("please enter the Y co-ordinate");
            Yco = input.nextInt();
        }
        if (Xco == shipX){
            if (Yco == shipY){
                System.out.println("You hit a ship :)");
            }else{
                System.out.println("you failed to hit a ship :'(");
            }
        }else{
            System.out.println("you failed to hit a ship :'(");
        }
        tries = (tries +1);
    }
    }
    
}
