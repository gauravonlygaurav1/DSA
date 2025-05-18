public class SplitArrayLargestSum {
    public static int countPartitions(int a[], int maxSum){
        int n=a.length;
        int partitions=1;
        long subarraysum = 0;
        for(int i=0; i<n; i++){
            if(subarraysum+a[i] <= maxSum){
                //insert element to current subarray
                subarraysum += a[i];
            }
            else{
                //insert element to next subarray
                partitions++;
                subarraysum = a[i];
            }
        }
        return partitions;
    }

    public static int largestSubarray(int[] a, int k){
        int low=a[0];
        int high=0;

        //find maximum and summation:
        for(int i=0; i<a.length; i++){
            low=Math.max(a[i], low);
            high += a[i];
        }
        for(int maxSum=low; maxSum<=high; maxSum++){
            if(countPartitions(a,maxSum) == k){
                return maxSum;
            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] a={10,20,30,40};
        int k=2;
        int ans=largestSubarray(a,k);
        System.out.println("The answer is:" +ans);
    }
}
