public import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();  // Take number input from the user

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        System.out.print("Enter the limit for looping: ");
        int limit = sc.nextInt();  // Take limit for the loop from the user

        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}