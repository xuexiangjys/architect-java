package logic;


import java.util.Scanner;

/**
 * 水瓶题
 * <p>
 * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，
 * 方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
 * 然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
 * <p>
 * 如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 *
 * @author xuexiang
 * @since 2019/10/23 下午9:47
 */
public class WaterBottle {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        while (input != 0) {
            exchange2(input);
            input = in.nextInt();
        }
    }


    /**
     * 兑换汽水
     *
     * @param input
     */
    private static void exchange(int input) {
        int output = 0;
        //每次兑换的
        int change;
        //剩余的
        int left;
        while (input > 1) {
            if (input == 2) {
                output++;
                input = 0;
            } else {
                change = input / 3;
                output += change;
                left = input % 3;
                input = left + change;
            }
        }
        System.out.println(output);
    }

    /**
     * 兑换汽水
     *
     * @param input
     */
    private static void exchange2(int input) {
        System.out.println(input / 2);
    }
}
