import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int len = 0;
        int inp = scanner.nextInt();
        while (inp != 0) {
            len++;
            inp = scanner.nextInt();
        }
        System.out.println(len);
    }
}