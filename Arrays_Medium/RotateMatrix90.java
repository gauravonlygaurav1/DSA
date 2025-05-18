/* Brute-Force Approach */
public class RotateMatrix90 {
    static int[][] rotate1(int[][] matrix){
        int n = matrix.length;
        int rotated[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                rotated[j][n-1-i] = matrix[i][j];
            }
        }
        return rotated;
    } 
/* Optimal Approach */
    static void rotate2(int[][] matrix){
        //For Transpose
        for(int i=0; i<matrix.length; i++){
            for(int j=i; j<matrix[0].length; j++){
                int temp=0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //For Reversing Rows Element
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
    public static void main(String[] args){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int rotated[][] = rotate1(arr);
        rotate2(arr);
        System.out.println("Brute-Force Rotated Image:");
        for(int i=0; i<rotated.length; i++){
            for(int j=0; j<rotated.length; j++){
                System.out.print(rotated[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Optimal Rotated Image:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
