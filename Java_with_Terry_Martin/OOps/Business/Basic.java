package Java_with_Terry_Martin.OOps.Business;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic {
    public static void main(String[] args) {
        String people= """
                Flinstone, Freed, 1/1/1980, Programmer
                Rubble, Barney, 5/5/1905, Manager
                Flinstone, Freed, 10/12/1980, Analyst
                Rubble, Barney, 22/12/1905, CEO
                """;
//        String regex = "(?<lastName>\\w+),\\s+(?<firstName>\\w+),\\s+(?<dob>\\w+),\\s+(?<role>\\w+)\\n";
        String regex="(?<lastName>\\w+),\\s+(?<firstName>\\w+),\\s+(?<dob>.*),\\s+(?<role>\\w+)\\n";
        Pattern peoplePat=Pattern.compile(regex);
        Matcher peopleMat=peoplePat.matcher(people);
        System.out.println(peopleMat.find());
        int totalSalary=0;
        while(peopleMat.find()){
            totalSalary+=switch(peopleMat.group("role")){
                case "Programmer"->3000;
                case "Manager"->3500;
                case "Analyst"->2500;
                case "CEO"->5000;
                default -> 0;
            };
        }
        NumberFormat moneyFormat=NumberFormat.getCurrencyInstance(Locale.US);
        System.out.printf("%s",moneyFormat.format(totalSalary));
    }
}
