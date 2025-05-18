import java.util.Scanner;

public class Recursion1 {
    static int func(int n){
        if(n==0){
            return 0;
        }
        return n + func(n-1);
    }
    static void fun(int i, int sum){
        if(i<0){
            System.out.println("The Sum of natural no. is Parameterized Way: " +sum);
            return;
        }
        fun(i-1, sum+i);
    }
    static int fact(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    static int factR(int n){
        if(n==0){
            return 1;
        }
        return n*factR(n-1);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The Sum Of Natural No. in Functional way: " +func(n));
        fun(n,0);

        int res=fact(n);
        System.out.println("The factorial in iterative: " +res);

        System.out.println("The factorial in recursive way: " +factR(n));
    }
}
