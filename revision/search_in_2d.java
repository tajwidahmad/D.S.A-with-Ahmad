package revision;

public class search_in_2d {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,5},{7,8,9,4}};
        int key=3;
        System.out.println(search(arr, key));
    }
    public static boolean search(int arr[][],int key) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (arr[i][j]==key) {
                    return true;
                }
            }
        }
        return false;
    }
}
