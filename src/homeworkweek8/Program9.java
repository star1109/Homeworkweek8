package homeworkweek8;

import java.util.Scanner;

public class Program9 {

    public static void main(String[] args) {
        fibonacci();
    }


    public static void fibonacci() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

       int  first = 0, second = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + ", ");

            // compute the next term
            int next = first + second;
            first = second;
            second = next;

        }
    }
}




