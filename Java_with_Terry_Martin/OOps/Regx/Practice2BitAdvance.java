package Java_with_Terry_Martin.OOps.Regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
2. Use capture groups to write a regex that could match: Abracadabra or Agracadagra
*/
public class Practice2BitAdvance {
    public static void main(String[] args) {
       String []text= {"Abrocadabro","Agracadagra"};
       String regex="\\w(?<name>\\w{3})\\w+(\\k<name>)";
        for (String x:text) {
            Pattern pat=Pattern.compile(regex,Pattern.COMMENTS);
            Matcher mat= pat.matcher(x);
            if(mat.matches()){
                String group = mat.group("name");
                System.out.println(x+"Yay..!Their group("+group+") as well as regex matches");
            }
            else{
                System.out.println("No..!They don't match");
            }
        }
    }
}
