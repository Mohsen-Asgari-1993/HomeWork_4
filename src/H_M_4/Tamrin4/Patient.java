package H_M_4.Tamrin4;

public class Patient {
    private int id;
    private int age;
    private BloodData bloodData;

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }

    public Patient() {
        this.id = 0;
        this.age = 0;
        this.bloodData = new BloodData();
    }

    public Patient(int id , int age , BloodData bloodData){
        this.id=id;
        this.age=age;
        this.bloodData=bloodData;
    }
}
