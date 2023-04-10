import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        // write your code here
        long fact = 1;
        if (n == 0 || n == 1) {
            return 1;
        }

        while (n > 1) {
            fact *= n;
            n--;
        }
        return fact;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
        scanner.close();
    }
}