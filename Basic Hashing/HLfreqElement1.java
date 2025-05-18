import java.util.HashMap;
import java.util.Map;
public class HLfreqElement1 {
    public static void main(String[] args){
        int arr[]={10,22,40,22,10};
        int n=arr.length;
        count(arr,n);
    }
    public static void count(int arr[], int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        int maxFreq=0, minFreq=n;
        int maxEle=0, minEle=0;

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int count=entry.getValue();
            int element=entry.getKey();

            if(count>maxFreq){
                maxEle=element;
                maxFreq=count;
            }
            if(count<minFreq){
                minEle=element;
                minFreq=count;
            }
        }
        System.out.println("The highest frequency element is " +maxEle);
        System.out.println("The minimum frequency element is " +minEle);
    }
}
