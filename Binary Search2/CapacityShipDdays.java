public class CapacityShipDdays {
    public static int findDays(int[] weights, int cap){
        int days=1; //First Day
        int load=0;

        int n=weights.length; //size of array
        for(int i=0; i<n; i++){
            if(load+weights[i] > cap){
                days = days + 1; //move to the next day
                load = weights[i]; //Load the weight
            }
            else{
                load = load + weights[i];// OR load += weights[i];
            }
        }
        return days;
    }
    public static int leastWeightCapacity1(int[] weights, int d){
        /* Brute Force Approach */

        //Find the maximum and the summation
        int maxi=Integer.MIN_VALUE, sum=0;
        for(int i=0; i<weights.length; i++){
            sum += weights[i];
            maxi = Math.max(maxi, weights[i]);
        }

        for(int i=maxi; i<=sum; i++){
            if(findDays(weights, i) <= d){
                return i;
            }
        }
        //dummy return statement:
        return -1;
    }
    
    public static int leastWeightCapacity2(int[] weights, int d){

        int low=Integer.MIN_VALUE, high=0;
        int ans=-1;
        for(int i=0; i<weights.length; i++){
            high += weights[i];
            low = Math.max(low, weights[i]);
        }

        while(low<=high){
            int mid=(low+high)/2;
            int numberOfDays = findDays(weights, mid);
            if(numberOfDays <= d){
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
        int[] weights= {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5; 
        int ans1 = leastWeightCapacity1(weights, d);
        int ans2 = leastWeightCapacity2(weights, d);
        System.out.println("The Minimum Capacity Should be: " +ans1);
        System.out.println("The Minimum Capacity Should be: " +ans2);
    }
}
