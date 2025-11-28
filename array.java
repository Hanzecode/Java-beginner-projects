import java.util.Arrays;

public class array {
    public static void main(String[] args){
        String[] fruits = {"apple","banana","orange"};

        for(int i =0; i<fruits.length; i++){
            System.out.println(fruits[i]);
        }
        System.out.print("\n");
        Arrays.sort(fruits);
        Arrays.fill(fruits,"pineapple");


        for(String fruit : fruits){
            System.out.println(fruit);
        }


    }
}
