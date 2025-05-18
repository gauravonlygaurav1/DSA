public class SqrtOfNumber{

    public static int findsqrt1(int n){
        /* Brute Force Approach */
        int ans=0;
        for(long i=1; i<=n; i++){
            long val = i*i;
            if(val<=(long)n){
                ans=(int)i;
            }
            else{
                break;
            }
        }
        return ans;
    }
    public static int findsqrt2(int n){
        /* Better Approach */
        /* Using in-built sqrt() function */
        int ans = (int) Math.sqrt(n);
        return ans;
    }
    public static int findsqrt3(int n){
        int low=1, high=n;
        int ans=1;
        while(low<=high){
            long mid=(low+high)/2;
            long val=mid*mid;
            if( val <= (long)n ){
                ans=(int)mid;
                low=(int)(mid+1);
            }
            else{
                high=(int)(mid-1);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int n=28;
        int ans1=findsqrt1(n);
        int ans2=findsqrt2(n);
        int ans3=findsqrt3(n);
        System.out.println("The Square Root of " +n+ " is : " +ans3);
    }
}