import java.util.Scanner;
import java.util.ArrayList;
class Solution{
    public static void merge(int arr[], int low, int mid, int high){
        ArrayList<Integer> temp=new ArrayList<>(); //temporary array
        int left=low; //starting index of left half of array
        int right=mid+1; //starting index of right half of array 

        // Storing elements  in the temporary array in a sorted manner//

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half array still left 

        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        // if elements on the right half array still left

        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        // transfering all elements from temporary to array
        for(int i=low; i<=high; i++){
            arr[i]=temp.get(i-low);

        }

    }
    public static void mergeSort(int arr[], int low, int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergeSort(arr, low, mid); // left array
        mergeSort(arr, mid+1, high); // right array
        merge(arr, low, mid, high); // merging sorted halves

    }
} 
public class Merge{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        System.out.println("Array before the sort: ");
        for(int i=0; i<n; i++) System.out.print(arr[i] +" ");
        Solution.mergeSort(arr,0,n-1);  
        System.out.println();      
        System.out.println("Array after the sort: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
