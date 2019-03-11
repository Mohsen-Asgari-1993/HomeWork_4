package H_M_4;

public class Encryption {
    private static char encrypt(char ch, int code) {
        int ascii = ch;
        return (char) (ascii + code);
    }

    public static String encryptAll(String message, int code) {
        int length = message.length();
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            if(message.charAt(i)==' ')
                chars[i]=' ';
            else {
                chars[i]=encrypt(message.charAt(i),code);
            }
        }
        String encrypted="";
        for (char ch : chars)
            encrypted +=ch;
        return encrypted;
    }
}
