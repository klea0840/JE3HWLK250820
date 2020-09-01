package task3Vehicle;

public class Ship extends Vehicle {

    int shippassengers;
    String port;

    public Ship(String port, int shippassengers) {
        super();
        this.port = port;
        this.shippassengers = shippassengers;
    }

    public int getShippassengers() {
        return shippassengers;
    }

    public String getPort() {
        return port;
    }

    @Override
    public void showinfo() {
        System.out.println("The price: " + getPrice());
        System.out.println("The speed: " + getSpeed());
        System.out.println("The year: " + getYear());
        System.out.println("The number of passengers:" + getShippassengers());
        System.out.println("The port: " + getPort());

    }
}
