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

    public char encrypt(char ch, int code) {
        return (char) (ch + code);
    }
}
