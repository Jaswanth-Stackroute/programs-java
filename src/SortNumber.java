import java.util.*;
class SortNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long n = scan.nextLong();
        long even_sum=0;
        int  len=Integer.toString((int)n).length();
        long[] arr=new long[len];
        for(int i=0;i<len;i++)
        {
            if(n%10==2)
                even_sum+=n%10;
            arr[i]=n%10;
            n=n/10;
        }
        Arrays.sort(arr);

        System.out.print("Sorted number in non-increasing order:");
        for(int i=arr.length-1;i>=0;i--)
            System.out.print(arr[i]);
        System.out.println();
        System.out.println("Sum of even numbers : "+even_sum);
        if(even_sum>=15)
            System.out.println("True");
        else
            System.out.println("False");


    }
}