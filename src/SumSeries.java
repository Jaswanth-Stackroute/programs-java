import java.util.*;
class SumSeries
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n,sum=0;

        System.out.println("Enter series of numbers (0) to end series:");
        try {

            while ((n = scan.nextInt()) != 0) {
                sum += n;
            }
        }
        catch (Exception e)
        {
            System.out.println("!!enter only numbers");
            System.exit(0);
        }
        System.out.println(sum);
    }
}