import java.util.*;
class StringReverse
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String source = scan.nextLine();
        String reverse = "";
        for (int i = source.length() - 1; i >= 0; i--) {
            reverse = reverse + source.charAt(i);
        }

        System.out.println(reverse);
    }

}