package Thread.AtomicClass.AdvantageOfAtomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 多线程环境使用原子类保证线程安全（基本数据类型）
 *
 * @Date: Create in 15:58 2019/6/15
 */
public class Test2 {

    private AtomicInteger count = new AtomicInteger();

    public void increment() {

        count.incrementAndGet();

    }

    public int getCount() {
        return count.get();
    }
}
