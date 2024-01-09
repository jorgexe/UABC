package practica6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        
        System.out.println("______________________________________________________");
        System.out.println("This is a cat!");
        cat.makeNoise();
        cat.eat();
        cat.sleep();
        cat.roam();
        //Store the type of food of the cat
        cat.setFood("Costo cat food ! ");
        //Print the type of food of the cat
        System.out.println("______________________________________________________");
        System.out.println("The cat food is: " + cat.getFood());
        //Print RoboCat activities
        System.out.println("______________________________________________________");
        System.out.println("This is a RoboCat!");
        RoboCat roboCat = new RoboCat();
        roboCat.beFriendly();
        roboCat.play();
    }
}
