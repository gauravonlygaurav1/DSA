import java.util.*;
public class LeadersArray {
    
    public static ArrayList<Integer> printLeader(int[] arr, int n){
        /* Brute-Force Approach */
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0; i<n; i++){
            boolean leader=true;
            for(int j=i+1; j<n; j++){
                if(arr[j]> arr[i]){
                    leader=false;
                    break;
                }
            }
            if(leader==true) ans.add(arr[i]); 
        }
        return ans;
    }
    public static ArrayList<Integer> printLeaders(int[] arr, int n){
        /* Optimal Approach */
        ArrayList<Integer> ans=new ArrayList<>();

        //Last element of an array is always a leader, push into ans array.
        int max = arr[n-1];
        
        ans.add(arr[n-1]);

        for(int i=n-2; i >= 0; i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        return ans;

    }
    public static void main(String[] args){
        int n=6;
        int arr[]={10, 22, 12, 3, 0, 6};

        ArrayList<Integer> ans = printLeaders(arr, n);

        for(int i=0; i< ans.size(); i++){
            System.out.print(ans.get(i) +" ");
        }
    }
}
