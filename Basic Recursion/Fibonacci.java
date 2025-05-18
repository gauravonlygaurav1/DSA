import java.util.Scanner;
public class Fibonacci {
    static int isFibonacci(int n){
    
        if(n<=1){
            return n;
        }
        int last=isFibonacci(n-1);
        int slast=isFibonacci(n-2);

        return last+slast;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isFibonacci(n));
    }
}
