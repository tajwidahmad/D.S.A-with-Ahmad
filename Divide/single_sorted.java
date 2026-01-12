package Divide;

public class single_sorted {
    public static void main(String[] args) {
        int arr1[]={3,3,7,7,10,11,11};
        
        System.out.println(find_single(arr1, 0, arr1.length-1));
    }
    public static int find_single(int arr1[],int si,int ei) {
        //mid
        while(si<=ei){
        int mid=si+(ei-si)/2;
        int n=arr1.length;
        // if element is in 0th or last index;
        if (mid==0 && arr1[0]!=arr1[1]) {
            return arr1[mid];
        }
        if (mid==n-1 && arr1[n-1]!=arr1[n-2]) {
            return arr1[mid];
        }
        if (arr1[mid-1]!=arr1[mid]&&arr1[mid]!=arr1[mid+1]) {
            return arr1[mid];
        }
        if (mid%2==0) {
            //left 
            if (arr1[mid-1]==arr1[mid]) {
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        else{
            //left
            if (arr1[mid-1]==arr1[mid]) {
                si=mid+1;
            }
            else{
                ei=mid-1;
            }
        }
        }
        return -1;
    }
}
