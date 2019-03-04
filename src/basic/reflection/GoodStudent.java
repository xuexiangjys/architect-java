package basic.reflection;

/**
 * 继承了Student，用于测试"如果调用的方法属于该对象的父类,那getDeclaredMethod就会抛异常NoSuchMethodException"的问题
 *
 * @author xuexiang
 * @since 2019/3/4 下午10:12
 */
public class GoodStudent extends Student {

    private int AchievementCount = 3;


    public GoodStudent(int ID, String name, int age, int sex, int score) {
        super(ID, name, age, sex, score);
    }

    public GoodStudent(Student student) {
        super(student.ID + 1, "xxxx", 22);
    }

    public int getAchievementCount() {
        return AchievementCount;
    }

    public GoodStudent setAchievementCount(int achievementCount) {
        AchievementCount = achievementCount;
        return this;
    }
}
