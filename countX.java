public class countX {
    public static int countX(String str){
        if(str.isEmpty()){
            return 0;
        }
        int count = 0;
        if(str.charAt(0)=='x'){
            count++;
        }
        int tot = count + countX(str.substring(1));
        return tot;
    }
    public static void main(String[] args) {
        String str = "hixxx";
        System.out.println(countX(str));
    }
}
