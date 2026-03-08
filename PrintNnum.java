public class PrintNnum {
    public static void main(String[] args) {
        printNum(10);

    }

    public static void printNum(int n){
        // if(n>0){
        //     System.out.println(n);
        //     printNum(n-1);
        // }
        if(n==1){
            System.out.println(n);
            return;
        }
        printNum(n-1);
        System.out.println(n);
    
    }


}
