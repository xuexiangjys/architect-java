package designpattern.behavior.visit;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工业绩报表
 *
 * @author xuexiang
 * @since 2020/3/29 12:25 AM
 */
public class BusinessReport {

    private List<Stuff> mStuffs = new ArrayList<>();

    public BusinessReport() {
        mStuffs.add(new Engineer("1"));
        mStuffs.add(new Engineer("2"));
        mStuffs.add(new Manager("3"));
        mStuffs.add(new Manager("4"));
    }

    public void showReport(Visitor visitor) {
        for (Stuff stuff : mStuffs) {
            stuff.accept(visitor);
        }
    }

}
