import java.util.*;
import java.util.Scanner;

public class ReverseArray{

    static void printArray(int arr[], int n){
        for(int i=0; i<=n; i++){
            System.out.print(arr[i] +" ");
        }
    }
    // Reverse Array By use of one more array :-
    static void reverseArray(int arr[], int n){
        int[] ans=new int[n];
        for(int i=n-1; i >= 0; i--){
            ans[n-i-1] = arr[i];
        }
        printArray(ans, n);
    }
    // Reverse array by recursive method :-
    static void reverse(int arr[], int start, int end){
        if(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            reverse(arr, start+1, end-1);
        }
    }
    
    static void reverseCollection(int arr[]){
        Collections.reverse(Arrays.asList(arr));
    }
    
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        for(int i=0; i<n; i++) System.out.print(arr[i] +" ");
        System.out.println();
        
        // Recursive Array-->
        reverse(arr, 0, n-1);
        printArray(arr, n);
        
        
        // reverseCollection(arr);
        // printArray(arr,n);
    }
}