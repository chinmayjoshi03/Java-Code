import java.util.Random;
import java.util.Scanner;

class Game{
   public Game(){
        int randomNumber = new Random();
   }
   int takeUserInput(){
    Scanner sc = new Scanner(System.in);
    int userInput = sc.nextInt();
    return userInput;
   }
   void isCorrectNumber(){
        if (randomNumber < userInput) {
            System.out.println("Number is less than generated");
            isCorrectNumber();
        }
        else if (randomNumber = userInput){
            System.out.println("You guessed correct number");

        }
        else if (randomNumber > userInput){
            System.out.println("Number is greater than generted");
            isCorrectNumber();
        }
   }
}

public class App {
    public static void main(String[] args) throws Exception {
        Game g1 = new Game();
        g1.takeUserInput();
        g1.isCorrectNumber();
    }
}
