package homeworkweek8;

import java.util.Scanner;

public class Program8
{
    public static void main(String[] args) {

            triangle();
    }


    public static void triangle()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num ; i++)
        {
            System.out.println("");

            for(int j = 1; j<=i; j++)
            {
                System.out.print(" "+"@");
            }


        }

    }

}
