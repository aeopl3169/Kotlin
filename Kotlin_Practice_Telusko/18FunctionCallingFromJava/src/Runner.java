public class Runner {
    public static void main(String args[]){
        int result = CodeKt.add(10,6);
        System.out.println(result);

        // By using this annotation (JvmName), class file will be saved with the word First.class instead of Code2Kt.class
        int res = First.add2(15,6);
        System.out.println(res);
    }
}
