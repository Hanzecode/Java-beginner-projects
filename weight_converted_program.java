import java.util.Scanner;

public class weight_converted_program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int option;
        double weight;
        double new_weight;

        System.out.println("Welcome to weight converting programme");
        System.out.println("1: to give kg");
        System.out.println("2: to give lbs");
        
        option = scanner.nextInt();
        if(option == 1){
            System.out.print("Fill in your weight in kg: ");
            weight = scanner.nextDouble();

            new_weight = weight*2;
            System.out.printf("Your new weight is %.1f lbs", new_weight);

        }
        else if(option == 2){
            System.out.print("Fill in your weight in lbs: ");
            weight = scanner.nextDouble();

            new_weight = weight/2;
            System.out.printf("Your new weight is %.1f kg", new_weight);
        }
        else{
            System.out.print("You must choose 1 or 2");
        }

        
    }

}
