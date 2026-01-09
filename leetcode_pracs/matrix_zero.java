package leetcode_pracs;

import recursion.last_occurance;

public class matrix_zero {
    public static void main(String[] args) {
        //Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
        int arr[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        Set_zeros(arr);
 


    }
    public static void Set_zeros(int arr[][]) {
        //row and the column array creation.
        int[] row=new int[arr.length];
        int[] column=new int[arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (arr[i][j]==0) {
                    row[i]=1;
                    column[j]=1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (row[i]==1 || column[j]==1) {
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        
    }
}
