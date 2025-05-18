import java.util.Arrays;

public class AggresiveCows {
    public static boolean canWePlace(int[] stalls, int dist, int cows){
        int n=stalls.length;
        int cntCows=1;//no. of cows placed
        int last=stalls[0];

        for(int i=1; i<n; i++){
        
            if(stalls[i]-last >= dist){
                cntCows++;
                last = stalls[i];//update the last location
            }
            if(cntCows >= cows) return true;
        }
        return false;
    }
    public static int aggresiveCows1(int[] stalls, int cows){
        /* Brute Force Approach */
        int n=stalls.length;

        Arrays.sort(stalls);

        int limit = stalls[n-1] - stalls[0];

        for(int i=1; i<=limit; i++){
            if(canWePlace(stalls, i, cows) == false){
                return (i-1);
            }
        }
        return limit;
    }
    
    public static int aggresiveCows2(int[] stalls, int cows){
        int n=stalls.length;
        Arrays.sort(stalls);

        int low=1, high=stalls[n-1]-stalls[0];
        int ans=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(canWePlace(stalls, mid, cows)==true){
                ans=mid;
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] stalls={0, 3, 4, 7, 10, 9};
        int cows = 4;
        int ans1 = aggresiveCows1(stalls, cows);
        int ans2 = aggresiveCows2(stalls, cows);
        System.out.println("The Maximum possible minimum distance is: " +ans1);
        System.out.println("The Maximum possible minimum distance is: " +ans2);
    }
}
