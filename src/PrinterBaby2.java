public class PrinterBaby2 extends Printer {

    @Override
    void print(String value) {
        System.out.println((char) 27 + "[01;33m" + value);
    }
}
