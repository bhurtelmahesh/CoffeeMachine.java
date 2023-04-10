import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String a = scanner.next();
        String b = a.toUpperCase();
        if (b.startsWith("J")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}