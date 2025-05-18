public class FirstOccurenceX {

    public static int solve(int n, int key, int[] v){
        int low=0, high=n-1;
        int first=-1;

        while(low <= high){

            int mid=(low+high)/2;
            if(v[mid]==key){
                first=mid;
                high=mid-1;
            }
            else if(v[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        return first;
    }
    public static void main(String args[]) {
        int n = 7;
        int key = 13;
        int[] v = {3,4,13,13,13,20,40};
    
        // returning the last occurrence index if the element is present otherwise -1
        System.out.println(solve(n, key, v));
      }
}
