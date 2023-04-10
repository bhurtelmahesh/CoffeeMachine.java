import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        //call your implemented methods here.
        if (x <= 0) {
            return f1(x);
        }
        if (x > 0 && x < 1) {
            return f2(x);
        }
        if (x >= 1) {
            return f3(x);
        }
        return x;
    }

    //implement your methods here
    public static double f1(double x) {
        x = Math.pow(x, 2) + 1;
        return x;
    }

    public static double f2(double x) {
        x = 1 / Math.pow(x, 2);
        return x;
    }

    public static double f3(double x) {
        x = Math.pow(x, 2) - 1;
        return x;
    }
}