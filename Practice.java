public class Practice{

    public static String remove(String s){
        int cnt=0;
        StringBuilder sb=new StringBuilder();

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i)==')'){
                cnt--;
            }
            if(cnt!=0){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i)=='('){
                cnt++;
            }
        }
        return sb.toString();
    } 
    public static void main(String[] args) {
        String s = " ( ( ( ) ) ), ( ( ) ) ";
        String res = remove(s);
        System.out.println(res);
    }
}