package Java_with_Terry_Martin.OOps.Regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
12345 Big St., Alphabet City, CA 90210 to the below one
1. The building number: 12345
2. The Street: “Big St.”
3. City: “Alphabet City”
4. State: “CA”
5. Postal Code: 90210
*/
public class AddressTranscript {
    public static void main(String[] args) {
        String address="12345 Big St., Alphabet City, CA 90210";
        String regex= """
                    (?<buildingNumber>\\d+) #Grabs building number
                    \\s+(?<street>.*?),\\s+ #Grabs the street
                    (?<city>.*?),\\s+ #Grabs the city name
                    (?<state>.*?)\\s+ #Grabs the state 
                    (?<postal>\\d+) #Grabs the postal code
                    """;
        Pattern pat=Pattern.compile(regex,Pattern.COMMENTS);
        Matcher mat=pat.matcher(address);
        if(mat.matches()){
            String buildingNumber = mat.group("buildingNumber");
            System.out.println("Building Number :"+buildingNumber);
            String street = mat.group("street");
            System.out.println("Street"+street);
            String city = mat.group("city");
            System.out.println("City:"+city);
            String state = mat.group("state");
            System.out.println("State:"+state);
            String postal = mat.group("postal");
            System.out.println("Postal Code:"+postal);
        }
    }
}
