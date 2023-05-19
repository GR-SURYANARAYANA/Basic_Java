package Java_with_Terry_Martin.OOps.Regx;

public class AdditionalCharacter {
    public static void main(String[] args) {
        /*
        * .Note:some impotant special character are as follows
        * .[^]--->acts as a not character (^ carrot)
        * .outside the square brace ^ acts as a beginning checker
        * .$ acts as an end line checker
        * . (.) acts a something it may be character or alphabet or digit
        * . * acts  as a whole same as unix
        * . \\s-->used as space character     |
                                                      \\S  x  \\s opposite of
        * . \\S-->used as a non space charcter|
        * . \\w-->used to act as a whole charcter
                \\W x \\w
        * . \\W-->used as a non whole character checker
        *. Similarly for \\d &\\D
        */
        System.out.println("dogg".matches("^.{4}$"));
        System.out.println("Surya".matches("^.{5}$"));
        System.out.println(" ".matches("\\S"));
    }
}
