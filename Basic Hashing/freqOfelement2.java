//Frequency of element using Map

import java.util.*;
public class freqOfelement2 {
    public static void main(String[] args){
        int arr[] ={10,20,10,30};
        int n=arr.length;
        countFreq(arr,n);
    }

    static void countFreq(int arr[], int n){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) +1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() +" " +entry.getValue());
        }
    }
}
