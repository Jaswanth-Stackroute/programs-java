import java.util.*;
class StringRepeat
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = scan.nextLine();

        System.out.println("Enter length of last characters to be reapeated : ");
        int len = scan.nextInt();
        String last= str.substring(str.length()-len);
        for(int i=0;i<len;i++)
        {
            str=str+last;
        }
        System.out.println(str);
    }
}