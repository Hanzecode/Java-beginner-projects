import java.util.Scanner;
import java.util.Random;

public class dice_roller_programme {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("How many times you want to roll: ");
        int times = scanner.nextInt();

        for(int i = 0;i<times;i++){
            int ran = random.nextInt(1,7);
            shape(ran);
            System.out.println("You rolled: " + ran);
        }
    }
    static void shape(int roll){
            String dice1 = """
                 -------
                |       |
                |   *   |
                |       |
                 -------
                """;
            String dice2 = """
                 -------
                |     * |
                |       |
                | *     |
                 -------
                """;
            String dice3 = """
                 -------
                |     * |
                |   *   |
                | *     |
                 -------
                """;
            String dice4 = """
                 -------
                | *   * |
                |       |
                | *   * |
                 -------
                """;
            String dice5 = """
                 -------
                | *   * |
                |   *   |
                | *   * |
                 -------
                """;
            String dice6 = """
                 -------
                | *   * |
                | *   * |
                | *   * |
                 -------
                """;

            switch(roll){
                case 1 -> System.out.println(dice1);
                case 2 -> System.out.println(dice2);
                case 3 -> System.out.println(dice3);
                case 4 -> System.out.println(dice4);
                case 5 -> System.out.println(dice5);
                case 6 -> System.out.println(dice6);
                default -> System.out.print("Invalid dice time");

            }
    }
}
