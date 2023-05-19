package Java_with_Terry_Martin.OOps.StringsFunction.Solution_Wr3;

public class SplitEx {
    public static void main(String[] args) {
        String txt="12345 Big St., Alphabet City, CA 90210";
//        String []addressSplit=txt.split(",");
//        String []buildingNo=addressSplit[0].split(" ");
//        int postalIndex = addressSplit.length - 1;
//        String []postalCode=addressSplit[postalIndex].split(" ");
        int index1 = txt.indexOf(" ");
        int index2 = txt.indexOf("., ");
        int index3 = txt.lastIndexOf(", ");
        int index4 = txt.lastIndexOf(" ");
        System.out.println("The building number is "+ txt.substring(0, index1-1));
        System.out.println("The street address is  "+ txt.substring(index1+1, index2-1));
        System.out.println("The name of the city is "+ txt.substring(index2+2, index3-1));
        System.out.println("The state is"+ txt.substring(index3+1, index4));
        System.out.println("the Postal Code is "+ txt.substring(index4+1));
    }
}
