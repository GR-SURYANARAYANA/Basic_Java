package Java_with_Terry_Martin.OOps.Business;

import java.text.NumberFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Advance {
    public static void main(String[] args) {
        NumberFormat moneyFormat=NumberFormat.getCurrencyInstance();
        String people= """
                Flinstone, Freed, 1/1/1980, Programmer, {locpd=2000,yoe=10,iq=140}
                Flinstone1, Freed1, 1/1/1980, Programmer, {locpd=1300,yoe=14,iq=100}
                Flinstone2, Freed2, 1/1/1980, Programmer, {locpd=2300,yoe=8,iq=105}
                Flinstone3, Freed3, 1/1/1980, Programmer, {locpd=1630,yoe=3,iq=115}
                Flinstone4, Freed4, 1/1/1980, Programmer, {locpd=5,yoe=10,iq=100}
                Rubble, Barney, 5/5/1905, Manager, {orgsize=300,dr=10}
                Rubble2, Barney2, 5/5/1905, Manager, {orgsize=100,dr=4}
                Rubble3, Barney3, 5/5/1905, Manager, {orgsize=200,dr=2}
                Rubble4, Barney4, 5/5/1905, Manager, {orgsize=500,dr=8}
                Rubble5, Barney5, 5/5/1905, Manager, {orgsize=175,dr=20}
                Flinstone, Wilma, 10/12/1980, Analyst, {projectCount=3}
                Flinstone2, Wilma2, 10/12/1980, Analyst, {projectCount=4}
                Flinstone3, Wilma3, 10/12/1980, Analyst, {projectCount=5}
                Flinstone4, Wilma4, 10/12/1980, Analyst, {projectCount=6}
                Flinstone5, Wilma5, 10/12/1980, Analyst, {projectCount=9}
                Rubble, Betty, 22/12/1905, CEO, {avgStockPrice=300}
                """;
        String regex="(?<lastName>\\w+),\\s+(?<firstName>\\w+),\\s+(?<dob>.*),\\s+(?<role>\\w+),\\s+\\{(?<detail>.*)\\}\\n";
        Pattern peoplePat=Pattern.compile(regex);
        Matcher peopleMat=peoplePat.matcher(people);


        int totalSalary=0;
        while(peopleMat.find()){
            Employee employee=switch (peopleMat.group("role")){
                case "Programmer"->new Programmer(peopleMat.group());
                case "Analyst"->new Analyst(peopleMat.group());
                case "CEO"->new CEO(peopleMat.group());
                case "Manager"->new Manager(peopleMat.group());
                default -> null;
            };
            System.out.println(employee);
        }
        System.out.println("Total salary is "+moneyFormat.format(totalSalary));
    }
}
