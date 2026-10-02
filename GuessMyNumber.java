import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {   
        Scanner in= new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        int guess= in.nextInt();
        while (guess!=number) {
			if(guess<number) {System.out.println("too low, try again"); guess= in.nextInt();}
			if(guess>number) {System.out.println("too high, try again"); guess= in.nextInt();}
		}
		if(guess==number) {System.out.println("YOU GOT IT!");}
    }
}
