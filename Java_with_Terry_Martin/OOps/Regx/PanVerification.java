package Java_with_Terry_Martin.OOps.Regx;

public class PanVerification {
    public static void main(String[] args) {
        //FLCPR212K
//    AAAAA1234A
        String firstName = "Suryanarayana";
        String lastName = "GR";
        String panCardNo="FLCPR212K";
        System.out.println(panCardNo.matches("[\\w]{3}[PCHABRGJFLT][GRS]\\d{3,4}[\\w]"));
    }
}
