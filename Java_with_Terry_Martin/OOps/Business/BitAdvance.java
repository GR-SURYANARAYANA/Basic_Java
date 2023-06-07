package Java_with_Terry_Martin.OOps.Business;
/*
*The best programmer will never approach the procedural method in the jave as it is Object oriented
 ThereBy using the concept of OOP'S we thus reuduce the number of line as well as the more efficient way
 to read too.
*/

import java.text.NumberFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Interface:Main use is when there is same functionality with different classes it comes into a picture
  to reduce the instance of the object's of different class and helps them to be in one instance of interface class
 */
public class BitAdvance {
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
            totalSalary+=switch (peopleMat.group("role")){
                case "Programmer"->{
                    Programmer programmer=new Programmer(peopleMat.group());
                    System.out.println(programmer);
                    yield programmer.getSalary();
                }
                case "Manager"->{
                    Manager manager=new Manager(peopleMat.group());
                    System.out.println(manager);
                    yield manager.getSalary();
                }
                case "Analyst"->{
                    Analyst analyst=new Analyst(peopleMat.group());
                    System.out.println(analyst);
                    yield analyst.getSalary();
                }
                case "CEO"->{
                    CEO ceo=new CEO(peopleMat.group());
                    System.out.println(ceo);
                    yield ceo.getSalary();
                }
                case default->0;
            };


        }
        System.out.println("Total salary is "+moneyFormat.format(totalSalary));
    }
}
