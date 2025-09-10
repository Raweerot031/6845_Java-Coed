package Loop;

import java.util.Random;
import java.util.Scanner;
public class W13_01_GuessNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random  rand = new Random();
    
    int answer = rand.nextInt(10) + 1;

    //System.out.println("Random number is genrated :" + answer );
    
    int countGuess = 0;
    boolean win = false;

    // เข้า loop จนกว่าจะถูก

    while(countGuess < 3) {
        System.out.print("Enter your guess (1-10): ");
        int guess = kb.nextInt();

        if (answer == guess) {
            System.out.println("Correct !");
            System.out.println("=================WIN===================");
            win = true;
            break;
        }else{
            System.out.println("Incorrect");
            System.out.println("=================LOSE===================");
        }
        countGuess++;
    }
    if(win == false)
    System.out.println("Game Over. The correct numer was: " + answer);
    kb.close();
    }
}
