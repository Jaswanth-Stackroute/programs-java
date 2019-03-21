import java.util.*;
class EvenOrOdd
{
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number:");
        n=scan.nextInt();
        if(n>20&&n<30)
            if(n%2==0)
                 System.out.println("Jerry");
            else
                System.out.println("Tom");
    }
}