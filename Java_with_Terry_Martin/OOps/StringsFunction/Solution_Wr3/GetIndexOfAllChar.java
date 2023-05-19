package Java_with_Terry_Martin.OOps.StringsFunction.Solution_Wr3;

public class GetIndexOfAllChar {
    public static void main(String[] args) {
        String txt="The quick brown fox jumps over the lazy dog.";
        char C='a';
        System.out.println(txt.replace("fox","cat"));
        System.out.println(txt.substring(10,25));
        System.out.println(txt.substring(txt.indexOf("brown"),txt.indexOf("over")));
        for (int i = 0; i < 25; i++) {
            String lowerCase = txt.toLowerCase();
            int getCharindex = lowerCase.indexOf(C++);
            System.out.println(C+"---->"+ getCharindex);

        }
    }
}
