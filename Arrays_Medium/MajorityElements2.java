import java.util.*;
public class MajorityElements2 {
    public static int majorityElement_1(int[] arr){
        System.out.println("Brute-Force Approach ");
        /* Brute Force Approach */
        int n=arr.length;
        for(int i=0; i<n; i++){
            int cnt=0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]) cnt++;
            }
            if(cnt>(n/2)) return arr[i];
        }
        return -1;
    }
    public static int majorityElement_2(int[] v){
        /* Better Approach */
        System.out.println("Better Approach ");
        int n=v.length;

        HashMap<Integer,Integer> mpp=new HashMap<>();

        for(int i=0; i<n; i++){
            int value = mpp.getOrDefault(v[i],0);
            mpp.put(v[i],value+1);
        }

        for(Map.Entry<Integer,Integer> it: mpp.entrySet()){
            if(it.getValue()>(n/2)){
                return it.getKey();
            }
        }
        return -1;
    }
    public static int majorityElement_3(int[] v){
        /* Optimal Approach */
        System.out.println("Optimal Approach");

        int n=v.length;
        int cnt=0;
        int el=0;

        /* This loop is Boyer-Moore Voting Algorithm */
        for(int i=0; i<n; i++){
            if(cnt==0){
                cnt=1;
                el=v[i];
            }
            else if(el==v[i]) cnt++;
            else cnt--;
        }

        int cnt1=0;
        for(int i=0; i<n; i++){
            if(v[i]==el) cnt1++;
        }

        if(cnt1>(n/2)) return el;

        return -1;
    }
    public static void main(String[] args){
        int[] arr= {2, 2, 1, 1, 1, 2, 2};
        int ans=majorityElement_3(arr);
        System.out.println("The majority element is " +ans);
    }
}
