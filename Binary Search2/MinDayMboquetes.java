public class MinDayMboquetes {
    public static boolean possible(int[] arr, int day, int m, int k){
        int n=arr.length;
        int cnt=0;
        int noOfB=0;

        for(int i=0; i<n; i++){
            if(arr[i]<=day){
                cnt++;
            }
            else{
                noOfB += (cnt/k);
                cnt = 0;
            }
        }
        noOfB += (cnt/k);
        return noOfB >= m;
    }
    public static int roseGarden1(int[] arr, int k, int m){
        /* Brute-Force Approach */

        long val=(long)m*k;
        int n = arr.length;//size of the array
        if(val>n) return -1;//Impossible Case

        //Find Maximum and Minimum:
        int mini=Integer.MAX_VALUE, maxi=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            mini=Math.min(mini, arr[i]);
            maxi=Math.max(maxi, arr[i]);
        }

        for(int i=mini; i<=maxi; i++){
            if(possible(arr,i,m,k))
                return i;
        }
        return -1;
    }
    public static int roseGarden2(int arr[], int k, int m){
        /* Optimal Approach */

        long val=(long)m*k;
        int n=arr.length;//size of the array
        if(val>n) return -1;//Impossible Case

        //Find Maximum and Minimum:
        int mini=Integer.MAX_VALUE, maxi=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            mini=Math.min(arr[i], mini);
            maxi=Math.max(arr[i], maxi);
        }
        
        //Apply binary search
        int low=mini, high=maxi;
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,mid,m,k)){
                high=mid-1;
                res=mid;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int ans1=roseGarden1(arr,k,m);
        int ans2=roseGarden2(arr,k,m);
        /*Brute-Force Approach*/
        if(ans1==-1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " +ans1);
        /*Optimal Approach*/
        if(ans2==-1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " +ans2);
    }
}
