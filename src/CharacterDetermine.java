import java.util.*;
class CharacterDetermine
{
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character:");
     char ch =scan.next().charAt(0);

        if (ch>=65 && ch<=90)
             System.out.println(ch+" is a capital letter");
        else if (ch>=97 && ch<=122)
            System.out.println(ch+" is a lowercase letter");
        else if (ch>=48 && ch<=57)
            System.out.println(ch +" is a digit");
        else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)||
                (ch>=91 && ch<=96)||(ch>=123 && ch<=127))
            System.out.println(ch+" is a special character");
    }
}