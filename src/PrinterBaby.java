public class PrinterBaby extends Printer {
    @Override
    void print(String value) {
        System.out.println((char) 27 + "[01;31m" + value);
    }
}
