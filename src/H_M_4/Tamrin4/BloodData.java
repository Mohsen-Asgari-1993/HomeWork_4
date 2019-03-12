package H_M_4.Tamrin4;

public class BloodData {
    private String bloodType;
    private char rh;

    public BloodData() {
        this.bloodType = "O";
        this.rh = '+';
    }

    public BloodData(String bloodType, char rh) {
        this.bloodType = bloodType;
        this.rh = rh;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public char getRh() {
        return rh;
    }

    public void setRh(char rh) {
        this.rh = rh;
    }
}
