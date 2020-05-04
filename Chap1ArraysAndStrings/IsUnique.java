public class IsUnique {
    static boolean isUniqueCharacters (String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean x = isUniqueCharacters("abcdefa");
        System.out.println(x);

    

    }
    
}