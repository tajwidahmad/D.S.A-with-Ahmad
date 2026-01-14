package backtraking;
public class permutation {
    public static void main(String[] args) {
        String str="abc";
        findpermutation(str,"");
    }
    public static void findpermutation(String str,String ans) {
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            // remove the element from the string and then find permuations
            String newstr=str.substring(0,i)+str.substring(i+1);
            findpermutation(newstr, ans+currchar);

        }
    }
}

        

