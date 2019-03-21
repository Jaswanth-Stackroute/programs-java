import java.util.*;
class VowelOrCon
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a word:");
        String str= scan.nextLine();
        if(isNumber(str))       // check given word has numbers
            System.out.println("please!!! enter a word.....");
        else
        {
            for(int i=0;i<str.length();i++)
            {
                char ch = str.charAt(i);
                if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
                        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
                        ch=='u' || ch=='U')
                    System.out.print("Vowel ");
                else
                    System.out.print("Consonent ");
            }
        }

    }
    static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == true)
                return true;

        return false;
    }
}