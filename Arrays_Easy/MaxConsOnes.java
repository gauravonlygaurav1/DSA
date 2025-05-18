public class MaxConsOnes {
    public static int findMaxConsecutive(int arr[]){
        int cnt=0; 
        int maxi=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                cnt++;
            }
            else{
                cnt=0;
            }
            maxi=Math.max(cnt,maxi);
        }
        return maxi;
    }
    public static void main(String[] args){
        int arr[] = { 1, 1, 0, 1,1 ,1 ,0 ,1 ,1 ,1 , 1, 1 };
        int ans= findMaxConsecutive(arr);
        System.out.println(ans);
    }
}
