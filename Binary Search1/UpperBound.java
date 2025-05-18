public class UpperBound {
    public static int upperbound(int arr[], int n, int x){
        int low = 0, high=n-1;
        int ans = n;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid] > x){
                //maybe the answer
                ans=mid;
                //Look for smaller index on the left
                high = mid-1;
            }
            else{
                //Look on the right
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={3, 5, 8, 9, 15, 19};
        int n = arr.length, x = 9;
        int ind = upperbound(arr,n,x);
        System.out.println("The upper bound index is: "+ind);
    }
}
