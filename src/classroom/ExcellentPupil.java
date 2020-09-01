package classroom;

public class ExcellentPupil extends Pupil{
    @Override
    void study() {

        System.out.println("Studying: excellent");
    }

    @Override
    void read() {

        System.out.println("Reading: excellent");
    }

    @Override
    void write() {

        System.out.println("Writing: excellent");
    }

    @Override
    void relax() {
        System.out.println("Relaxing: average");
    }


}
