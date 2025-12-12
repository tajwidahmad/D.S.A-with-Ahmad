public class prime {
    public static void main(String[] args){
        // System.out.println(check_prime(4));
        print_nums(9);

        
    }
    // for checking only the prime
    public static boolean check_prime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) {
                return false;
            }
            
        }
        return true;
    }
    // for printing the numbers..
    public static void print_nums(int n) {
        for(int i=2;i<=n;i++){
            if (check_prime(i)==true) {
                System.out.println(i);
            }

        }
        
    }
}