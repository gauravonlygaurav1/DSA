public class NumbersAppearOnes {
    static int getSingleElement1(int arr[]){
        /* Brute-Force Approach */
        int n=arr.length;

        for(int i=0; i<n; i++){
            int num=arr[i];
            int count=0;
            for(int j=0; j<n; j++){
                if(arr[j]==num){
                    count++;
                }
            }
            if(count==1) return num;
        }
        return -1;
    }
    static int getSingleElement2(int arr[]){
        /* Better Approach */
        int n=arr.length;

        int maxi=arr[0];
        for(int i=0; i<n; i++){
            maxi=Math.max(maxi,arr[i]);
        }
        
        int[] hash=new int[maxi+1];

        for(int i=0; i<n; i++){
            hash[arr[i]]++;
        }

        for(int i=0; i<n; i++){
            if(hash[arr[i]]==1) return arr[i];
        }
        return -1;
    }
    static int getSingleElement3(int arr[]){
        /* Optimal Approach */
        int n=arr.length;
        
        int xor=0;
        for(int i=0; i<n; i++){
            xor=xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args){
        int[] arr = { 1, 2, 1, 2, 4};
        int ans=getSingleElement3(arr);
        System.out.println(ans);
    }
}
