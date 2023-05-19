package Java_with_Terry_Martin.OOps.Regx;
/*
1. Write a regex that would match the following words: Dark, bark, Lark
 For extra challenge, could you additionally make it match: stark
*/
public class Practice1 {
    public static void main(String[] args) {
        String []names={"Dark","bark","Lark","stark"};
        for (String x:names) {
            System.out.println(x+" Do it matches? "+x.matches("[bBDdLlSs][t]?ark"));
        }
    }
}
