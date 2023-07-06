public class count11 {
    public static int count11(String str){
        if(str.length()<2){
            return 0;
        }
        if(str.charAt(0)=='1' && str.charAt(1)=='1'){
            return 1 + count11(str.substring(2));// in this case recurse from index 2
        }
        // in case '1' is not at index 0
        return count11(str.substring(1)); // here recurse from index 1
    }
    public static void main(String[] args) {
        String str = "111";
        System.out.println(count11(str));
        
    }
}
