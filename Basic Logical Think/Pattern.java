import java.util.Scanner;

public class Pattern {
    public static void Pattern_1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void Pattern_2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void Pattern_3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j +"  ");
            }
            System.out.println(" ");
        }
    }
    public static void Pattern_4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i +"  ");
            }
            System.out.println(" ");
        }
    }
    public static void Pattern_5(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println(" " );
        }
    }
    public static void Pattern_6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j +"  ");
            }
            System.out.println(" ");
        }
    }
    public static void Pattern_7(int n){
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            //star
            for(int j=0; j<2*i+1; j++){
                System.out.print("* ");
            }
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            System.out.println("  ");
        }
    }
    public static void Pattern_8(int n){
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            //star
            for(int j=0; j<2*n-(2*i+1); j++){
                System.out.print("* ");
            }
            //space
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            System.out.println("  ");
        }
    }
    public static void Pattern_9(int n){
        //Combine the Pattern 7 & Pattern 8
        Pattern_7(n);
        Pattern_8(n);
    }
    public static void Pattern_10(int n){
        for(int i=1; i<=2*n-1; i++){
            int stars = i;
            if(i>n) stars = 2*n-i; 
            for(int j=1; j<=stars; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }  
    public static void Pattern_11(int n){
        int start;
        for(int i=0; i<n; i++){
            if(i%2==0) start=1;
            else start =0;
            for(int j=0; j<=i; j++){
                System.out.print(start +" ");
                start=1-start;
            }
            System.out.println(" ");
        }
    }
    public static void Pattern_12(int n){
        int space=2*(n-1);
        for(int i=1; i<=n; i++){
            //numbers
            for(int j=1; j<=i; j++)
            {
                System.out.print(j +" ");
            }
            //spaces
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            //numbers
            for(int j=i; j>=1; j--){
                System.out.print(j +" ");
            }
            System.out.println(" ");
            space =space-2;
        }
    }
    public static void Pattern_13(int n){
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num +" ");
                num=num+1;
            }
            System.out.println();
        }
    }
    public static void Pattern_14(int n){
        for(int i=0; i<n; i++){
            for(char ch='A'; ch<='A' + i; ch++){
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }
    public static void Pattern_15(int n){
        for(int i=0; i<n; i++){
            for(char ch='A'; ch<='A'+(n-i-1); ch++){
                System.out.print(ch +" ");
            } 
            System.out.println();
        }
    }
    public static void Pattern_16(int n){
        for(int i=0; i<n; i++){
            char ch = (char)('A' + i);
            for(int j=0; j<=i; j++){
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }
    public static void Pattern_17(int n){
        for(int i=0; i<n; i++){
            //spaces
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            //characters
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1; j<=2*i+1; j++){
                System.out.print(ch +" ");
                if(j<=breakpoint) ch++;
                else ch--;
            }
            //spaces
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void Pattern_18(int n){
        for(int i=0; i<n; i++){
            for(char ch=(char)('E'-i); ch<='E'; ch++)
            {
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }
    public static void Pattern_19(int n){
        int iniS=0;
        for(int i=0; i<n; i++){
            //stars
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            } 
            //spaces
            for(int j=0; j<iniS; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            iniS+=2;
            System.out.println();
        }
        iniS=2*n-2;
        for(int i=1; i<=n; i++){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            } 
            //spaces
            for(int j=0; j<iniS; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            iniS -= 2;
            System.out.println();
        }
    }
    public static void Pattern_20(int n){
        int spaces=(2*n)-2;
        for(int i=1; i<=2*n-1; i++){
            int stars=i;
            if(i>n) stars=2*n-i;
            //stars
            for(int j=1; j<=stars; j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1; j<=stars; j++){
                System.out.print(" *");
            }
            System.out.println();
            if(i<n) spaces -=2;
            else spaces +=2;
        }

    }
    public static void Pattern_21(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == 0 || j==0 || i == n-1 || j==n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Pattern_22(int n){
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int bottom=(2*n-2)-i;
                //System.out.print(n- min(min(top,bottom), min(left,right)));
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Pattern_8(n);
}
}
