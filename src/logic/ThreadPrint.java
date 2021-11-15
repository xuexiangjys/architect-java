package logic;

/**
 * Java多线程交替打印
 *
 * 使用synchronized和notify、wait来实现
 *
 * @author xuexiang
 * @since 2021/11/15 8:45 下午
 */
public class ThreadPrint {

    public static void main(String[] args) {
        Object lock = new Object();
        new Thread(new PrintTask(lock, "aaa")).start();
        new Thread(new PrintTask(lock, "bbb")).start();
    }

    private static class PrintTask implements Runnable {

        private final Object mLock;
        private final String mContent;

        public PrintTask(Object lock, String content) {
            mLock = lock;
            mContent = content;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (mLock) {
                    mLock.notify();
                    System.out.println("Thread " + Thread.currentThread().getName() + ":" + mContent + i);
                    try {
                        mLock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
