package algorithm.sort;


import algorithm.sort.system.ArraysSort;
import utils.SortUtils;

import java.util.*;

/**
 * https://github.com/CyC2018/CS-Notes/blob/master/notes/Leetcode%20%E9%A2%98%E8%A7%A3%20-%20%E6%8E%92%E5%BA%8F.md#1-%E5%87%BA%E7%8E%B0%E9%A2%91%E7%8E%87%E6%9C%80%E5%A4%9A%E7%9A%84-k-%E4%B8%AA%E5%85%83%E7%B4%A0
 * <p>
 * K 个高频元素
 * <p>
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 * <p>
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 *
 * @author xuexiang
 * @since 2020/3/9 7:49 PM
 */
public class TopKFrequent {


    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(topKFrequent(nums, k));
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
        //1.统计出现的次数，value为统计次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Entity> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(new Entity(entry.getKey(), entry.getValue()));
        }
        //2.对count进行降序排序
        Collections.sort(list, new Comparator<Entity>() {
            @Override
            public int compare(Entity o1, Entity o2) {
                //降序排序
                return o2.count - o1.count;
            }
        });

        //3.获取结果
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(list.get(i).value);
        }
        return result;
    }


    public static class Entity {

        public int value;

        public int count;

        public Entity(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }


}
