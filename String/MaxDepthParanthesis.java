public class MaxDepthParanthesis {
    public static void main(String[] args) {
        int max=0, curr=0;

        String s = "(1)+((2))+(((3)))";

        for(char ch:s.toCharArray()){
            
            if(ch=='('){
                curr++;
                if(max<curr)
                    max=curr;
            }
            else if(ch==')'){
                curr--;
            }
        }
        System.out.println(max);
    }
}
