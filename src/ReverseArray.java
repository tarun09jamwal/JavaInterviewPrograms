import java.util.Scanner;

public class ReverseArray
{
    public static void main(String args[]) {
        int count, i;
        int input[] = new int[100];
        int output[] = new int[100];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array");
        count = scanner.nextInt();

        System.out.println("Enter " + count + " Numbers");
        for (i = 0; i < count; i++) {
            input[i] = scanner.nextInt();
        }
        for (i = 0; i < count; i++) {
            output[i] = input[count - i - 1];
        }
        System.out.println("Reversed Array");
        for (i = 0; i < count; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
