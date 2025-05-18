public class SecLargeElement{
    static void SL_Sort(int []arr, int n){
        for(int i=0; i<n; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        int Largest=arr[n-1];
        for(int i=n-1; i>=0; i--){
            if(Largest != arr[i]){
                Largest=arr[i];
                break;
            }
        }
        System.out.println("The Second Largest Element is " +Largest);
    }
    static void SL_Element(int arr[], int n){
        int Largest=arr[0];
        int Slargest=-1;
        for(int i=0; i<n; i++){
            if(arr[i]>Largest){
                Slargest=Largest;
                Largest=arr[i];
            }
            else if(arr[i]<Largest && arr[i]>Slargest){
                Slargest=arr[i];
            }
        }
        System.out.println("The Second Largest " +Slargest);
    }
    public static void main(String[] args){
        int[] arr={1,2,4,7,7,5};
        int n=arr.length;
        SL_Element(arr,n);
        for(int i=0; i<n; i++) System.out.print(arr[i] +" ");
        
    }
}