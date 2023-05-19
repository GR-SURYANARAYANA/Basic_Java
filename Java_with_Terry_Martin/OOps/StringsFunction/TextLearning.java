package Java_with_Terry_Martin.OOps.StringsFunction;

import java.lang.invoke.StringConcatFactory;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TextLearning {
    public static void main(String[] args) {
        //== operator
        //        String myText="abcdef";
//        System.out.println(myText.toUpperCase());
//        String myText2="ABCDEF";
//        System.out.println(myText2.toLowerCase());
        //full support of unicode...
//isempty and blank
        String a="";
        System.out.println(a.length());
//        System.out.println(a.isEmpty());//true gives with a simple double quote
//        String b="";
//        System.out.println(b.isBlank());//true that there is a blank space

//replace method
//         String myText="Here's is my awesome firf text";
//        System.out.println(myText.replace("firf","nice"));//replace work similar to word one
//        System.out.println(myText.replace('e','z'));

//        String firstName=" Kate";
//        System.out.println(firstName.strip());
// trim and strip( methods to remove space)
//        String name="    Chandranna Gr";
//        System.out.println(name.stripIndent());
//        String text="    Hi there  "+
//                    "    \nWelcome here guys how is going on?  ";
//        System.out.println(text.stripIndent());
        //trim is less aware of the space and removes all the space
//        Scanner in =new Scanner(System.in);
//        char c=in.next().stripIndent().charAt(2);
//        System.out.println(c);
    //use split in new advance version it bit cares about lot than trim if needed
// strip Leading --->removes only leading
        //strip  Trailing used to remove the spaces at end

//        String s= """
//                 First line here
//                   second line here
//                         third line here
//                """;

//        System.out.println("'"+s.stripLeading()+"'");
//        System.out.println("'"+s.stripTrailing()+"'");
//        System.out.println("'"+s.stripIndent()+"'");
        //doesn't have high effect on multi lines so use trim bit
//        System.out.println("'"+s.trim()+"'");

//  String s="   surya    ";
//        //split-->
//        System.out.println(split(s));
// String a="abcd";
// String b="ABCD i am here ";
//        System.out.println(b.contains("ABCDE "));
//        System.out.println(a.compareToIgnoreCase(b));

    //contains --->takes string and used to check whether the sequence of text contains or not
        //concat used for only one or two numbers
        //.concat is used to do this
        //using string builder to append a lot of strings
//       String a=new StringBuilder().append().append().append().toString();


        //use of String format as aa string concat
//        String name="surya";
//        String branch="cse";
//        int id=10;
//        int marks=100;
//        float avg=10.5f;
//
//      String s1=String.format("INSERT INTO STUDENT value=(%s,%s,%d,%d,%.2f)",name,branch,id,marks,avg);
//        System.out.println(s1);
//         String firstString="Apple i am here to make juice";
//         String m=firstString.substring(0,1).toLowerCase()+firstString.substring(1);
//         String a=firstString.substring(0,1);
//          //indexof(int ch)
//        //indexof(String str)
//        //indexof(int ch,int from index)--->to search from given index
//        //lastIndexOf("",int from index)---->to search from last
//        //lastIndexOf()-->used to get where the substring is present in at end or where the sequence is repeated last time
//       String phoneNumber="(234) 333-5551";
//        int addressIndexBegin = phoneNumber.indexOf('(');
//        int addressIndexEnd  =phoneNumber.indexOf(')');
//        int exchangeEnd=phoneNumber.indexOf('-');
//
//
//        String areaCode=phoneNumber.substring(addressIndexBegin+1,addressIndexEnd);
//        String exchange=phoneNumber.substring(addressIndexEnd+1,exchangeEnd).trim();
//        String lineNumber=phoneNumber.substring(exchangeEnd+1);
//        System.out.println(areaCode);
//        System.out.println(exchange);
//        System.out.println(lineNumber);

    }
//    public static String split(String text){
//
//        return text.replace("u"," ");
//    }


}
