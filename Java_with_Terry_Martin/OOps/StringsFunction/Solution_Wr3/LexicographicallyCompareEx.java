package Java_with_Terry_Martin.OOps.StringsFunction.Solution_Wr3;

public class LexicographicallyCompareEx {
    public static void main(String[] args) {
        String myText="This is Exercise 1";
        String myText2="This is Exercise 2";
        System.out.println(myText+"'"+getText(myText,myText2)+"'"+myText2);
    }
    public static String getText(String txt1,String txt2){
        String []arr={"is less than","is equal to","is greater than"};
        int result=txt1.compareToIgnoreCase(txt2);
        if(result>0)
            return arr[2];
        else if(result<0)
            return arr[0];
        return arr[1];
    }
}
