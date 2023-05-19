package Java_with_Terry_Martin.OOps.Regx;

public class RegExPractice {
    public static void main(String[] args) {
//        System.out.println("Ccat".matches("[Cc]at"));//[pattern]
//        System.out.println("zat".matches("[^a-z]at"));
//        System.out.println("\\at".matches("\\wat"));
//        System.out.println("3br21Ai1000".matches("3br21[cCAaEe][SsIiEe][0-9][0-9][0-9]"));
//          System.out.println("_".matches("\\d"));
//        System.out.println("990-077-4714".matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d"));
//        System.out.println("990-077-4714".matches("\\d{3}-\\d{3}-\\d{4}"));
        String phoneNo="+676-845-997-4714";
        System.out.println(phoneNo.matches("([+]\\d{1,3}[-.\\s]?)?(\\d{3}[-.\\s]?){1,2}\\d{4}"));
        String phNo="+819-485-345-4541";

//        System.out.println(phNo.matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d"));
//        System.out.println(phNo.matches("\\d{3}-\\d{3}-\\d{3}"));
//        System.out.println(phNo.matches("(\\d{3}-){2}\\d{4}"));
        System.out.println(phNo.matches("([+]\\d{1,3}[-.\\s]?)?(\\d{3}[-.\\s]?){1,2}\\d{4}"));
    }
}
