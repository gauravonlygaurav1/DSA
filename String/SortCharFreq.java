import java.util.*;
public class SortCharFreq{

    public static String frequency(String s){
        StringBuilder answer=new StringBuilder();

        Map<Character, Integer> hm=new HashMap<>();

        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch, 0)+1);
        }

        List<Character> list=new ArrayList<>(hm.keySet());

        Collections.sort(list,(ob1,ob2)->hm.get(ob2)-hm.get(ob1));

        for(char ch:list){
            for(int i=0; i<hm.get(ch); i++){
                answer.append(ch);
            }
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        String s="tree";
        System.out.println(frequency(s));
    }
}