import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        
        //System.out.println("array size");
        
        int size = sc.nextInt();
        
        //System.out.println("array elements");
        
        int[] arr = new int[size];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        //System.out.print("m: ");
        
        int m = sc.nextInt();
        
        //System.out.print("n: ");
        
        int n = sc.nextInt();
        boolean stat = true;
        for (int j = 0; j < size - 1; j++) {
            if (arr[j] == m && arr[j + 1] == n || arr[j] == n && arr[j + 1] == m) {
                stat = false;
                break;
            }
        }
        System.out.println(stat);
        sc.close();
    }
}
