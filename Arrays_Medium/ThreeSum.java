import java.util.*;
public class ThreeSum {
    public static List<List<Integer>> triplet1(int n, int []arr){
        /* Brute Force Approach */
        Set<List<Integer>> st = new HashSet<>();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        //Store the set elements in the answer:
        List<List<Integer>> an = new ArrayList<>(st);
        return an;
    }
    public static List<List<Integer>> triplet2(int n, int []arr){
        /* Better Approach */
        Set<List<Integer>> st = new HashSet<>();

        for(int i=0; i<n; i++){
            Set<Integer> hash = new HashSet<>();
            for(int j=i+1; j<n; j++){ 
            int third = -(arr[i] + arr[j]);

            if (hash.contains(third)){
                List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                temp.sort(null);
                st.add(temp);
            }
            hash.add(arr[j]);
            }
        }
        //store the set elements in the answer:
        List<List<Integer>> an = new ArrayList<>(st);
        return an;
    }
    public static List<List<Integer>> triplet3(int n, int []arr){
        /* Optimal Approach */
        List<List<Integer>> an=new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            //remove duplicates
            if(i != 0 && arr[i] == arr[i-1]) continue;

            //moving 2 pointers:
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> temp= Arrays.asList(arr[i], arr[j], arr[k]);
                    an.add(temp);
                    j++;
                    k--;
                    //skip the duplicates
                    while(j<k && arr[j] == arr[j-1]) j++;
                    while(j<k && arr[k] == arr[k+1]) k--;
                }
            }
        }
        return an;
    }
    public static void main(String[] args){
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans1 = triplet1(n,arr);
        List<List<Integer>> ans2 = triplet2(n,arr);
        List<List<Integer>> ans = triplet3(n,arr);
        for(List<Integer> it: ans){
            System.out.print("[");
            for(Integer i : it){
                System.out.print(i + " ");
            }
            System.out.println("]");
        }
        System.out.println();
    }
}
