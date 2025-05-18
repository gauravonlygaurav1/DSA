import java.util.*;
public class LongConsSeqArray{

    public static boolean linearSearch(int a[], int num){
        int n=a.length;
        for(int i=0; i<n; i++){
            if(a[i] == num)
            return true;
        }
        return false;
    }
    public static int longConsSeq1(int a[]){
        /* Brute-Force Approach */
        int n = a.length;
        int longest = 1;

        for(int i=0; i<n; i++){
            int x = a[i];
            int cnt=1;

            while(linearSearch(a, x+1) == true){
                x += 1;
                cnt += 1;
            }

            longest = Math.max(longest, cnt);
        }
        return longest;
    }
    public static int longConsSeq2(int a[]){
        /* Better Approach */
        int n=a.length;
        if(n==0) return 0;

        //sort the array
        Arrays.sort(a);
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        for(int i=0; i<n; i++){

        if(a[i]-1 == lastSmaller){
            cnt += 1;
            lastSmaller=a[i];
        }
        if(a[i] != lastSmaller){
            cnt = 1;
            lastSmaller=a[i];
        }
        longest = Math.max(longest, cnt);
    }
    return longest;
    }
    public static void main(String[] args){
        int a[]= {100, 200, 1, 2, 3, 4};
        int ans1 = longConsSeq1(a);
        int ans2 = longConsSeq2(a);
        System.out.println("The longest consecutive sequence is "  +ans1);
        System.out.println("The longest consecutive sequence is "  +ans2);
    }
}