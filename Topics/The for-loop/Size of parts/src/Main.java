import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int large = 0;
        int small = 0;
        int perfect = 0;

        for (int i = 1; i <= n; i++) {
            int j = scanner.nextInt();

            if (j < 0) {
                small++;
            } else if (j > 0) {
                large++;
            } else {
                perfect++;
            }
        }
        System.out.println(perfect + " " + large + " " + small);
        scanner.close();
    }
}