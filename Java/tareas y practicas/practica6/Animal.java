package practica6;

abstract public class Animal {
    private String food;
    private int hunger;
    private int boundaries;
    private String location;

    public void makeNoise() {
        System.out.println("Animal makeNoise");
    }

    public void eat() {
        System.out.println("Animal eat");
    }

    public void sleep() {
        System.out.println("Animal sleep");
    }

    public void roam() {
        System.out.println("Animal roam");
    }

    public String getFood() {
        return food;
    }

    public int getHunger() {
        return hunger;
    }

    public int getBoundaries() {
        return boundaries;
    }

    public String getLocation() {
        return location;
    }

    public void setFood(String newFood) {
        food = newFood;
    }

    public void setHunger(int newHunger) {
        hunger = newHunger;
    }

    public void setBoundaries(int newBoundaries) {
        boundaries = newBoundaries;
    }

    public void setLocation(int newLocation) {
        boundaries = newLocation;
    }
}