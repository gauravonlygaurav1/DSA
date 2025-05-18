public class FindXinSortedArray{

    public static int binarySearch1(int nums[], int x){
        /* Iterative Approach */
        int n=nums.length;
        int low = 0, high = n-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid] == x) return mid;
            else if(nums[mid] < x) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public static int search(int arr[], int low, int high, int target){
        /* Recursive Approach */
        if(low>high) return -1; //Base case

        int mid=(low+high)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid] < target)
            return search(arr, mid+1, high, target);
        else
            return search(arr, low, mid-1, target);
    }
    public static int binarySearch2(int[] arr, int target){
        return search(arr, 0, arr.length-1, target);
    }
    public static void main(String... args){
        int[] a={3, 4, 6, 7, 9, 12, 16, 17};
        int target=6;
        // int ind1=binarySearch1(a,target);    --> Uncomment for Brute Approach
        int ind2=binarySearch2(a,target);
        if(ind2==-1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " +ind2);
    }
}