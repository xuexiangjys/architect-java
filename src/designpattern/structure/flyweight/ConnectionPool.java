package designpattern.structure.flyweight;

import designpattern.creation.singleton.DoubleCheckSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * 享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用。
 * <p>
 * 详细参见：https://blog.csdn.net/xuexiangjys/article/details/78924859
 *
 * @author xuexiang
 * @since 2020/3/28 10:03 PM
 */
public class ConnectionPool {

    private static ConnectionPool sInstance = null;

    private Vector<Connection> mPool;
    private Connection mConnection = null;

    /*公有属性*/
    private String mUrl = "jdbc:mysql://localhost:3306/test";
    private String mUsername = "root";
    private String mPassword = "root";
    private String mDriverClassName = "com.mysql.jdbc.Driver";
    private int mPoolSize = 100;

    /*构造方法，做一些初始化工作*/
    private ConnectionPool() {
        mPool = new Vector<>(mPoolSize);

        for (int i = 0; i < mPoolSize; i++) {
            try {
                Class.forName(mDriverClassName);
                mConnection = DriverManager.getConnection(mUrl, mUsername, mPassword);
                mPool.add(mConnection);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static ConnectionPool getInstance() {
        if (sInstance == null) {
            synchronized (ConnectionPool.class) {
                if (sInstance == null) {
                    sInstance = new ConnectionPool();
                }
            }
        }
        return sInstance;
    }


    /* 不需要的连接再放入到连接池中 */
    public synchronized void release() {
        mPool.add(mConnection);
    }

    /* 返回连接池中的一个数据库连接 */
    public synchronized Connection getConnection() {
        if (mPool.size() > 0) {
            Connection conn = mPool.get(0);
            mPool.remove(conn);
            return conn;
        } else {
            return null;
        }
    }
}
