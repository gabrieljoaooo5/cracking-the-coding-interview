public class URLify {
    static String urlify(char[] chr, int length) {
        String str = "%20";
        String result = "";
        int numberOfSpaces = (chr.length - length)/2;
        int count = 0;
        for(int i = 0; i < length && count <= numberOfSpaces; i++) {
            if(count == numberOfSpaces) {
                result+=chr.toString().substring(i, 11);
                count+=1;
            }
            else if(chr[i] == ' ') {
                result+=str;
                count+=1;
            }
            else{
                result+=String.valueOf(chr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        char[] y = {'m', 'r', ' ', 'j', 'o', 'h', 'n', ' ', 's', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '};
        String x = urlify(y,13);
        System.out.println(x);
    }
    
}