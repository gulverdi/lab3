import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");

        int min = input.nextInt();

        for (int i = 1; i < 10; i++) {
            int num = input.nextInt();
            if (num < min) {
                min = num;
            }
        }

        System.out.println("The minimum number is: " + min);

    }
}