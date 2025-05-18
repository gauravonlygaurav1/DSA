public class ImplementAtoi {
    public static void main(String[] args) {
        String s="1234";

        s=s.trim();

        if(s.length()==0){
            return;
        }
        boolean neg=false;
        long ans=0;

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(i==0){
                if(ch=='-'){
                    neg=true;
                    continue;
                }
                else if(ch=='+'){
                    neg=false;
                    continue;
                }
            }

            if(ch>='0' && ch<='9'){
                int dig = ch-'0';
                ans=ans*10+dig;
            }
            else{
                break;
            }
        }
    if(neg){
        ans=-ans;
    }
    System.out.println((int)ans);
    }
}
