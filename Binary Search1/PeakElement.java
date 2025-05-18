import java.util.*;
public class PeakElement {
    public static int findPeakElement1(ArrayList<Integer> arr){
        /* Brute Force Approach */
        int n=arr.size();

        for(int i=0; i<n; i++){
            if((i==0 || arr.get(i)>arr.get(i-1)) && (i==n-1 || arr.get(i)>arr.get(i+1)))
                return i;
        }
        return -1;
    }
    public static int findPeakElement2(ArrayList<Integer> arr){
        int n=arr.size();

        //Edge Cases:
        if(n==1) return 0;
        if(arr.get(0) > arr.get(1)) return 0;
        if(arr.get(n-1) > arr.get(n-2)) return n-1;

        int low=1, high=n-2;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr.get(mid-1) < arr.get(mid) && arr.get(mid) > arr.get(mid+1))
                return mid;
            
            else if(arr.get(mid) > arr.get(mid-1))
                low=mid+1;
            
            else if(arr.get(mid) > arr.get(mid+1))
                high=mid-1;
            
            //For arr[mid] is a common point:
            else high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,5,1));
        int ans1=findPeakElement1(arr);
        int ans2=findPeakElement2(arr);
        System.out.println("The Peak Element is at index: " +ans2);
    }
}
