import java.util.ArrayList;
public class CheckPermutation {
    static boolean check(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        ArrayList index_set = new ArrayList();
        for(int i = 0; i < str1.length(); i++) {
            for(int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i) == str2.charAt(j) && !index_set.contains(j)) {
                    index_set.add(j);
                    j = str2.length();
                }
            }
        }
        return index_set.size() == str1.length();
    }

    public static void main(String[] args) {
        boolean x = check("joao", "aooj");
        System.out.println(x);
    }
    
}