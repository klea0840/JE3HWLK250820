package task3Vehicle;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        Plane plane = new Plane(10000, 300);
        Ship ship = new Ship("Mumbai", 8000);

        Vehicle[] allVehicle = {car, plane, ship};
        for (Vehicle v: allVehicle) {
            v.showinfo();
            System.out.println("+++++++++++++++++++++++");
        }
    }
}
