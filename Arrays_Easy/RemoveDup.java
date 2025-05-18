/* Remove duplicates in-place from Sorted Array */
import java.util.HashSet;
public class RemoveDup {
    static int DupSet(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }

        int k=set.size();
        int j=0;
        for(int it: set){
            arr[j]=it;
            j++;
        }
        return k;
    }
    static int removeDuplicates(int[] arr){
        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        int arr[]={1,1,2,2,2,3,3};
        for(int i=0; i<arr.length; i++) System.out.print(arr[i] +" ");
        int k=removeDuplicates(arr);
        int k=DupSet(arr);
        System.out.println();
        System.out.println("Remove Duplicate Elements");
        for(int i=0; i<k; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
