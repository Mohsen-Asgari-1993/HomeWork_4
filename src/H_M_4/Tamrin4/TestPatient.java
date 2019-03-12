package H_M_4.Tamrin4;

public class TestPatient {
    public static void main(String[] args) {
        Patient patient = new Patient();
        System.out.println("id = "+patient.getId());
        System.out.println("age = "+patient.getAge());
        System.out.println("blood type = "+patient.getBloodData().getBloodType());
        System.out.println("blood type = "+patient.getBloodData().getRh());

        BloodData bloodData = new BloodData("A",'+');
        Patient patient1 = new Patient(1,25,bloodData);
        System.out.println("id = "+patient1.getId());
        System.out.println("age = "+patient1.getAge());
        System.out.println("blood type = "+patient1.getBloodData().getBloodType());
        System.out.println("blood type = "+patient1.getBloodData().getRh());

    }
}
