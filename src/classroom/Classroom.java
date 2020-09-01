package classroom;

public class Classroom {
    Pupil pupilsList[] = new Pupil[4];

    public Classroom(Pupil ob1, Pupil ob2, Pupil ob3, Pupil ob4) {
        this.pupilsList[0] = ob1;
        this.pupilsList[1] = ob2;
        this.pupilsList[2] = ob3;
        this.pupilsList[3] = ob4;
    }

    public Classroom(Pupil ob1, Pupil ob2) {
        this(ob1, ob2, null, null);
    }

    public Classroom(Pupil ob1, Pupil ob2, Pupil ob3) {
        this(ob1, ob2, ob3, null);
    }

    public Pupil[] getPupilsList() {
        return pupilsList;
    }

    public static void main(String[] args) {

        Pupil pupil1 = new ExcellentPupil();
        Pupil pupil2 = new GoodPupil();
        Pupil pupil3 = new BadPupil();
        Pupil pupil4 = new BadPupil();

        Classroom class1 = new Classroom(pupil1, pupil2, pupil3, pupil4);
        for (Pupil p: class1.getPupilsList()
             ) {
            p.read();
            p.study();
            p.write();
            p.relax();
            System.out.println("==================================");
        }
        Classroom class2 = new Classroom(pupil1, pupil2);
        for (Pupil p: class2.getPupilsList()
        ) {
            p.read();
            p.study();
            p.write();
            p.relax();
            System.out.println("==================================");
        }
    }
}
