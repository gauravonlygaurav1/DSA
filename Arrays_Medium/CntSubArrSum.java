import java.util.*;

public class CntSubArrSum {
    /* Brute-Force Approach */
    public static int findSubArrayGivenSum1(int arr[], int K){
        int n = arr.length;
        int cnt = 0;

        for(int i=0; i<n; i++){ //Starting index
            for(int j=i; j<n; j++){ //Ending index

                int sum = 0; 
                for(int k=i; k<=j; k++){
                    sum = sum + arr[k];

                }
                    if(sum == K)
                        cnt++;
            }
        }
        return cnt;
    }

    /* Better Approach */
    public static int findSubArrayGivenSum2(int arr[], int K){
    
        int n =arr.length;
        int cnt=0;

        for(int i=0; i<n; i++){ //starting index
            int sum = 0;

            for(int j=i; j<n; j++){ //ending index
                
                sum += arr[j];

                if(sum==K)
                    cnt++;
            }
        }
        return cnt;
    }

    /* Optimal Approach */
    public static int findSubArrayGivenSum3(int arr[], int K){
        int n=arr.length;
        
        Map<Integer, Integer> mpp = new HashMap<>();

        int preSum = 0, cnt = 0;

        mpp.put(0,1); // Setting 0 in the map
        for(int i=0; i<n; i++){
            // add current element to prefix sum:
            preSum += arr[i];

            // calculate x-k:
            int remove = preSum - K;

            // Add the number of subarrays to be removed:
            cnt += mpp.getOrDefault(remove, 0);

            // Update the count of prefix sum in the map:
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) +1);
        }
        return cnt;
    }
    public static void main(String[] args){
        int[] arr={3,1,2,4};
        int K = 6;
        int cnt1 = findSubArrayGivenSum1(arr, K);
        int cnt2 = findSubArrayGivenSum2(arr, K);
        int cnt3 = findSubArrayGivenSum3(arr, K);
        System.out.println("The Number of subarray of Brute Force is: " +cnt1);
        System.out.println("The Number of subarray of Brute Force is: " +cnt2);
        System.out.println("The Number of subarray of Brute Force is: " +cnt3);
    }
}
