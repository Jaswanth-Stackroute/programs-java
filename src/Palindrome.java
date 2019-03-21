import java.util.*;
class Palindrome
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);  //scanner to accept input from user
        long n;
        System.out.println("Enter a number:");
        n=scan.nextLong();    // accept number from user
        long temp=n,sum=0,even_sum=0;
        while(n!=0)
        {
            long t=n%10;
            if(t%2==0)
                even_sum+=t;
            sum= sum*10+t;
            n=n/10;
        }
        if(temp!=sum)
            System.out.println(temp+" is not palindrome");
        else if(even_sum>=25)
            System.out.println(temp+" is palindrome and the sum of even numbers is greater than 25");
        else
            System.out.println(temp+" is palindrome and sum of even numbers is less than 25");
    }
}