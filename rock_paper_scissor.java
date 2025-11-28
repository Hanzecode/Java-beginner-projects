import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean playagain = true;

        
        String[] choices = {"rock","paper","scissors"};
        
        while(playagain){
            System.out.print("Enter your move (rock, paper, scissors): ");
            String result = scanner.nextLine().toLowerCase();

            int index = random.nextInt(3);

            System.out.println("Your choice: " + result);
            System.out.println("Computer choice: " + choices[index]);

            if(((result.equals("rock")) && (index == 2)) || 
            ((result.equals("paper")) && (index == 0)) ||
            ((result.equals("scissors")) && (index == 1)) ){
                System.out.println("You win");
            }
            else if (((result.equals("rock")) && (index == 1)) || 
            ((result.equals("paper")) && (index == 2)) ||
            ((result.equals("scissors")) && (index == 0))){
                System.out.println("You lose");
            }
            else if(((result.equals("rock")) && (index == 0)) || 
            ((result.equals("paper")) && (index == 1)) ||
            ((result.equals("scissors")) && (index == 2))){
                System.out.println("Draw! ");
            }
            else{
                System.out.println("Invalid value");
            }
            
            System.out.println("play again (true/false)? ");
            playagain = scanner.nextBoolean();
            scanner.nextLine();
        
            
            
        }
        System.out.println("Thank you for playing");
        scanner.close();

    }
}
