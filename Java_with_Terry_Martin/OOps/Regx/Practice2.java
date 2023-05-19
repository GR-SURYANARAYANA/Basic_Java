package Java_with_Terry_Martin.OOps.Regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
2. Use capture groups to write a regex that could match: Abracadabra or Agracadagra
*/
public class Practice2 {
    public static void main(String[] args) {
        String []regex={"Abracadabra","Agracadagra"};
        String regexExpression ="\\w(?<first>\\w{3})\\w\\w\\w\\w(?<second>\\w{3})";
        for (String x:regex) {
            System.out.println(x+" Does the regex expression matches ?"+x.matches(regexExpression));
            Pattern pat=Pattern.compile(regexExpression,Pattern.COMMENTS);
            Matcher mat=pat.matcher(x);
            //#Note:Don't Forget to add the .matches method or else it will throw an Execption
            if(mat.matches()) {
                String firstGroup = mat.group(1);
                String secondGroup = mat.group(2);
                System.out.println("Do their group matches ? ");
                if (firstGroup.equalsIgnoreCase(secondGroup)) {
                    System.out.println("Yes...!They do match with their groups too");
                } else {
                    System.out.format("No...! %s is not matches to the %s", firstGroup, secondGroup);
                }
            }
            else{
                System.out.println("No they cant be performed");
            }
        }
    }
}
