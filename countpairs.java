public class countpairs {
    public static int countpairs(String str){
        if(str.length()<3){
            return 0;
        }
        int count = 0;
        if(str.charAt(0)==str.charAt(2)){
            count++;
        }
        return count + countpairs(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "axax";
        System.out.println(countpairs(str));
    }
}