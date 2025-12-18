package recursion;

public class Remove_dups {
    public static void main(String[] args) {
        duplicate_remove(0,new StringBuilder(""), new boolean[26], "tajawida");
        
    }
    public static void duplicate_remove(int idx,StringBuilder newstr,boolean map[],String str) {
        
        if (idx==str.length()) {
            System.out.println(newstr);
            return;
        }
        char curr_char=str.charAt(idx);
        if (map[curr_char-'a']==true) {
            duplicate_remove(idx+1, newstr, map, str);
        }
        else{
            map[curr_char-'a']=true;
            duplicate_remove(idx+1, newstr.append(curr_char), map, str);
            
        }
    }
}
