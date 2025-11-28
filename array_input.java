import java.util.Scanner;

public class array_input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of fruit that you want to add: ");
        int num = scanner.nextInt(); 
        scanner.nextLine();
        String[] list = new String[num];

        for(int i=0;i<num;i++){
            System.out.print("Enter a product: ");
            list[i] = scanner.nextLine();

        }


        System.out.println("Your basket include: ");
        for(String li: list){
            System.out.println(li);
        }
    }
}
