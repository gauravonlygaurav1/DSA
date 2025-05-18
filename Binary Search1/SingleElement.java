import java.util.*;

public class SingleElement {
    public static int singleNonDuplicate1(ArrayList<Integer> arr){
        /* Brute Force Approach */
        int n=arr.size();
        if(n==1)
        return arr.get(0);

        for(int i=0; i<n; i++){
            //check for first index
            if(i==0){
                if(arr.get(i) != arr.get(i+1))
                    return arr.get(i);
            }
            //check for last index
            else if(i==n-1){
                if(arr.get(i) != arr.get(i-1))
                    return arr.get(i);
            }
            else{
                if(arr.get(i) != arr.get(i-1) && arr.get(i) != arr.get(i+1))
                    return arr.get(i);
            }
        }
        //Dummy Return Statement
        return -1;
    }
    public static int singleNonDuplicate2(ArrayList<Integer> arr){
        int n=arr.size();

        //Edge Cases:
        if(n==1)
            return arr.get(0);
        if(arr.get(0) != arr.get(1))
            return arr.get(0);
        if(arr.get(n-1) != arr.get(n-2))
            return arr.get(n-1);

        int low=1, high=n-2;
        
        while(low<=high){

            int mid=(low+high)/2;

            // If arr[mid] is the single element:
            if(arr.get(mid) != arr.get(mid+1) && arr.get(mid) != arr.get(mid-1))
                return arr.get(mid);
                        
            // We are in the left:
            if((mid%2==1 && arr.get(mid) == arr.get(mid-1)) || (mid%2==0 && arr.get(mid) == arr.get(mid+1)))
                //Eliminate the left half:
                low=mid+1;            
            else
                //Eliminate the right half:
                high=mid-1;            
        }
        //Dummy return statement
        return -1;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6));
        // int ans1= singleNonDuplicate1(arr); --> For Brute Force 
        int ans2= singleNonDuplicate2(arr); //--> For Optimal
        System.out.println("The Single Element is: " +ans2);
    }
}
