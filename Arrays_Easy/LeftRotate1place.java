public class LeftRotate1place {
    public static void LRotate(int arr[], int n){
        /* Brute-Force Approach */
        int temp[]=new int[n];
        for(int i=1; i<n; i++){
            temp[i-1]=arr[i];
        }
        temp[n-1]=arr[0];
        for(int i=0; i<n; i++){
            System.out.print(temp[i] +" ");
        }
    }
    public static void LeftRotate(int arr[], int n){
        /* Optimal Approach */
        int temp=arr[0];
        for(int i=1; i<n; i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args){
        int n=5;
        int arr[]={10,20,50,80,100};
        LeftRotate(arr,n);
    }
}
