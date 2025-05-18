import java.util.*;
public class PainterPartition {
    public static int countPainters(ArrayList<Integer> boards, int time){
        int n=boards.size();
        int painters=1;
        long boardsPainter=0;
        for(int i=0; i<n; i++){
            if(boardsPainter + boards.get(i) <= time){
                boardsPainter += boards.get(i);
            }
            else{
                //allocate board to next painter
                painters++;
                boardsPainter = boards.get(i);
            }
        }
        return painters;
    }
    public static int find1(ArrayList<Integer> boards, int k){
        /* Brute Force Approach */

        int low=Collections.max(boards);
        int high=boards.stream().mapToInt(Integer::intValue).sum();

        for(int time=low; time<=high; time++){
            if(countPainters(boards, time) <= k){
                return time;
            }
        }
        return low;
    }

    public static int find2(ArrayList<Integer> boards, int k){
        /* Optimal Approach */

        int low=Collections.max(boards);
        int high=boards.stream().mapToInt(Integer::intValue).sum();

        while(low<=high){
            int mid=(low+high)/2;
            int painters=countPainters(boards, mid);
            if(painters > k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        ArrayList<Integer> boards=new ArrayList<>(Arrays.asList(10,20,30,40));
        int k=2;
        int ans1=find1(boards,k);
        int ans2=find2(boards,k);
        System.out.println("The answer is : " +ans1);
        System.out.println("The answer is : " +ans2);

    }
}
