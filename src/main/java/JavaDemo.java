
/**
 * Created by xiaoyue26 on 17/7/11.
 */
public class JavaDemo {
    public static void testStringFormat() {
        float floatVar = 3.0f;
        int intVar = 3;
        String stringVar = "123";
        String fs2 = String.format("浮点型变量为 %f, 整型变量为 %d, 字符串为  %s\n", floatVar, intVar, stringVar);
        System.out.println(fs2);
    }

    public static void main(String args[]) {

        System.out.println("hello world from java");
    }
}
