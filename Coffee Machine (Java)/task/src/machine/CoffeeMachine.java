package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static Scanner scanner = new Scanner(System.in);
    //現在、コーヒーマシンにある物の量
    public static int water = 400;
    public static int milk = 540;
    public static int coffee = 120;
    public static int cups = 9;
    public static int money = 550;


    public static void main(String[] args) {
        act();
        scanner.close();
    }

    public static void printIt(){ //現在のある量を表示する
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffee + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$"+ money + " of money");
        act();
    }
    public static void espresso(){ //エスプレッソ選択されたら
        if( water < 250 ){
            System.out.println("Sorry, not enough water");
            act();
        }else if(coffee < 16){
            System.out.println("Sorry, not enough coffee beans");
            act();
        }else if (cups < 1){
            System.out.println("Sorry, not enough cups");
            act();
        }else{
            water -= 250;
            coffee -= 16;
            cups -= 1;
            money += 4;
            System.out.println("I have enough resources, making you a coffee!");
            act();
        }
    }
    public static void latte(){ //　ラテ選択されたら
        if( water < 350 ){
            System.out.println("Sorry, not enough water");
            act();
        }else if(coffee < 20){
            System.out.println("Sorry, not enough coffee beans");
            act();
        }else if (cups < 1){
            System.out.println("Sorry, not enough cups");
            act();
        }else if (milk < 75){
            System.out.println("Sorry, not enough milk");
            act();
        }else{
            water -= 350;
            milk -= 75;
            coffee -= 20;
            cups -= 1;
            money += 7;
            System.out.println("I have enough resources, making you a coffee!");
            act();
        }
    }

    public static void cappuccino(){ //　カプチーノ選択されたとき
        if( water < 200 ){
            System.out.println("Sorry, not enough water");
            act();
        }else if(coffee < 12){
            System.out.println("Sorry, not enough coffee beans");
            act();
        }else if (cups < 1){
            System.out.println("Sorry, not enough cups");
            act();
        }else if (milk < 100){
            System.out.println("Sorry, not enough milk");
            act();
        }else{
            water -= 200;
            milk -= 100;
            coffee -= 12;
            cups -= 1;
            money += 6;
            System.out.println("I have enough resources, making you a coffee!");
            act();
        }
    }

    public static void fill(){//　fill 入力されたら
        System.out.println("Write how many ml of water you want to add:");
        int waterToAdd = scanner.nextInt();
        scanner.nextLine();
        water += waterToAdd;
        System.out.println("Write how many ml of milk you want to add:");
        int milkToAdd = scanner.nextInt();
        scanner.nextLine();
        milk += milkToAdd;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeToAdd = scanner.nextInt();
        scanner.nextLine();
        coffee += coffeeToAdd;
        System.out.println("Write how many disposable cups you want to add:");
        int cupsToAdd = scanner.nextInt();
        scanner.nextLine();
        cups += cupsToAdd;
        menu();
    }

    public static void buy(){//　buy　入力されたら
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1" ->  //　１はエスプレッソ
                    espresso();
            case "2" ->  //２はラテ
                    latte();
            case "3" ->  //　３はカプチーノ
                    cappuccino();
            case "back" -> menu();
            default -> {
                System.out.println("Invalid input! Please type your choice correctly:");
                buy();
            }
        }
    }

    public static void take(){//　take 入力されたら
        System.out.println("I gave you $" + money);
        money = 0;
        menu();
    }

    public static void act() {//　マシンの最初の動き
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.nextLine();
        switch (action) {
            case "buy" -> buy();
            case "fill" ->  //量を入れたいとき
                    fill();
            case "take" -> //　take の時
                    take();
            case "remaining" -> //remaining の時
                    remaining();
            case "exit" -> //exit の時
                    System.exit(0);
            default -> menu();
        }
    }

    public static void menu(){
        act();
    }

    public static void remaining(){
        printIt();
        menu();
    }
}
