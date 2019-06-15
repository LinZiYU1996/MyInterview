package Thread.AtomicClass.AdvantageOfAtomicIntegerTest;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 多线程环境不使用原子类保证线程安全（基本数据类型）
 *
 * @Date: Create in 15:57 2019/6/15
 */
public class Test {

    private volatile int count = 0;

    public synchronized void increment() {

        count++;

    }

    public int getCount() {

        return count;

    }
}
