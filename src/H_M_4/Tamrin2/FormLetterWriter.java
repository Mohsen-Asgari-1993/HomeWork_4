package H_M_4.Tamrin2;

public class FormLetterWriter {
    public static void main(String[] args) {
        String firstName = "mohsen";
        String lastName = "Asgari";
        displaySalutation(lastName);

        displaySalutation(firstName,lastName);
    }

    public static void displaySalutation(String lastname){
        System.out.println("Dear Mr."+lastname+"\n Thank you for your recent order");
    }
    static void displaySalutation(String firstName , String lastName){
        System.out.println("Dear Mr."+firstName+" "+lastName+"\n Thank you for your recent order");
    }
}
