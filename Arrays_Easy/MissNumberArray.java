public class MissNumberArray {
    public static int BruteMissing(int arr[], int n){
        for(int i=1; i<=n; i++){
            int flag=0;
            for(int j=0; j<n-1; j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0) return i;
        }
        return -1;
    }
    public static int BetterMissing(int arr[], int n){
        int hash[]= new int[n+1];

        for(int i=0; i< n-1; i++){
            hash[arr[i]]++;
        }
        for(int i=1; i<=n; i++){
            if(hash[i]==0) return i;
        }
        return -1;
    }
    public static int OptimalMissing1(int arr[], int n){
        int sum=(n*(n+1))/2;

        int s2=0;
        for(int i=0; i<n-1; i++){
            s2+=arr[i];
        }
        int misSum=sum-s2;
        return misSum;
        
    }
    public static int OptimalMissing2(int arr[], int n){
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < n - 1; i++) {
            xor2 = xor2 ^ arr[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ n; //XOR up to [1...N]

        return (xor1 ^ xor2); // the missing number
    } 
    public static void main(String[] args){
        int arr[]={1,2,4,5};
        int n=5;
        int miss=OptimalMissing2(arr,n);
        System.out.println(miss);
    }
}
