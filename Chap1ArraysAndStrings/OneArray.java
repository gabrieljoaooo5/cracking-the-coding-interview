public class OneArray {
    static boolean isOneEdit(String str1, String str2) {
        if(str1 == str2) {
            return true;
        }
        else if(str1.length() - str2.length() > 1 || str2.length() - str1.length() > 1) {
            return false;
        }
        else if(str1.length() == str2.length()) {
            int mistake = 0;
            for(int i = 0; i < str1.length(); i++) {
                if(mistake == 2) {
                    return false;
                }
                if(str1.charAt(i) != str2.charAt(i)) {
                    mistake+=1;
                }
            }
        }
        else {
            String shortString = str2;
            String bigString = str1;
            if(str1.length() < str2.length()) {
                shortString = str1;
                bigString = str2;
            }
            for(int i = 0; i < shortString.length(); i++) {
                if(shortString.charAt(i) != bigString.charAt(i)) {
                    for(int j = i; j < shortString.length(); j++) {
                        if(shortString.charAt(i) != bigString.charAt(j + 1)) {
                            return false;
                        }
                        i+=1;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean x = isOneEdit("ple", "pale");
        System.out.println(x);
    }
    
}