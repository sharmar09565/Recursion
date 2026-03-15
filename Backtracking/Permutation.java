public class Permutation {
    public static void permutation(String str, String ans){     // O(n*n!)
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            // "abcde" => "ab"+"de" = "abde"  Skip the curr char bcz it should not repeat
            String newString = str.substring(0,i)+str.substring(i+1);
            permutation(newString, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }
}
