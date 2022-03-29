package homeworkweek8;

import java.util.Scanner;

public class Program6
{
    public static void main(String[] args) {
        triangle(); // calling the static method directly

    }


    public static void triangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        for(int i = 1; i<=num;i++)
        {
            System.out.println(" ");

            for(int j = 1;j<=i;j++)
            {
                System.out.print(""+j);
            }


        }




    }




}
