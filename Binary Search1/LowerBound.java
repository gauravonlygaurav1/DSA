public class LowerBound {
    public static int lowerbound1(int arr[], int n, int x){
        /* Brute Force Approach */
        for(int i=0; i<n; i++){
            if(arr[i]>=x)
                //Lower bound found:
                return i;
        }
        return n;
    }
    public static int lowerbound2(int arr[], int n, int x){
        /* Optimal Approach */
        int low=0, high=n-1;
        int ans=n;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]>=x){
                ans=mid;
                //Look for smaller index on the left
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    static public void main(String... args){
        int arr[]={3, 5, 8, 15, 19};
        int n=arr.length;
        int x=9;
        // int ind1 = lowerbound1(arr,n,x);     --> Uncomment for Brute Approach
        int ind2 = lowerbound2(arr,n,x);
        System.out.println("The Lower bound is the index: " +ind2);
    }
}
