public class KokoEatBanana2 {
    public static int calculateTotalHours(int v[], int hourly){
        int totalH=0;
        int n=v.length;

        for(int i=0; i<n; i++){
            totalH += Math.ceil((double)(v[i])/(double)(hourly));
        }
        return totalH;
    }
    public static int findmax(int v[]){
        int maxi=Integer.MIN_VALUE;
        int n=v.length;

        for(int i=0; i<n; i++){
            maxi = Math.max(v[i], maxi);
        }
        return maxi;
    }
    public static int minimumRateToEatBananas(int[] v, int h){
        int low=1, high=findmax(v);
        int ans=-1;

        while(low<=high){
            int mid=(low+high)/2;
            int reqTime = calculateTotalHours(v,mid);
            if(reqTime <= h){
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
        int[] v={7, 15, 6, 3};
        int h=8;
        int ans=minimumRateToEatBananas(v,h);
        System.out.println("Koko should eat at least " +ans+ " bananas/hr.");
    }
}
