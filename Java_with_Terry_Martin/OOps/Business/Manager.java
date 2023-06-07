package Java_with_Terry_Martin.OOps.Business;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager implements Employee {
     private String firstname;
     private String lastname;
     private LocalDate dob;
     private String detail;
     private int dr;
     private int orgSize;
     private int salary=2500;

    final private String peopleregex ="(?<lastName>\\w+),\\s+(?<firstName>\\w+),\\s+(?<dob>.*),\\s+(?<role>\\w+),\\s+\\{(?<detail>.*)\\}\\n";
    final private Pattern peoplePat=Pattern.compile(peopleregex);
    final private String managerDetail="\\w+=(?<orgSize>\\w+),\\w+=(?<dr>\\w+)";
    final private Pattern managerPat=Pattern.compile(managerDetail);

    DateTimeFormatter dtFormatter=DateTimeFormatter.ofPattern("M/d/yyyy");
    NumberFormat moneyFormat=NumberFormat.getCurrencyInstance();
    Manager(String person){
        Matcher peopleMat=peoplePat.matcher(person);
        if(peopleMat.matches()){
            this.firstname=peopleMat.group("firstName");
                this.lastname=peopleMat.group("lastName");
                this.dob= LocalDate.from(dtFormatter.parse(peopleMat.group("dob")));
                this.detail=peopleMat.group("detail");
            }
            Matcher detailMat=managerPat.matcher(detail);
        if(detailMat.matches()){
            this.orgSize= Integer.parseInt(detailMat.group("orgSize"));
            this.dr= Integer.parseInt(detailMat.group("dr"));
            this.salary+=orgSize*dr;
        }
    }

    public int getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "firstname=" + firstname +
                ", lastname=" + lastname +
                ", dob=" + dob +
                ", salary=" + moneyFormat.format(salary);
    }
}
