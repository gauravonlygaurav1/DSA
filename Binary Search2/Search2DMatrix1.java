import java.util.*;
public class Search2DMatrix1 {

    public static boolean searchMatrix1(ArrayList<ArrayList<Integer>> matrix, int target){
        /* Brute Force Approach */    
        int n=matrix.size();
            int m=matrix.get(0).size();

            //traverse the matrix
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(matrix.get(i).get(j)==target)
                        return true;
                }
            }
            return false;
    }

    public static boolean binarySearch(ArrayList<Integer> num, int target){
        int n=num.size();
        int low=0, high=n-1;

        while(low<=high){
            int mid=(low+high);
            if(num.get(mid)==target) return true;
            else if(num.get(mid) < target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
    public static boolean searchMatrix2(ArrayList<ArrayList<Integer>> matrix, int target){
        /* Better Approach */
        int n=matrix.size();
        int m=matrix.get(0).size();

        for(int i=0; i<n; i++){
            if(matrix.get(i).get(0) <= target && target <= matrix.get(i).get(m-1)){
                return binarySearch(matrix.get(i), target);
            }
        }
        return false;
    }

    public static boolean searchMatrix3(ArrayList<ArrayList<Integer>> mat, int target){
        int n=mat.size();
        int m=mat.get(0).size();
        
        int low=0, high=n*m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m, col=mid%m;
            if(mat.get(row).get(col)==target) return true;
            else if(mat.get(row).get(col)<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,2,3,4)));
        matrix.add(new ArrayList<>(Arrays.asList(5,6,7,8)));
        matrix.add(new ArrayList<>(Arrays.asList(9,10,11,12)));

        boolean result1 = searchMatrix1(matrix,8);//Brute-Force Approach
        boolean result2 = searchMatrix2(matrix,8);//Better Approach
        boolean result3 = searchMatrix3(matrix,8);//Optimal Approach
        System.out.println(result1 ? "true" : "false");
        System.out.println(result2 ? "true" : "false");
        System.out.println(result3 ? "true" : "false");
    }
}
