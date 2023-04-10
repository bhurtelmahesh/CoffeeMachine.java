import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        boolean stopped = false;
        while (!stopped) {
            int n = scanner.nextInt();
            if (n == 0) {
                stopped = true;
                break;
            } else if (n % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        scanner.close();
    }
}