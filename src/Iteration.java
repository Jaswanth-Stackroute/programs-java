import java.util.*;
class Iteration
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            int temp=i;
            for(int j=1;j<=i;j++)
                System.out.print(temp+" ");
        }
    }
}