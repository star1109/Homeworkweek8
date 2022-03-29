package homeworkweek8;

import java.util.Scanner;

public class Program3
{
    public static void main(String[] args)
    {
        Program3 obj = new Program3();
        obj.vowelorconsonant();

    }

    public void vowelorconsonant()
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a character to find it is vowel or consonant: ");
         String str = sc.nextLine().toLowerCase();


       if(str.length()>1)
       {
           System.out.println("Please enter the single character");
       }


       else if((str.charAt(0) == 'a') || (str.charAt(0) == 'e') || (str.charAt(0) == 'i') ||(str.charAt(0) == 'o') ||(str.charAt(0) == 'u'))
        {
            System.out.println(str +" is a vowel");
        }
       else
       {
           System.out.println(str+" is a consonant");
       }




    }

}

