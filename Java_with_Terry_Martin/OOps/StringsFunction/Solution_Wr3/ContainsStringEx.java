package Java_with_Terry_Martin.OOps.StringsFunction.Solution_Wr3;

public class ContainsStringEx {
    public static void main(String[] args) {
        String txt="Stephen Edwin King";
        String comparisonOne="Walter Winchell";
        String comparisonTwo="Mike Royko";
        String comparisonThree="stephen edwin king";
        System.out.println(txt.contains(comparisonOne));
        System.out.println(txt.contains(comparisonTwo));
        System.out.println(txt.toLowerCase().contentEquals(comparisonThree.toLowerCase()));
    }
}
