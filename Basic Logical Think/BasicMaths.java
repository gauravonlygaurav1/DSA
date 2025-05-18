import java.util.*;

public class BasicMaths {
    static void CountDigits(int n){
        //Brute-Force Approach
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println("Brute-Force Approach " +count);
  
        //Optimal Approach
        while(n>0){
            int cnt = (int)(Math.floor(Math.log10(n) + 1));
            System.out.print("Optimal Approach" +cnt);
            //Time complaxity-->O(log10(n))
        }
    }
    static void ReverseNumbers(int n){
        int rev=0;
        while(n>0){
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
        }
        System.out.println(rev);
    }
    static void Palindrome(int n){
        int dup=n;
        int rev=0;
        while(n>0){
            int ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        if(dup==rev) System.out.println("It is Palindrome");
        else System.out.println("It's not Palindrome");
    }
    static void Armstrong(int n){
        int dup=n;
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum=sum+(ld*ld*ld);
            n=n/10;
        }
        if(sum==dup) System.out.println("It's armstrong");
        else System.out.println("It's not armstrong");
    }    
    static void PrintDivisor(int n){
        //Brute Force Approach--> O(n)
        System.out.println("Brute Force Approach: ");
        for(int i=1; i<=n; i++){
            if(n%i==0) System.out.println(i);
        }
        //Optimal Approach--> O(nlogn)
        System.out.println("Optimal Approach: ");
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                System.out.print(" "+i);
                if(n/i != 0){
                    System.out.println(" " +(n/i));
            }
        }
        } 
    }
    static void PrimeNumber(int n){
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2) System.out.print("It's Prime");
        else System.out.print("It's not Prime");
    }
    public static void GCD(int n1, int n2){
        //Brute-Force Approach--> O(min(n1,n2))
        int gcd=1;
        for(int i=1; i<=(Math.min(n1,n2)); i++){
        if(n1%i==0 && n2%i==0){
            gcd=i;
        }
    }
        System.out.println("The Brute Force approach " +gcd);

        //Better Approach--> O(min(n1,n2))
        for(int j=(Math.min(n1,n2)); j>0; j--){
            if(n1%j==0 && n2%j==0){
                System.out.println("The Better Approach of gcd " +j);
                break;
            } 
        }

        //Optimal Approach--> 
        while(n1>0 && n2>0){
            if(n1>n2) n1=n1%n2;
            else n2=n2%n1;
        }
        if(n1==0) System.out.println("The Optimal approach is " +n2);
        else System.out.println("The Optimal approach is " +n1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        GCD(n1,n2);
        // PrimeNumber(n);
    }
}
