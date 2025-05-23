public class SearchPosition {
    public static int searchInsert(int[] arr, int x, int n){
        int low=0, high=n-1;
        int ans=n;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 7};
        int n=arr.length;
        int x =6;
        int ind=searchInsert(arr,x,n);
        System.out.println("The index position of target 6 is: " +ind);
    }
}
