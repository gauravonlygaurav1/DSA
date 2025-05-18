import java.util.Scanner;

public class Recursion {
    static void name(int i, int n){
        if(i>n) return;
        System.out.println("Gaurav");
        name(i+1, n);
    }
    static void OnetoN(int i, int n){
        if(i>n) return;
        System.out.print(i +" ");
        OnetoN(i+1,n);
    }
    static void NtoOne(int i, int n){
        //Using Backtracking
        if(i>n) return;
        NtoOne(i+1,n);
        System.out.print(i +" ");
    }
    static void SumN(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.print("By using for loop: " +sum);

        System.out.println();
        sum=n*(n+1)/2;
        System.out.print("By Formula of: " +sum);
    }
    
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        SumN(n);
    }
}
