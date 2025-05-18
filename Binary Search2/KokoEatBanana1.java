/* Return the minimum integer K
 * K -> bananas/hr
 */
/* Brute Force Approach */

public class KokoEatBanana1 {
    public static int findMax(int v[]){
        int maxi=Integer.MIN_VALUE;
        int n=v.length;

        //find the maximum
        for(int i=0; i<n;i++){
            maxi=Math.max(maxi,v[i]);
        }
        return maxi;
    }
    public static int calculateTotalHours(int v[], int hourly){
        int totalH=0;
        int n=v.length;
        //find total hours
        for(int i=0; i<n; i++){
            totalH += Math.ceil((double)(v[i])/(double)(hourly));
        }
        return totalH;
    }
    public static int minimumRateToEatBananas(int[] v, int h){
        //Find the maximum number:
        int maxi = findMax(v);

        for(int i=1; i<=maxi; i++){
            int reqTime=calculateTotalHours(v,i);
            if(reqTime <= h){
                return i;
            }
        }
        return maxi;
    }
    public static void main(String[] args){
        int[] v = {7, 15, 6, 3};
        int h=8;
        int ans=minimumRateToEatBananas(v,h);
        System.out.println("Koko should eat at least " +ans+ " bananas/hr.");
    }
}
