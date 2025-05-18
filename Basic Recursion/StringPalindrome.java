
public class StringPalindrome {
    static boolean isPalindrome(String s){
        int left=0, right=s.length()-1;
            while(left<right){
                char l=s.charAt(left), r=s.charAt(right);
                if(!Character.isLetterOrDigit(l)){
                    left++;
                }
                else if(!Character.isLetterOrDigit(r)){
                    right--;
                }
                else if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                    return false;
                }
                else {
                    left++;
                    right--;
                }
            }
            return true;
    }
    static boolean palindrome(int i, String s){
        if(i >=s.length()/2) return true;
        
        if(s.charAt(i) != s.charAt(s.length()-1)) return false;

        return palindrome(i+1,s);
    }
    public static void main(String[] args)
    {
        String str="MADM";
        boolean ans=isPalindrome(str);
        if(ans==true) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

        String s="MADAM";
        System.out.println(palindrome(0,s));
    }
}
