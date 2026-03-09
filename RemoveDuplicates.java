public class RemoveDuplicates {
    public static void main(String[] args) {
        boolean map[] = new boolean[25];
        System.out.println(removeDuplicates("appnacollege", 0, new StringBuilder(""), map));
    }

    public static StringBuilder removeDuplicates(String str, int i, StringBuilder newStr, boolean map[]){
        if(i == str.length()-1){
            return newStr;
        }
        char currChar = str.charAt(i);
        if(map[currChar-'a']!=true){
            map[currChar-'a'] = true;
            newStr.append(currChar);
        }
        return removeDuplicates(str, i+1, newStr, map);
        
    }

}
