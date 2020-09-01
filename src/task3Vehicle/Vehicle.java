package task3Vehicle;

public class Vehicle {

    double price;
    int speed;
    int year;

    public Vehicle() {
        this.price = 1000000;
        this.speed = 60;
        this.year = 2015;
    }

    public double getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    public void showinfo() {
        System.out.println("The price: " + getPrice());
        System.out.println("The speed: " + getSpeed());
        System.out.println("The year: " + getYear());

    }
}

