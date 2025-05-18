import java.util.List;
import java.util.ArrayList;
/* Optimal Solution */
public class PrintMatrixSpiral{

    public static List<Integer> printSpiral(int[][] mat){
        
        List<Integer> spiral = new ArrayList<>();

        int n = mat.length; // no. of rows
        int m = mat[0].length; //no. of columns

        int top=0, left=0, right=n-1, bottom=m-1;

        while(top <= bottom && left <= right){

            for(int i = left; i <= right; i++)
                spiral.add(mat[top][i]);

            top++;

            for(int i = top; i <= bottom; i++)
                spiral.add(mat[i][right]);

            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--)
                    spiral.add(mat[bottom][i]);
                
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--)
                    spiral.add(mat[i][left]);
                
                left++;
            }
        }

        return spiral;
    }
    public static void main(String[] args){
    int[][] mat={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

    List<Integer> ans = printSpiral(mat);

    System.out.print(ans +" ");
}
}