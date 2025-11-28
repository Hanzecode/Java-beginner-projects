public class array_2d {
    public static void main(String[] args){

        // 2D array = An array where each element is an array Useful for storing a matrix of data


        String[][] groceries = {{"chicken","beef","pork"},
                                {"broccoli","onion","spring onion"},
                                {"apple","banana","orange"}};

        groceries[1][2] = "thembulon";
        
        for(String[] foods: groceries){
            for(String food: foods){
                System.out.print(food+" ");
            }
            System.out.println(); // this will create a space line between arrays
        };

    }
}