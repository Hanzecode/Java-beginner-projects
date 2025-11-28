public class varagrs {
    public static void main(String[] args){
// varargs = allow a method to accept a varrying # of arguments
//           make methods more flexible, no need for overloaded
//           java will pack the arguments into an array

        System.out.print(average());

    }
    public static double average(double... numbers){
        
        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double num: numbers){
            sum+=num;

        }
        return sum/numbers.length;
    }
    
}
