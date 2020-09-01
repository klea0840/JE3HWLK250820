public class MainTask1 {

    public static void main(String[] args) {

        Printer parent = new Printer();
        parent.print("parent's color");

        PrinterBaby baby = new PrinterBaby();
        baby.print("Another color from the baby class");

        Printer parent1 = new PrinterBaby();
        parent1.print("Another color from parent1 through the baby constructor");

        PrinterBaby2 baby2 = new PrinterBaby2();
        baby2.print("Another color from the baby2 class");

        Printer babyparent = (Printer) baby2;
        babyparent.print("Another color from babyparent ");
        System.out.println(babyparent);
        System.out.println(baby2);

        PrinterBaby2 baby3 = (PrinterBaby2) babyparent;
        baby3.print("Another color from baby3");



    }


}
