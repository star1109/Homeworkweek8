package homeworkweek8;

import java.util.Scanner;

public class Program10
{

    public static void main(String[] args) {
    armstrong();
    }

    public static void armstrong()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();


        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }


}
