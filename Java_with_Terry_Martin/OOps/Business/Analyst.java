package Java_with_Terry_Martin.OOps.Business;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analyst implements Employee{
    private String firstname;
    private String lastname;
    private LocalDate dob;
    private String detail;
    private int salary=2500;
    private int projectCount;
    final private String peopleregex ="(?<lastName>\\w+),\\s+(?<firstName>\\w+),\\s+(?<dob>.*),\\s+(?<role>\\w+),\\s+\\{(?<detail>.*)\\}\\n";
    final private Pattern peoplePat=Pattern.compile(peopleregex);

    final private String detailRegex ="\\w+=(?<projectCount>\\w+)";
    final private Pattern detailPat=Pattern.compile(detailRegex);


    DateTimeFormatter dtFormatter=DateTimeFormatter.ofPattern("M/d/yyyy");
    NumberFormat moneyFormat=NumberFormat.getCurrencyInstance();
    Analyst(String person){
        Matcher peopleMat=peoplePat.matcher(person);
        if(peopleMat.matches()){
            this.firstname=peopleMat.group("firstName");
            this.lastname=peopleMat.group("lastName");
            this.dob= LocalDate.from(dtFormatter.parse(peopleMat.group("dob")));
            this.detail=peopleMat.group("detail");
        }
        Matcher detailMat=detailPat.matcher(detail);
        if(detailMat.matches()){
            this.projectCount= Integer.parseInt(detailMat.group("projectCount"));
        }
        salary+=projectCount;
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
