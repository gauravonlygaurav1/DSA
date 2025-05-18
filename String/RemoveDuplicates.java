import java.util.LinkedHashSet;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s="Gaurav";

        StringBuilder sb=new StringBuilder();
    
        HashSet<Character> set=new LinkedHashSet<>();

        for(char ch:s.toCharArray()){
            if(set.add(ch)){
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}
