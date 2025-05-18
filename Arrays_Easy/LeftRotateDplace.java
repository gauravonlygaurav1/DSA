public class LeftRotateDplace {
    public static void LRotate(int arr[], int n, int k){
        /* Brute-Force Approach */
        if(n==0) return;

        k=k%n;

        if(k>n) return;

        int temp[]=new int[k];

        for(int i=0; i<k; i++){
            
            temp[i]=arr[i];
        }
        for(int i=0; i<n-k; i++){

            arr[i]=arr[i+k];
        }
        for(int i=n-k; i<n; i++){

            arr[i]=temp[i-n+k];
        }
    }
    //Function to Reverse the array
    public static void Reverse(int arr[], int start, int end){
        while(start<=end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    }
    public static void LeftRotate(int arr[], int n, int k){
        /* Optimal Approach */

        //Normalize k if it is greater than n
        k=k%n;

        //Reverse first k elements
        Reverse(arr,0,k-1);

        //Reverse the remaining n-k elements
        Reverse(arr,k,n-1);

        //Reverse the whole n array
        Reverse(arr,0,n-1);

    }    
    
    public static void main(String[] args){
            int n=7;
            int[] arr={1,2,3,4,5,6,7};
            int k=3;
            LeftRotate(arr,n,k);
            for(int i=0; i<n; i++) System.out.print(arr[i] +" ");
        }
}
