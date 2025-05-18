public class HLfreqElement{
    public static void main(String[] args){
        int arr[]={10,5,15,10,5,20,10};
        int n=arr.length;
        countFreq(arr,n);
    }
    public static void countFreq(int arr[],int n){
        int maxFreq=0, minFreq=n;
        int maxEle=0, minEle=0;
        boolean[] visited=new boolean[n];
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
            if(count>maxFreq){
                maxEle=arr[i];
                maxFreq=count;
            }
            if(count<minFreq){
                minEle=arr[i];
                minFreq=count;
            }
            
        }
        System.out.println( maxEle + " " +maxFreq);
        System.out.println( minEle + " " +minFreq);
    }
}