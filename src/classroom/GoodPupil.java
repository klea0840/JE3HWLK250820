package classroom;

public class GoodPupil extends Pupil{

    @Override
    void study() {
        System.out.println("Studying: good");
    }
    @Override
    void read() {
        System.out.println("Reading: good");
    }
    @Override
    void write() {
        System.out.println("Writing: good");
    }
    @Override
    void relax() {
        System.out.println("Relaxing: good");
    }

}
