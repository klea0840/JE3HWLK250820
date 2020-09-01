package classroom;

public class BadPupil extends Pupil{

    @Override
    void study() {

        System.out.println("Studying: bad");
    }

    @Override
    void read() {

        System.out.println("Reading: bad");
    }

    @Override
    void write() {

        System.out.println("Writing: bad");
    }

    @Override
    void relax() {

        System.out.println("Relaxing: excellent");
    }
}
