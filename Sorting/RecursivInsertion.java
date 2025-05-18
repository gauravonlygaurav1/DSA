import java.util.Scanner;
public class RecursivInsertion {
    static void Rinsertion(int[] arr, int i, int n){
        if(i==n) return;
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
        }
        Rinsertion(arr, i+1, n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        for(int i=0; i<n; i++) System.out.print(arr[i] +" ");
        Rinsertion(arr, 0 ,n);
        System.out.println();
        for(int i=0; i<n; i++) System.out.print(arr[i] +" ");
    }
}
