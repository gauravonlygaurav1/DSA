public class RomanToInteger {
    public static void main(String[] args) {
        String s="VI";

        int num = 0;
        int i = 0;

        while(i<s.length()){
        
            if(s.charAt(i)=='M'){
                num += 1000;
            }
            else if(s.charAt(i)=='D'){
                num += 500;
            }
            else if(s.charAt(i)=='C' && i+1<s.length() && s.charAt(i+1) == 'M'){
                num -= 100;
            }
            else if(s.charAt(i)=='C' && i+1<s.length() && s.charAt(i+1) == 'D'){
                num -= 100;
            }
            else if(s.charAt(i)=='C'){
                num += 100;
            }
            else if(s.charAt(i)=='L'){
                num += 50;
            }
            else if(s.charAt(i)=='X' && i+1<s.length() && s.charAt(i+1) == 'C'){
                num -= 10;
            }
            else if(s.charAt(i)=='X' && i+1<s.length() && s.charAt(i+1) == 'L'){
                num -= 10;
            }
            else if(s.charAt(i)=='X'){
                num += 10;
            }
            else if(s.charAt(i)=='V'){
                num += 5;
            }
            else if(s.charAt(i)=='I' && i+1<s.length() && s.charAt(i+1) == 'V'){
                num -= 1;
            }
            else if(s.charAt(i)=='I' && i+1<s.length() && s.charAt(i+1) == 'X'){
                num -= 1;
            }
            else if(s.charAt(i)=='I'){
                num += 1;
            }
            i++;
        }

        System.out.println(num);
    }
}
