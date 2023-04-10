import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int max = 0;
        while (n != 0) {
            if (n >= max) {
                max = n;
            }
            n = scanner.nextInt();
        }
        System.out.println(max);
        scanner.close();
    }
}