import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int counter = 0;

        // write your code here
        for (int i = 0; i < Secret.values().length; i++) {
            if(Secret.values()[i].toString().startsWith("STAR")){
//                System.out.println(Secret.values()[i]);
                counter++;
            }
        }
        System.out.println(counter);
    }
}


enum Secret {
    STAR, CRASH, START // ...
}
