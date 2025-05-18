public class FloorAndCeil {
    static int findfloor(int arr[], int n, int x){
        int low = 0, high=n-1;
        int ans = -1;
        while(low<=high){
            int mid=(low+high)/2;
            
            if(arr[mid]<=x){
                ans=arr[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    static int findceil(int arr[], int n, int x){
        int low =0, high = n-1;
        int ans = -1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]>=x){
                ans=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int[] getFloorAndCeil(int arr[], int n, int x){
        int f=findfloor(arr,n,x);
        int c=findceil(arr,n,x);
        return new int[] {f,c};
    }
    public static void main(String[] args){
        int arr[] ={3, 4, 4, 7, 8, 10};
        int n=arr.length;
        int x=5;
        int[] ans=getFloorAndCeil(arr,n,x);
        System.out.println("The Floor and Ceil are: " +ans[0] +" " +ans[1]);

    }
}
