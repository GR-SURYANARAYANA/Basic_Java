package Java_with_Terry_Martin.OOps.Regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEx {
    public static void main(String[] args) {
        String phNo="+81-(948)-534-5454";
//        String phNo="(232) 333-2365";

//        String phNoRegex = "([+]\\d{1,3}[-.\\s]?)?(\\d{3}[-.\\s]?){1,2}\\d{4}";
        //example to capture the group in proper group manner
//        String phNoRegex = "([+]?\\d{1,3}[-.\\s]?)?(\\d{3}[-.\\s]?)(\\d{3}[-.\\s]?)\\d{4}";
//use of ?: to skip the catpuring or grouping it
//        String phNoRegex = "(?:[+]?(\\d{1,3}))[-.\\s]?(\\d{3})?[-.\\s]?(\\d{3})[-.\\s]?(\\d{4})";
        //using name as reference
//        String phNoRegex = "(?<countryCode>[+]?\\d{1,3})[-.\\s]?(?<areaCode>\\d{3})?[-.\\s]?(?<exchangeCode>\\d{3})[-.\\s]?(?<landLineNumber>\\d{4})";
        //comments in regular expression
        String phNoRegex = """
    #This is how the comment works
    (?<countryCode>[+]?\\d{1,3})?[-.\\s]? #This line is used to get the contry code
    (?<areaCode>\\(?\\d{3}?\\)?)?[-.\\s]? #This line helps to get the area or state code
    (?<exchangeCode>\\d{3})[-.\\s]?#This line helps to get the exchange code of the phone number
    (?<landLineNumber>\\d{4})#This is the line number of the code
        #Note Here:Space doesn't works in b/w regex please dont use spaces in b/w the code....!
        """;
        System.out.println(phNo.matches(phNoRegex));
        // #It's returning false in the above line cuz it also including the comments
        // #Be aware of it..!
        //using Pattern.COMMENT helps us use comment in regex expression....!
        Pattern phNoPat=Pattern.compile(phNoRegex,Pattern.COMMENTS);
        Matcher phNoMat=phNoPat.matcher(phNo);
        //that can matches the phonenumber
        //using group number
//        if(phNoMat.matches()){
//            System.out.println("Country code       : "+phNoMat.group("countryCode"));
//            System.out.println("State or Area Code : "+phNoMat.group(2));
//            System.out.println("Exchange Code      : "+phNoMat.group(3));
//            System.out.println("Land line Number   : "+phNoMat.group(4));
//        }
        //using reference name-calling the group using string
        if(phNoMat.matches()){
            System.out.println("Country code       : "+phNoMat.group("countryCode"));
            System.out.println("State or Area Code : "+phNoMat.group("areaCode"));
            System.out.println("Exchange Code      : "+phNoMat.group("exchangeCode"));
            System.out.println("Land line Number   : "+phNoMat.group("landLineNumber"));
        }
        else{
            System.out.println("Incorrect number ");
        }
    }
}
