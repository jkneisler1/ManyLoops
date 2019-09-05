import java.util.Scanner;

public class ManyLoops {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input = 0;

        // First loop: print the numbers 1-10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        // Second loop: print the numbers 1-10 backwards
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        // Third loop: print the odd number from 1 - 20
        for (int i = 1; i < 20; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();

        // Fourth loop: print the even number from 1 - 20
        for (int i = 2; i < 21; i = i + 2)  {
            System.out.println(i);
        }
        System.out.println();

        // Fifth loop: have the user enter a positive integer and loop back to 1.
        System.out.print("Enter a positive integer greater than 1: ");
        input = keyboard.nextInt();
        for (int i = input; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        // Sixth loop: Sum all the values from 1 - 10;
        int total = 0;
        for (int i = 1; i < 11; i++) {
            total += i;
        }
        System.out.println("The total of the number from 1-10 is: " + total);
        System.out.println();

        // Seventh loop: Have the user enter a number and print the sume of all
        // numbers for that input value to 1
        System.out.print("Enter an integer: ");
        input = keyboard.nextInt();
        total = 0;
        if ( input > 0 ) {
            for (int i = 1; i <= input; i++) {
                total += i;
            }
        }
        else {
            for (int i = input; i < 0; i++) {
                total += i;
            }
        }
        System.out.println("The total sum is: " + total);
        System.out.println();

        // loop 8 a
        System.out.println("i)");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // loop 8b
        System.out.println("ii)");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // loop 8c
        System.out.println("iii)");
        for (int i = 1; i <= 5; i++) {
            // System.out.print(" ");
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k-- ) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }
}
