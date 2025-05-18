public class SecSmallestElement{
    static void SecSmall(int arr[], int n){
        int Smallest=arr[0];
        int Ssmallest=99;
        for(int i=0; i<n; i++){
            if(arr[i]<Smallest){
                Ssmallest=Smallest;
                Smallest=arr[i];
            }
        }
        System.out.println("The Second Smallest Element " +Ssmallest);
    }
    public static void main(String[] args){
        int[] arr={34,6,1,4,10};
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
        SecSmall(arr,n);
    }
}