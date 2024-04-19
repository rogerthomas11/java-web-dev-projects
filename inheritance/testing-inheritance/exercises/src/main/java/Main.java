public class Main {

    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());   // prints true

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());
        System.out.println(spike.noise());

        Cat salem = new Cat(8);
        System.out.println(salem.noise());
    }
}
