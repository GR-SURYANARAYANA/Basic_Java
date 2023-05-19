package Java_with_Terry_Martin.OOps.BasicImplementaion;

public class CompareMethod {
    public static int  compareTo(String s1,String s2){
//        if(s1.length()==0)
//            return -1;
//        else if(s2.length()==0)
//            return 1;
//        else {
//            int s= Math.max(s1.length(), s2.length());
//            for (int i = 0 ; i < s1.length(); i++) {
//                  if(s1.charAt(i) == s2.charAt(i))
//                      continue;
//                  else {
//                      return (s1.charAt(i) > s2.charAt(i)) ? 1 : -1;
//                  }
//            }
//        }
        int s=Math.min(s1.length(),s2.length());
        for (int i = 0; i < s; i++) {
            if(s1.charAt(i)!=s2.charAt(i))
                return s1.charAt(i)-s2.charAt(i);
        }
        return s1.length()-s2.length();
    }

    public static void main(String[] args) {
        System.out.println(compareTo("apple","ball"));
    }
}

