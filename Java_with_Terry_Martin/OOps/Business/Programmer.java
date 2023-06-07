package Java_with_Terry_Martin.OOps.Business;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programmer implements Employee {
    private String firstname;
    private String lastname;
    private LocalDate dob;
    private String detail;
    private int locpd;
    private int yoe;
    private int iq;
    private int salary=3500;

    final private String peopleregex ="(?<lastName>\\w+),\\s+(?<firstName>\\w+),\\s+(?<dob>.*),\\s+(?<role>\\w+),\\s+\\{(?<detail>.*)\\}\\n";
    final private String detailRegex ="\\w+=(?<locpd>\\w+),\\w+=(?<yoe>\\w+),\\w+=(?<iq>\\w+)";
    final private Pattern peoplePat=Pattern.compile(peopleregex);
    final private Pattern detailPat=Pattern.compile(detailRegex);

    DateTimeFormatter dtFormatter=DateTimeFormatter.ofPattern("M/d/yyyy");
    NumberFormat moneyFormat=NumberFormat.getCurrencyInstance();
    Programmer(String person){
        Matcher peopleMat=peoplePat.matcher(person);
        if(peopleMat.matches()){
            this.firstname=peopleMat.group("firstName");
            this.lastname=peopleMat.group("lastName");
            dob=LocalDate.from(dtFormatter.parse(peopleMat.group("dob")));
            this.detail=peopleMat.group("detail");
        }
        Matcher detailMat=detailPat.matcher(detail);
        if(detailMat.matches()){
         this.locpd= Integer.parseInt(detailMat.group("locpd"));
         this.yoe= Integer.parseInt(detailMat.group("yoe"));
         this.iq= Integer.parseInt(detailMat.group("iq"));
         salary+=locpd*yoe*iq;
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
