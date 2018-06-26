package utils;

/**
 * 日志打印
 */
public class LogUtils {

    public static void printBeforeSort(int[] array) {
        System.out.println("排序之前：");
        for (int anA1 : array) {
            System.out.print(anA1 + " ");
        }
        System.out.println();
    }

    public static void printAfterSort(int[] array) {
        System.out.println("排序之后：");
        for (int anA1 : array) {
            System.out.print(anA1 + " ");
        }
        System.out.println();
    }
}
