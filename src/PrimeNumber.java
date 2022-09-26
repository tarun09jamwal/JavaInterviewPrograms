import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int i,m=0,flag=0, num;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        m = num/2;
        if (num==0 ||num ==1)
        {
            System.out.println("Entered number is not a prime number.");
        }
        else
        {
            for (i=2;i<=m;i++){
                if(num%i==0){
                    System.out.println(num+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(num+" is prime number"); }
        }
    }
}
