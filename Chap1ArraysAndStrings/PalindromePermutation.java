public class PalindromePermutation {
    static boolean palindromePermutation(String str) {
        str = str.toLowerCase().replaceAll(" ", "");
        String copy = str;
        int count = 0;
        boolean hasOddChar = false;
        for(int i = 0; i < str.length() ; i++) {
            copy = copy.replaceAll(String.valueOf(str.charAt(i)), "");
            count = str.length() - copy.length();
            if(count != 0 && count%2 != 0) {
                if(!hasOddChar) {
                    hasOddChar = true;
                }
                else {
                    return false;
                }
            }
            copy = str;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean x = palindromePermutation("Tact coa");
        System.out.println(x);

    

    }
    
}