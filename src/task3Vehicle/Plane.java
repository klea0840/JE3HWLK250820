package task3Vehicle;

public class Plane extends Vehicle {

    int passengers;
    int height;

    // Неплохо было бы добавить полный конструктор (т.е. такой, который
    // позволяет задать все поля.
    // В данном случае это не требуется жестко, но иногда может пригодиться.

    public Plane(int height, int passengers) {
        super();
        this.height = height;
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getHeight() {
        return height;
    }
    @Override
    public void showinfo() {
//        System.out.println("The price: " + getPrice());
//        System.out.println("The speed: " + getSpeed());
//        System.out.println("The year: " + getYear());
        super.showinfo(); // Можно вызвать метод базового класса
        System.out.println("The height: " + getHeight());
        System.out.println("The number of passengers: " + getPassengers());

    }
}
