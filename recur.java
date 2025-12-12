public class recur {
    // public static void printnums(int n) {
    //     if(n==1){
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     printnums(n-1);
        
    // }
    public static void print_from_start(int n) {
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        print_from_start(n+1);
    }

    public static void main(String[] args) {
        // printnums(10);
        print_from_start(1);
         
    }
}
