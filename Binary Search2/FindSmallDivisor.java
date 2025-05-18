public class FindSmallDivisor {
    public static int smallestdivisor1(int arr[], int limit){
        /* Brute Force Approach */
        int n=arr.length;

        //Find the maximum element:
        int maxi=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            maxi=Math.max(arr[i], maxi);
        }

        //Find the smallest divisor:
        for(int d=1; d<=maxi; d++){
            int sum=0;
            for(int i=0; i<n; i++){
                sum += Math.ceil((double)(arr[i])/(double)(d));
            }
            if(sum<=limit)
                return d;
        }
        return -1;
    }

    /* Optimal Approach */
    public static int sumByD(int arr[], int div){
        int n=arr.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum += Math.ceil((double)(arr[i])/(double)(div));
        }
        return sum;
    }
    public static int smallestdivisor2(int arr[], int limit){
        int n=arr.length;
        if(n>limit) return -1;

        int maxi=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            maxi=Math.max(maxi, arr[i]);
        }

        //Apply Binary Search
        int low=1, high=maxi;

        while(low<=high){
        
            int mid=(low+high)/2;
            if(sumByD(arr, mid)<=limit) {
                
                high = mid-1;    
            }
            else{
                low = mid+1;
            }

        }
        return low;
    }
    public static void main(String[] args){
        int arr[]={1, 2, 3, 4, 5};
        int limit=8;
        int ans1=smallestdivisor1(arr, limit);
        int ans2=smallestdivisor2(arr, limit);
        System.out.println("The Minimum divisor is: " +ans1);
        System.out.println("The Minimum divisor is: " +ans2);
    }
}
