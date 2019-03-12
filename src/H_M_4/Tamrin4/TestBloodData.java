package H_M_4.Tamrin4;

public class TestBloodData {
    public static void main(String[] args) {
        BloodData bloodData = new BloodData();
        System.out.println(bloodData.getBloodType());
        System.out.println(bloodData.getRh());
        BloodData bloodData1 = new BloodData("A", '+');
        System.out.println(bloodData1.getBloodType());
        System.out.println(bloodData1.getRh());
    }
}
