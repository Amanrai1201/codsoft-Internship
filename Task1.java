import java.util.Random;
import java.util.Scanner;

//guessing the number game

public class Task1 {

    private  static final int min_range = 0;
    private  static final int max_range = 100;
    private  static final int max_attempts = 8;
    private  static final int max_rounds = 2;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int finalscore = 0;

        System.out.println("                NUMBER GUESSING GAME              ");
        System.out.println("TOTAL NUMBER OF ROUNDS : 2");
        System.out.println("Attempts to Guess the Number In Each Round : " + max_attempts);
        
        for(int i = 1; i<=max_rounds; i++){
            int number = random.nextInt(max_range) + min_range;
            int Attempts = 0;


        System.out.println("Round " + i + " : Guess the Number between "+ min_range + " to " + max_range  + " in " + max_attempts + " attempts.");
            while (Attempts < max_attempts) {
                System.out.println("Enter your guess : ");
                int guess_number = sc.nextInt();
                Attempts = Attempts + 1;
                int Attempts_left = max_attempts - Attempts;

                if (guess_number == number) {
                    int score =  max_attempts - Attempts;
                    finalscore = finalscore + score;
                    System.out.println("Hurray!! Number Gussed Successfully. Attempts " + Attempts + ". Round Score "+ score );
                    break;
                }
                else if (guess_number < number){
                    
                    System.out.println(" The Number  is greater than " + guess_number + ", Attempts left " + Attempts_left);
                }
                else if (guess_number > number){
                    System.out.println(" The Number  is Smaller than " + guess_number + ", Attempts left " + Attempts_left);
                }
        }
            if (Attempts == max_attempts) {
                System.out.println("Round = " + i);
                System.out.println("Attempts left = 0");
                System.out.println("The Random Number is = " + number);
            }
    }
        System.out.println("Game Over. Total Score = " + finalscore);
}
}