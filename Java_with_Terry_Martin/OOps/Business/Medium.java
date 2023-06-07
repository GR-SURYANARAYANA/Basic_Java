package Java_with_Terry_Martin.OOps.Business;

import java.text.NumberFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Medium {
    static NumberFormat moneyFormat=NumberFormat.getCurrencyInstance();
    public static void main(String[] args) {
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

        String progDetail="\\w+=(?<locpd>\\w+),\\w+=(?<yoe>\\w+),\\w+=(?<iq>\\w+)";
        Pattern progPat=Pattern.compile(progDetail);

        String managerDetail="\\w+=(?<orgSize>\\w+),\\w+=(?<dr>\\w+)";
        Pattern managerPat=Pattern.compile(managerDetail);

        String analystDetail="\\w+=(?<projectCount>\\w+)";
        Pattern analystPat=Pattern.compile(analystDetail);

        String ceoDetail="\\w+=(?<avgStockPrice>\\w+)";
        Pattern ceoPat=Pattern.compile(ceoDetail);

        int totalSalary=0;
        int salary;
        while(peopleMat.find()){
            totalSalary+=switch(peopleMat.group("role")){
                case "Programmer"->{
                    Matcher progMat=progPat.matcher(peopleMat.group("detail"));
                    if(progMat.matches()) {
                        int locpd = Integer.parseInt(progMat.group("locpd"));
                        int yoe = Integer.parseInt(progMat.group("yoe"));
                        int iq = Integer.parseInt(progMat.group("iq"));
                        salary=salary = 3000 + locpd * yoe * iq;
                    }
                    else{
                        salary = 3000;
                    }
                    System.out.printf("%s %s%n",peopleMat.group("firstName"),moneyFormat.format(salary));
                    yield salary;
                }
                case "Manager"->{
                    Matcher managerMat=progPat.matcher(peopleMat.group("detail"));
                    if(managerMat.matches()){
                        int orgSize= Integer.parseInt(managerMat.group("orgSize"));
                        int dr= Integer.parseInt(managerMat.group("dr"));
                        salary=orgSize*dr+3500;
                    }
                    else{
                        salary=3500;
                    }
                    System.out.printf("%s %s%n",peopleMat.group("firstName"),moneyFormat.format(salary));
                    yield salary;
                }
                case "Analyst"->{
                    Matcher analystMat=analystPat.matcher(peopleMat.group("detail"));
                    if(analystMat.matches()){
                        int projectCount= Integer.parseInt(analystMat.group("projectCount"));
                        salary=projectCount+2500;
                    }
                    else{
                        salary=2500;
                    }
                    System.out.printf("%s %s%n",peopleMat.group("firstName"),moneyFormat.format(salary));
                    yield salary;
                }
                case "CEO"->{
                    Matcher ceoMat=ceoPat.matcher(peopleMat.group("detail"));
                    if(ceoMat.matches()){
                        int projectCount= Integer.parseInt(ceoMat.group("avgStockPrice"));
                        salary=projectCount+2500;
                    }
                    else{
                        salary=2500;
                    }
                    System.out.printf("%s %s%n",peopleMat.group("firstName"),moneyFormat.format(salary));
                    yield salary;
                }
                default -> 0;
            };

        }
        System.out.println("toatal salary is "+moneyFormat.format(totalSalary));
    }

}
