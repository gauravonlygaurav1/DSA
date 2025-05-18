import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class MajorityElements3 {
    public static List<Integer> MajorityElements1(int []v){
        /* Brute Force Approach */

        int n = v.length;
        List<Integer> ls = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(ls.size()==0 || ls.get(0) != v[i]){
                int cnt = 0;
                for(int j=0; j<n; j++){
                    if(v[j] == v[i]){
                        cnt++;
                    }
            }
            if(cnt>(n/3)){
                ls.add(v[i]);
            }
        }
        if(ls.size() == 2) break;
    }
    return ls;
}
    public static List<Integer> MajorityElements2(int arr[]){
        /* Better Approach */
        int n = arr.length;
        List<Integer> ls = new ArrayList<>();

        HashMap<Integer,Integer> mpp=new HashMap<>();

        int mini = (int)(n/3) + 1;

        for(int i = 0; i < n; i++){
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);

            if(mpp.get(arr[i]) == mini){
                ls.add(arr[i]);
            }

            if(ls.size() == 2) break;
        }
        return ls;
    }
    public static List<Integer> MajorityElements3(int []v){
        int n = v.length;

        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            if(cnt1==0 && el2 != v[i]){
                cnt1 = 1;
                el1 = v[i];
            }
            else if(cnt2 == 0 && el1 != v[i]){
                cnt2 = 1;
                el2 = v[i];
            }
            else if (v[i] == el1) cnt1++;
            else if (v[i] == el2) cnt2++;
            else{
                cnt1--; cnt2--;
            }
        }
        List<Integer> ls = new ArrayList<>();

        cnt1=0; cnt2=0;
        for(int i=0; i<n; i++){
            if(v[i] == el1) cnt1++;
            if(v[i] == el2) cnt2++;

        }

        int mini = (int)(n/3) + 1;
        
        if(cnt1 >= mini) ls.add(el1);
        if(cnt2 >= mini) ls.add(el2);

        return ls;
    }
    public static void main(String[] args){
        int arr[] = {11, 33, 11, 33, 11};
        List<Integer> ans1= MajorityElements1(arr);
        List<Integer> ans2= MajorityElements2(arr);
        List<Integer> ans= MajorityElements2(arr);
        System.out.print("The Majority Elements are: ");
        for(int i =0; i< ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
