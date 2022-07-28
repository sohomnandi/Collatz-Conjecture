import java.util.Scanner;

public class Main {
    public static void printCollatz(int n)
    {
        // We simply follow steps
        // while we do not reach 1
        while (n != 1)
        {
            System.out.print(n + " ");

            // If n is odd
            if ((n & 1) == 1)
                n = 3 * n + 1;

                // If even
            else
                n = n / 2;
        }

        // Print 1 at the end
        System.out.print(n);
    }

    // Driver code
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a Number: ");
        int num = sc.nextInt();
        printCollatz(num);
        System.out.println(". Collatz Conjecture !!!");
    }
}