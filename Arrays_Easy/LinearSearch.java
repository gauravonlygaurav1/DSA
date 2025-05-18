public class LinearSearch {
    static int search(int arr[], int n, int num){
        
        for(int i=0; i<n; i++){
            if(arr[i]==num) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={10,5,4,8,2};
        int n=5;
        int num=4;
        int val=search(arr, n, num);
        System.out.println(val +" ");
    }
}
