package recursion;

public class pair_friends {
    public static void main(String[] args) {
        System.out.println(no_of_ways(3));
        
    }
    public static int no_of_ways(int n) {
        //base case
        if (n==1 || n==2) {
            return n;
        }
        //total ways=single+pait
        int single=no_of_ways(n-1);
        int pair=(n-1)*no_of_ways(n-2);
        int total_ways=single+pair;
        return total_ways;
    }
}
