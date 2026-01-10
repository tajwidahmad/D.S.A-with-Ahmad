package Divide;

public class Quick_sort {
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        sortquick(arr, 0, arr.length-1);
        printarr(arr);
    }
    public static void sortquick(int arr[],int si,int ei) {
        if (si>=ei) {
            return;
            
        }
        int pidx=Partition(arr, si, ei);
        sortquick(arr, si, pidx-1);//left part sorting
        sortquick(arr, pidx+1, ei);//right part sorting
        
        
    }
    public static int Partition(int arr[],int si, int ei) {
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if (arr[j]<=pivot) {
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }

        }
        // for 5 to be in mid
        // one more swap
        i++;
        int temp=arr[ei]; // error->...pivot {int temp=pivot}
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
        
       


    }
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
