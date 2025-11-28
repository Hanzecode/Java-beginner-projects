import java.util.Scanner;

public class banking_program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String barrier = "*";
        String name = "Banking programme";
        String option = "1. Show Balance\n2.Deposit\n3. Withdraw\n4. Exit";
        int num;
        double balance;
        double deposit;
        double withdrawn;

        

        balance = 0;
        deposit = 0;
        withdrawn = 0;

        do{
            System.out.println(barrier_char(barrier,name.length()));
            System.out.println(name);
            System.out.println(barrier_char(barrier,name.length()));
            System.out.println(option);
            System.out.println(barrier_char(barrier,name.length()));
            System.out.println("Enter your choice (1-4): ");
            num = scanner.nextInt();

            if(num ==1){
                System.out.println("$" +balance );

            }
            else if(num == 2){
                System.out.print("Enter amount to be deposit: ");
                deposit = scanner.nextDouble();
                if(deposit <0){
                    System.out.println("Deposit cannot be negative");
                }
                else{
                    balance += deposit;
                }
            }
            else if(num == 3){
                System.out.print("Enter amount to be withdrawn: ");
                withdrawn = scanner.nextDouble();
                if(withdrawn > balance){
                    System.out.println("You don't have enough money");
                }
                else if(withdrawn <0){
                    System.out.println("withdrawn cannot be negative");
                }
                else{
                    balance -= withdrawn;
                }
            }
            else if(num == 4){
                System.out.println("Programme finished");
            }
            else{
                System.out.println("out of range");
            }

        }while(num != 4);
    }

    static String barrier_char(String bar, int length){
        String result = "";
        for(int i = 0; i < length; i++){
            result += bar;
        }
        return result;
    }
}
