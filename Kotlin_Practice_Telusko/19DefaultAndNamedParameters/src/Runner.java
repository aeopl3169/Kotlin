public class Runner {
    public static void main(String args[]) {
        // the @JvmOverloads annotation will create two methods,
        // single parameterized and double parameterized.
        System.out.println("Single parameter: " + DefaultKt.calcAmt(70));
        System.out.println("Double parameter: " + DefaultKt.calcAmt(70, 0.08));
    }
}
