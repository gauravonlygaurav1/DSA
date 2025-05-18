import java.util.Map;
import java.util.HashMap;

public class LongSubarrK {
    public static int getLongestSubarray1(int arr[], int sum){
        int n=arr.length;

        int len=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                long s=0;
                for(int k=i; k<=j; k++){
                    s += arr[k];
                }
                if(sum==s){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    public static int getLongestSubarray2(int arr[], int sum){
        int n=arr.length;
        int len=0;
        for(int i=0; i<n; i++){
            long s=0;
            for(int j=i; j<n; j++){
                s += arr[j];

                if(s==sum) {
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    public static int getLongestSubarray3(int arr[], int sum){
        int n=arr.length;

        Map<Long, Integer> preSumMap= new HashMap<>();
        long s =0;
        int maxLen=0;

        for(int i=0; i<n; i++){
            
            s += arr[i];
        
            if(sum==s){
                maxLen = Math.max(maxLen,i+1);
            }

            long rem= s-sum;
            
            if(preSumMap.containsKey(rem)) {

                int len = i - preSumMap.get(rem);
                maxLen=Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if(!preSumMap.containsKey(s)){
                
                preSumMap.put(s,i);
            }
        }

    return maxLen;
    }
    public static int getLongestSubarray4(int arr[], int sum){
        int n=arr.length;

        int left=0, right=0;
        long s= arr[0];
        int maxLen=0;
        while(right<n){
            
            while(left<=right && s>sum){
                s -= arr[left];
                left++;
            }

            if(s==sum){
                maxLen=Math.max(maxLen, right -left + 1);
            }

            right++;
            if(right<n) s += arr[right];
        }
        return maxLen;
    }
    public static void main(String[] args){
        int[] arr={1, 2, 3, 3,2, 1, 9};
        int sum=10;
        int len1=getLongestSubarray1(arr,sum);
        int len2=getLongestSubarray2(arr,sum);
        int len3=getLongestSubarray3(arr,sum);
        int len4=getLongestSubarray4(arr,sum);
        System.out.println("The Longest Subarray " +len1);
    }
}
