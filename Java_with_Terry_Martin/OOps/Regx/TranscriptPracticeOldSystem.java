package Java_with_Terry_Martin.OOps.Regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TranscriptPracticeOldSystem {
    public static void main(String[] args) {
        String transcipt= """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;
        //constructor parameter as regex,and mode
        //.* rejects carriage return and new line feed
//        String regex = """
//        Student\\sNumber:\\s+(?<Number>\\d{10})\\s+ # grabbing the student id
//        Grade:\\s+(?<Grade>\\d{1,2})\\n #Grabbing the student Grade
//        Birthdate:\\s+(?<date>\\d{1,2})[-/](?<month>\\d{1,2})[-/](?<year>\\d{4}).* #Grabbing the student date of birth
//        Gender:\\s+(?<gender>\\w+).* #Grabbing the gender
//        State\\sID:\\s+(?<stateID>\\d+).* #grab's state id
//        Cumulative\\sGPA\\s\\(Weighted\\)\\s+(?<weightedGPA>\\d+.\\d+).* #we can also use [\\d\\.]+
//        Cumulative\\sGPA\\s\\(Unweighted\\)\\s+(?<unweightedGPA>\\d.\\d+).*
//        """;
        //greedy operator work
//        String regex = """
//        Student\\sNumber:\\s+(?<Number>\\d{10})\\s+ # grabbing the student id
//        Grade:\\s+(?<Grade>\\d{1,2})\\n #Grabbing the student Grade
//        Birthdate:\\s+(?<date>\\d{1,2})[-/](?<month>\\d{1,2})[-/](?<year>\\d{4}).* #Grabbing the student date of birth
//        Gender:\\s+(?<gender>\\w+).* #Grabbing the gender
//        State\\sID:\\s+(?<stateID>\\d+).* #grab's state id
//        Cumulative.*\\s+(?<weightedGPA>\\d+.\\d+).* #we can also use [\\d\\.]+
//        #Note: In the above it prints unweighted GPA cuz it works backword
//        #Caution: Be Alert..! While using be with your skills
//        """;

        //how to overcome that backward trace of greedy operator and make to trace forward
        // using greedyoperator * followed with ?
        String regex = """
        Student\\sNumber:\\s+(?<Number>\\d{10})\\s+ # grabbing the student id
        Grade:\\s+(?<Grade>\\d{1,2})\\n #Grabbing the student Grade
        Birthdate:\\s+(?<date>\\d{1,2})[-/](?<month>\\d{1,2})[-/](?<year>\\d{4}).* #Grabbing the student date of birth 
        Gender:\\s+(?<gender>\\w+).* #Grabbing the gender
        State\\sID:\\s+(?<stateID>\\d+).*? #grab's state id
        Cumulative.*?\\s+(?<weightedGPA>\\d+.\\d+).*? #we can also use [\\d\\.]+
        #watch the differencee care fully 
        Cumulative.*?\\s+(?<unweightedGPA>\\d+.\\d+).*
        #Note: Now it can trace foward can be observered later by removing comment
        """;

//        String regex ="Student\\sNumber:\\s?(?<studentNumber>\\d{10}).*";
  //pipe symbol used to have multiple flags
        //* greedy operator
        Pattern pat=Pattern.compile(regex,Pattern.DOTALL | Pattern.COMMENTS);
        //Use pattern instance and call the method matcher allow to pass the string
        Matcher matcher=pat.matcher(transcipt);
        if(matcher.matches()){
            String Number = matcher.group("Number");
            String Grade = matcher.group("Grade");
            String date = matcher.group("date");
            String month = matcher.group("month");
            String year = matcher.group("year");
            String gender = matcher.group("gender");
            String stateID = matcher.group("stateID");
            String weightedGPA = matcher.group("weightedGPA");
            String unweightedGPA = matcher.group("unweightedGPA");

            //Number
            System.out.println("Name  : "+ Number);
            //Grade
            System.out.println("Grade : "+ Grade);
            //Dob
            System.out.println("DOB   :"+ date +"/"+ month +"/"+ year);
            //Gender
            System.out.println("Gender :"+ gender);
            //state id
            System.out.println("State ID:"+ stateID);
//            GPA
            System.out.println("Cumulative GPA (Weighted)"+ weightedGPA);
            System.out.println("Cumulative GPA (UnWeighted)"+ unweightedGPA);
        }
        else{
            System.out.println("Incorrect match");
        }
    }
}
