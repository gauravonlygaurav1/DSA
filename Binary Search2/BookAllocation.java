import java.util.*;

public class BookAllocation 
{
    public static int countStudents(ArrayList<Integer> arr, int pages){
        int n=arr.size();
        int students =1;
        long pagesStudent=0;
        for(int i=0; i<n; i++){
            if(pagesStudent + arr.get(i) <= pages){
                //add pages to current student
                pagesStudent += arr.get(i);
            }
            else{
                //add pages to next student
                students++;
                pagesStudent = arr.get(i);
            }
        }
        return students;
    }
    public static int findPages1(ArrayList<Integer> arr, int n, int m){
        /* Brute Force Approach */

        //book allocation possible
        if(m>n) return -1;

        int low=Collections.max(arr);
        int high=arr.stream().mapToInt(Integer::intValue).sum();

        for(int pages = low; pages<=high; pages++){
            if(countStudents(arr, pages)==m){
                return pages;
            }
        }
        return low;
    }
    
    public static int findPages2(ArrayList<Integer> arr, int n, int m){
        if(m>n) return -1;

        int low=Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();

        while(low<=high){
            int mid=(low+high)/2;
            int students=countStudents(arr,mid);
            if(students > m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args){
    ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24));
    int n=arr.size();
    int m=4;
    int ans1 = findPages1(arr, n, m);
    int ans2 = findPages2(arr, n, m);
    System.out.println("The Answer is : " +ans1);
    System.out.println("The Answer is : " +ans2);

    }
}
