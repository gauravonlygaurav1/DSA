import java.util.Arrays;
public class LargeComonPrefix1 {

    public static String largestCommonPrefix(String[] str){
        
        StringBuilder res = new StringBuilder();

        //sort the array
        Arrays.sort(str);

        //Get the fast and last strings
        char[] first = str[0].toCharArray();
        char[] last = str[str.length-1].toCharArray();

        //start comparing
        for(int i=0; i<first.length; i++){
            if(first[i] != last[i])
                break;
            
        res.append(first[i]);
        }
        
        return res.toString();
    }
    public static void main(String[] args) {
        String[] str={"club", "clap", "clove"};
        String result = largestCommonPrefix(str);
        System.out.println(result);
    }
}
