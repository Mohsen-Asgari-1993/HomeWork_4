package H_M_4;

import java.util.Scanner;

public class EncryptMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your message : ");
        String message = scanner.nextLine();
        System.out.println("please enter your code : ");
        int code = scanner.nextInt();
        System.out.println(Encryption.encryptAll(message,code));
    }
}
