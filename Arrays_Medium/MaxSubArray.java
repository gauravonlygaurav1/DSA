public class MaxSubArray {
    public static int maxSubarraySum_1(int arr[], int n){
        /* Brute-Force Approach */
        System.out.println("Brute Force Approach");

        int maxi=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum=0;

                for(int k=i; k<j; k++){
                    sum += arr[k];
                }
                maxi=Math.max(maxi,sum);
            }
        }
        return maxi;
    }
    public static int maxSubarraySum_2(int arr[], int n){
        /* Better Approach */
        System.out.println("Better Approach");

        int maxi=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int sum=0; 
            for(int j=i; j<n; j++){
                sum += arr[j];
                maxi=Math.max(maxi,sum);
            }
        }
        return maxi;
    }
    public static long maxSubarraySum_3(int arr[], int n){
        /* Optimal Approach */
        System.out.println("Optimal Approach");

            long maxi=Long.MIN_VALUE; 
            long sum=0; 

            for(int i=0; i<n; i++){
                
                sum += arr[i];
                
                if(sum > maxi){
                    maxi=sum;
                }
                if(sum < 0){
                    // If sum < 0: discard the sum calculated
                    sum=0; 
                }
            }
            // To consider the sum of the empty subarray
            // uncomment the following check:

            //if (maxi < 0) maxi = 0;
        
        return maxi;
    }
    public static long maxSubarraySum_4(int arr[], int n){
        /* Print Subarray of maximum sum */
        System.out.println("Print Subarray of maximum sum");

        long maxi=Long.MIN_VALUE;
        long sum=0; 
        
        int start=0;
        int ansStart=-1, ansEnd=-1;
        for(int i=0; i<n; i++){

            if(sum==0) start=i;

            sum += arr[i]; 

            if(sum > maxi){
                maxi = sum;

                ansStart = start;
                ansEnd = i;
            }

            // If sum < 0: discard the sum calculated
            if(sum < 0){
                sum = 0;
            }
        }

        //printing the subarray:
        System.out.print("The Subarray is: [");
        for(int i = ansStart; i <= ansEnd; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println("]n");

        return maxi;
    }
    public static void main(String[] args){
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n=arr.length;
        long maxSum=maxSubarraySum_4(arr,n);
        System.out.println("The maximum subarray is : " +maxSum);
    }
}
