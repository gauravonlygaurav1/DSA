import java.util.Scanner;
public class Sort_1{
    public static void Selection_Sort(int arr[], int n){
        for(int i=0; i<=n-2; i++){
            int min=i;
            for(int j=i; j<=n-1; j++){
                if(arr[j]<arr[min]) min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void Bubble_Sort(int arr[], int n){
        for(int i=n-1; i>=1; i--){
            int didSwap=0;
            for(int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp; 
                    didSwap=1;
                }
            }
            if(didSwap==0) {
                break;
            }
            System.out.println("runs");
        }
    }
    public static void Insertion_Sort(int arr[], int n){
        for(int i=0; i<=n-1; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
                System.out.println("RUNS");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        Insertion_Sort(arr,n);
        for(int i=0; i<n; i++) System.out.print(arr[i] + " ");
        
    }
}
