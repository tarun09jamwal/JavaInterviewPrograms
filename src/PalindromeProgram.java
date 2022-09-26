import java.util.Scanner;

public class PalindromeProgram
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int rem, rev=0;
        int temp= num;
        while (num>0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        if(temp == rev)
        {
            System.out.println("Number is Palindrome");
        }
        else System.out.println("Number is not Palindrome.");
    }
}
