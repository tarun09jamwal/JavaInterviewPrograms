import java.util.Scanner;

public class Factoiral
{
    public static void main(String[] args)
    {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        for (int i= 1; i<=num; i++)
        {
            fact = fact *i;
        }
        System.out.println(fact);
    }
}
