public class StockBuy {
    public static void main(String[] args){
        int arr[]={7,1,5,3,6,4};
        int maxPro = maxProfit1(arr);
        System.out.println("Max Profit is: " +maxPro);
        
    }
    /* Brute_Force Approach */
    static int maxProfit(int[] arr){
        int maxPro = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    maxPro = Math.max(arr[j]-arr[i], maxPro);
                }
            }
    }
    return maxPro;
}
    
    /* Optimal Approach */
    static int maxProfit1(int[] arr){
        int maxPro=0; 
        int minPrice=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minPrice);
        }
        return maxPro;
    }
}