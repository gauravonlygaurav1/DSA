/* First And Last Occurence of X in Array */
public class FirstAndLastX {

    /* For the Brute Force Approach */
    public static int[] solve1(int arr[], int x, int n){
        int first=-1, last=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==x){

                if(first == -1) first=i;//For First
                 
                last = i;//For Last
            }
        }
        return new int[]{first,last};
    }

    /* For The Optimal Approach */
    static int lowerbound(int arr[], int n, int x){
        
        int low=0, high=n-1;
        int ans=n;

    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid] >= x){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return ans;
    }
    static int upperbound(int arr[], int n, int x){
        
        int low=0, high=n-1;
        int ans=n;

    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid] > x){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return ans;
    }
    public static int[] solve2(int arr[], int x, int n){

        int lb=lowerbound(arr,n,x);

        if(lb==n || arr[lb] != x) return new int[] {-1,-1};

        return new int[] {lb, upperbound(arr,n,x) -1 };
    }   
        
    public static void main(String args[]){
        int n = 7;
        int x = 13;
        int[] arr = {3,4,13,13,13,20,40};

        //int[] res1 = solve1(arr, x, n);     --> Uncomment for Brute Approach
        int[] res2 = solve2(arr, x, n);
        System.out.println("First Occurence: " +res2[0]);
        System.out.println("First Occurence: " +res2[1]);

    }
}
