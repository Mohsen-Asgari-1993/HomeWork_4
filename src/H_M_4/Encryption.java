package H_M_4;

public class Encryption {
    private String message;
    private int code;

    public void getMessage(String massage) {
        this.message = massage;
    }

    public void getCode(int code) {
        this.code = code;
    }

    public char encrypt(char ch) {
        int ascii = ch;
        return (char) (ascii + code);
    }

    public String encryptAll() {
        String encrypted="";
        int length = message.length();
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            if (message.charAt(i) == ' ') {
                chars[i] = ' ';
            } else {
                chars[i] =encrypt(message.charAt(i));
            }
        }
        for (char c : chars)
            encrypted +=c;
        return encrypted;
    }
}
