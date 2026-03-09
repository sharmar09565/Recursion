public class BinaryString {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveOnes("1011001", 0, new StringBuilder("")));
    }
    public static StringBuilder removeConsecutiveOnes(String str, int i, StringBuilder newStr){
        if(i==str.length()){
            return newStr;
        }
        if(i==0 || str.charAt(i-1)=='0'){
            newStr.append(str.charAt(i));
        }
        else if(str.charAt(i-1)!=str.charAt(i)){
            newStr.append(str.charAt(i));
        }
        return removeConsecutiveOnes(str, i+1, newStr);
    }
}
