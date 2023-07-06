public class countAbc {
    public static int countAbc(String str){
        if(str.length()<3){
            return 0;
        }
        int count=0;
        if(str.charAt(0)=='a' && str.charAt(1)=='b' && (str.charAt(2)=='c'||str.charAt(2)=='a')){
            count++;
        }
        return count+ countAbc(str.substring(1));
    }
    public static void main(String[] args) {
/*countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2*/
    
        String str = "abaxxaba";
        System.out.println(countAbc(str));
    }
}
