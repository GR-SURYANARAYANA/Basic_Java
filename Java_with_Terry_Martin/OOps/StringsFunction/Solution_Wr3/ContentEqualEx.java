package Java_with_Terry_Martin.OOps.StringsFunction.Solution_Wr3;

public class ContentEqualEx {
    public static void main(String[] args) {
        StringBuffer buffer1=new StringBuffer().append("example.com and example.com");
        StringBuffer buffer2=new StringBuffer().append("Example.com and example.com");
        System.out.println(buffer1.equals(buffer2));
        String buff=new StringBuffer().append("example.com and example.com").toString();
        System.out.println(buff.contentEquals(buffer2));
    }
}

