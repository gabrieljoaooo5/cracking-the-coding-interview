public class StringCompression {
    static String compression(String str) {
        char chr = str.charAt(0);
        int count = 0;
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == chr) {
                count+=1;
            }
            else{
                result+=(chr+String.valueOf(count));
                chr = str.charAt(i);
                count = 1;
            }
        }
        result+=(chr+String.valueOf(count));

        if(result.length() < str.length()) {
            return result;
        }
        return str;
    }

    public static void main(String[] args) {
        String x = compression("aabbcaaAAAAAAA");
        System.out.println(x);
    }
    
}