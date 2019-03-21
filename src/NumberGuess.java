import java.util.*;
class NumberGuess
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        Random rand = new Random();
        int rand_number = rand.nextInt(50);
        boolean win=false;
        int n;
        while(win==false)
        {
            System.out.println("Enter number between 1 to 50");
            n=scan.nextInt();
            if(n==rand_number)
            {
                System.out.println("Number guessed matched with original number");
                win=true;
            }
            else if(n<rand_number)
                System.out.println("Number guessed is less than original number");

            else if(n>rand_number)
                System.out.println("Number guessed is greater than original number");
        }
    }
}