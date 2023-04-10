
class Cat {

    // write static and instance variables
    String name;
    int age;

    static int numberOfCats = 0;


    public Cat(String name, int age) {
        // implement the constructor
        this.name = name;
        this.age = age;
        numberOfCats++;
        // do not forget to check the number of cats
        if (numberOfCats > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return numberOfCats;
    }
}
