public class SubSets {
    public static void subSets(String str, String ans, int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        // For yes
        subSets(str,ans+str.charAt(i), i+1);
        // For no
        subSets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSets(str, "", 0);
    }
}
