package H_M_4.Tamrin3;

public class Billing {
    public static double computeBill(double price) {
        double tax = price + (0.08 * price);
        return tax;
    }
}
