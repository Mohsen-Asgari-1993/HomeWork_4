package H_M_4.Tamrin3;

public class Billing {
    public static double computeBill(double price) {
        double tax = price + (0.08 * price);
        return tax;
    }

    public static double computeBill(double price, int quantity) {
        double tax = price + (0.08 * price);
        return tax * quantity;
    }

    public static double computeBill(double price, int quantity, double coupon) {
        double totalPrice = (price * quantity) - coupon;
        if (totalPrice <= 0)
            return 0;
        else
            return totalPrice + (0.08 * totalPrice);

    }
}

