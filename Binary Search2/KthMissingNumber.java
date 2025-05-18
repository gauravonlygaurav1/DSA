public class KthMissingNumber {
    public static int missingK1(int vec[], int n, int k){
        /* Brute Force Approach */
        for(int i=0; i<n; i++){
            if(vec[i]<=k) k++;
            else break;
        }
        return k;
    }

    public static int missingK2(int vec[], int n, int k){
        /* Optimal Approach */
        int low=0, high=n-1;

        while(low<=high){
            int mid=(low+high)/2;
            int missing = vec[mid] - (mid+1);
            if(missing<k){
                low=mid+1;
            }            
            else{
                high=mid-1;
            }
        }
        return k+high+1;
    }

    public static void main(String[] args){
        int[] vec= {4,7,9,10};
        int n=vec.length, k=4;
        int ans1=missingK1(vec, n, k);
        int ans2=missingK2(vec, n, k);
        System.out.println("The missing number is: " +ans1);
        System.out.println("The missing number is: " +ans2);
    }
}
