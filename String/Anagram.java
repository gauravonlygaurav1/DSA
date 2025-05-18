import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";

        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();

        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return;
        }
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);


        // if(Arrays.equals(ch1,ch2)){
        //     System.out.println("It is Anagram");
        // }
        // else{
        //     System.out.println("Not Anagram");
        // }

        // OR
        for(int i=0; i<ch1.length; i++){
            if(ch1[i]!=ch2[i]){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("It is Anagram");
        
    }
}
