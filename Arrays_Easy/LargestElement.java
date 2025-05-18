public class LargestElement {
    static int largeSort(int arr[], int n){
        for(int i=n-1; i>=1; i--){
            for(int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr[n-1];
    }
    static int largeElement(int arr[], int n){
        int Large=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>Large){
                Large=arr[i];
            }
        }
        return Large;
    }
    public static void main(String[] args){
        int[] arr={90,50,30,10,5};
        int n=arr.length;
        int L=largeSort(arr,n);
        System.out.println("By Sorting" +L);
        int LE=largeElement(arr,n);
        System.out.println("By Looping " +LE);

    }
}
