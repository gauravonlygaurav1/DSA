import java.util.ArrayList;
public class MoveZeroEnd{
    public static int[] moveZeros(int n, int a[]){
        /* Brute-Force Approach */
        ArrayList<Integer> temp=new ArrayList<>();

        //from orginal -> temp array
        for(int i=0; i<n; i++){
            if(a[i] != 0){
                temp.add(a[i]);
            }
        }

        // number of non-zero elements
        int nz=temp.size();

        for(int i=0; i<nz; i++){
            a[i]=temp.get(i);
        }

        for(int i=nz; i<n; i++){
            a[i]=0;
        }

        return a;
    }
    public static int[] MoveZero(int n, int a[]){
        /* Optimal Approach */
        int j=-1;
        //Place the pointer j
        for(int i=0; i<n; i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return a;

        for(int i=j+1; i<n; i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        return a;
    }
    public static void main(String[] args){
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n=10;
        int[] ans=MoveZero(n,arr);
        for(int i=0; i<n; i++) System.out.print(ans[i] +" ");
    }
}