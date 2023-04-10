import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int i = scanner.nextInt();
        int increment = 1;
        int multiply = 3;

        if (i == 1) {
            System.out.println(i);
        } else {
            System.out.print(i + " ");
        }
        while (i > 1) {
            if (i % 2 == 0) {
                i /= 2;
                System.out.print(i + " ");
            } else {
                i = i * multiply + increment;
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}