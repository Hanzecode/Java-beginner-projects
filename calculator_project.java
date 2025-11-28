import java.util.Scanner;

public class calculator_project {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the first number: ");
        double first_num = scanner.nextDouble();


        System.out.println("Choose on operator(+ - * /): ");
        scanner.nextLine(); // consume the leftover newline -> 
        String operator = scanner.nextLine().strip();

        System.out.println("Give me the second number: ");
        double second_num = scanner.nextDouble();

        switch(operator){
            case "+" -> System.out.println(first_num + second_num);
            case "-" -> System.out.println(first_num - second_num);
            case "*" -> System.out.println(first_num * second_num);
            case "/" -> System.out.println(first_num / second_num);
            default -> System.out.println("Invalid operator");
        }

        scanner.close();
    }
}
