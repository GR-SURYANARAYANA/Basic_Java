package Java_with_Terry_Martin.OOps.Regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiMatches {
    public static void main(String[] args) {
        String people= """
                Flinstone, Freed, 1/1/1980
                Rubble, Barney, 5/5/1905
                Flinstone, Freed, 10/12/1980
                Rubble, Barney, 22/12/1905               
                """;
        String regex= """
                (?<lastName>\\w+),\\s*
                (?<firstName>\\w+),\\s*
                (?<date>\\d{1,2}/\\d{1,2}/\\d{4})
                \\n""";
        Pattern pat=Pattern.compile(regex,Pattern.DOTALL|Pattern.COMMENTS);
        Matcher mat=pat.matcher(people);

//        for (int i = 0; i < 4; i++) {
//            System.out.println("The info of the person "+(i+1));
////            mat.find(); //begins from first index
//            System.out.println(mat.group("firstName"));
//            System.out.println(mat.group("lastName"));
//            System.out.println(mat.group("date"));
//
//        }
            mat.find(30); //begins from first index
            System.out.println(mat.group("firstName"));
            System.out.println(mat.group("lastName"));
            System.out.println(mat.group("date"));

    }
}
