package Java_with_Terry_Martin.OOps.StringsFunction.Solution_Wr3;

public class GetUnicode {
    public static void main(String[] args) {
        String myText="w3resource.com";
        System.out.println(myText.length());
        System.out.println(getUnicode(myText,myText.indexOf('3')));
        System.out.println(getUnicode(myText,myText.indexOf('e')));
    }
    public static int getUnicode(String text,int index) {
        return (int)text.charAt(index);
    }
}