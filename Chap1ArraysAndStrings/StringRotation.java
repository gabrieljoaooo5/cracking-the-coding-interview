public class StringRotation {
    static boolean rotation(String str1, String str2) {
        if(str1.length() == str2.length()) {
            String str1str1 = str1+str1;
            return str1str1.contains(str2);
        }
        return false;
    }
    public static void main(String[] args) {
        boolean x = rotation("waterbottle", "erbottlewat");
        System.out.println(x);
    }
    
}