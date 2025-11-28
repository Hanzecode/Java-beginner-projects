import java.util.Scanner;

public class array_search {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1,2,3,4,5,6,7,10,8,5};

        System.out.println("what is the number that you want to find? ");
        int target = scanner.nextInt();
        boolean is_found = false;

        for(int i = 0; i < numbers.length; i++ ){
            if(numbers[i] == target){
                System.out.print("Your "+ numbers[i] +" is found at index " + i);
                is_found = true;
                break;
            }
        }

        if(!is_found){
            System.out.print("We cannot find the number in array! ");
        }
        
    }
}
