package H_M_4;

public class Encryption {
    public char encrypt(char ch , int code){
        int ascii = ch;
        return (char)(ascii+code);
    }
}
