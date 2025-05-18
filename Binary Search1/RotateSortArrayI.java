import java.util.ArrayList;
import java.util.Arrays;
/* This is optimal Approach */
/* Search in Rotated Sorted Array I For Unique Elements */
public class RotateSortArrayI {

    public static int search(ArrayList<Integer> arr, int n, int k){
        int low=0, high=n-1;
        while(low<=high){
            
            int mid=(low+high)/2;

            if(arr.get(mid)==k)
                return mid;

            // if left part is sorted
            if(arr.get(low)<=arr.get(mid)){
                if(arr.get(low)<=k && k<=arr.get(mid))
                //element exists
                    high=mid-1;
                else
                //element doesn't exists
                    low=mid+1;
            }
            // if right part is sorted
            else{
                if(arr.get(mid)<=k && k<=arr.get(high))
                //element exists
                    low=mid+1;
                else
                //element doesn't exists
                    high=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
        int n=arr.size();
        int k=1;
        int ans = search(arr,n,k);
        if(ans==-1){
            System.out.println("The Anser is not present");
        }
        else{
            System.out.println("The Index is: " +ans);
        }
    }
}
