//Frequency of Element using Array

public class freqOfelement1 {

    public static void main(String[] args){
        int arr[]={12,45,12,11,11};
        int n=arr.length;
        countFreq(arr,n);

    }
        static void countFreq(int arr[], int n){
            boolean visited[]=new boolean[n];//firstly all intialize as false
            for(int i=0; i<n; i++){
                if(visited[i]==true){
                    continue;
                }
                int count=1;
                for(int j=i+1; j<n; j++){
                    if(arr[i]==arr[j]){
                        visited[j]=true;
                        count++;
                    }
                }
                System.out.println(arr[i] +" " +count);
            }
        }
}
