public class ReverseWordsInString {

    public static String reverse(String s){
    
        String[] words = s.trim().split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i=words.length-1; i >= 0; i--){
            if(words[i].length() > 0){
                sb.append(words[i]);
                sb.append(' ');
            }
        }

        return sb.substring(0,sb.length()-1).toString();    
    }
    public static void main(String[] args) {        
        String s = "  the   sky is blue  ";
        String result = reverse(s);
        System.out.println(result);
    }
}
