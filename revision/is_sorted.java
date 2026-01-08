package revision;

public class is_sorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(checking_sorted(arr, 0));
    }
    public static boolean checking_sorted(int arr[],int idx) {
        // base case
        if (idx==arr.length-1) {
            return true;
        }
        if (arr[idx]>arr[idx+1]) {
            return false;
        }
        return checking_sorted(arr, idx+1);
        
    }
}
