import java.util.Scanner;

public class CharCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        //pre-compute
        int[] hash=new int[26]; //For both lower & Upper Letters use-> 256.
        for(int i=0; i<s.length(); i++){
            hash[s.charAt(i)-'a']++;
        }

        int q;
        q=sc.nextInt();
        
        while(q-- > 0){
            Character ch;
            ch=sc.next().charAt(0);
            //Fetch
            System.out.println(hash[ch-'a']);
        }
    }
}
