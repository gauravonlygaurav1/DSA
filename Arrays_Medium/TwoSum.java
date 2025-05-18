import java.util.*;
public class TwoSum{
    public static String twoSum1(int n, int []arr, int target){
        /* Brute-Force Approach */
        for( int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target) return "YES";
            }
    }
    return "NO";
}
    public static String twoSum2(int n, int []arr, int target){
        /* Better Approach */
        HashMap<Integer, Integer> mpp= new HashMap<>();
        for(int i=0; i<n; i++){
            int num=arr[i];
            int moreNeeded= target - num;
            if (mpp.containsKey(moreNeeded)){
                return "YES";
            }

            mpp.put(arr[i],i);
        }
        return "NO";
    }
    public static String twoSum3(int n, int []arr, int target){
        Arrays.sort(arr);
        int left=0, right=n-1;
        while(left<right) {
            int sum=arr[left]+arr[right];
            if(sum==target){
                return "YES";
            }
            else if(sum < target) left++;
            else right--;
        }
        return "NO";
    }
    public static void main(String[] args){
        int n=5;
        int[] arr={2,6,5,8,11};
        int target= 13;
        String ans= twoSum3(n,arr,target);
        System.out.println("The Sum Value of target 13 is " +ans);
    }
}