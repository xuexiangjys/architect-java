package logic;

import java.util.Scanner;

/**
 * 我叫王大锤，是一家出版社的编辑。我负责校对投稿来的英文稿件，这份工作非常烦人，因为每天都要去修正无数的拼写错误。但是，优秀的人总能在平凡的工作中发现真理。我发现一个发现拼写错误的捷径：
 * <p>
 * 1. 三个同样的字母连在一起，一定是拼写错误，去掉一个的就好啦：比如 helllo -> hello
 * 2. 两对一样的字母（AABB型）连在一起，一定是拼写错误，去掉第二对的一个字母就好啦：比如 helloo -> hello
 * 3. 上面的规则优先“从左到右”匹配，即如果是AABBCC，虽然AABB和BBCC都是错误拼写，应该优先考虑修复AABB，结果为AABCC
 * <p>
 * 输入
 * <p>
 * 2
 * helloo
 * wooooooow
 * <p>
 * 输出
 * hello
 * woow
 *
 * @author xuexiang
 * @since 2020/2/29 8:35 PM
 */
public class Editor {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < line; i++) {
            modify(scanner.nextLine());
        }
    }


    /**
     * 使用正则表达式匹配
     *
     * @param s
     */
    private static void modify(String s) {
        if (s != null) {
            //  (.)代表任意字符， \\1代表取第一组匹配项， +代表重复1次及以上，加起来就是表示 任意一个字符重复两次或两次以上
            System.out.println(
                    s.replaceAll("(.)\\1+", "$1$1")
                            .replaceAll("(.)\\1(.)\\2", "$1$1$2")
            );
        }
    }


}
