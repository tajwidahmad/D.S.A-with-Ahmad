package Divide;

import java.util.Arrays;

public class Assignment {
    public static void main(String[] args) {
        String arr[]= { "sun", "earth", "mars", "mercury"};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print("{"+arr[i]+"}"+" ");
        }
        System.out.println();
    }
}
