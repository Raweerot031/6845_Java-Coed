package Loop;

import java.util.Random;
import java.util.Scanner;

public class W13_02_GuessNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();
    
        int answer = rand.nextInt(10) + 1;
        //System.out.println("Random number is generated: " + answer);
    
        int countGuess = 0;
        boolean win = false;

        // เปลี่ยนเป็น for loop
        for (countGuess = 0; countGuess < 3; countGuess++) {
            System.out.print("Enter your guess (1-10): ");
            int guess = kb.nextInt();

            if (answer == guess) {
                System.out.println("Correct !");
                System.out.println("=================WIN===================");
                win = true;
                break;
            } else {
                System.out.println("Incorrect");
                System.out.println("=================LOSE===================");
            }
        }

        if (!win) {
            System.out.println("Game Over. The correct number was: " + answer);
        }

        kb.close();
    }
}
