package utils;

import algorithm.sort.ISort;
import algorithm.sort.insert.BinaryInsertSort;

import java.util.concurrent.TimeUnit;

/**
 * 排序工具类
 */
public class SortUtils {

    /**
     * 排序
     * @param iSort
     * @param array
     */
    public static void sort(ISort iSort, int[] array) {
        LogUtils.printBeforeSort(array);

        long startNanos = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            array = iSort.sort(array);
        }
        long stopNanos = System.nanoTime();

        LogUtils.printAfterSort(array);

        double lengthMillis = TimeUnit.NANOSECONDS.toMillis(stopNanos - startNanos) / 1000D;

        System.out.println("共耗时：[" + lengthMillis + "]ms");
    }

}
