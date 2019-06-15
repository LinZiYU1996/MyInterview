package Thread.Lock.spinlocks;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 实现可重入锁，我们需要引入一个计数器，用来记录获取锁的线程数。
 *
 *
 * @Date: Create in 15:11 2019/6/15
 */
public class ReentrantSpinLock {


    private AtomicReference<Thread> cas = new AtomicReference<>();

    private int count;

    public void lock(){

        Thread current = Thread.currentThread();

        if ( current == cas.get()) {// 如果当前线程已经获取到了锁，线程数增加一，然后返回

            count++;

            return;
        }

        // 如果没获取到锁，则通过CAS自旋
        while ( !cas.compareAndSet(null,current)) {

            //DO

        }
    }

    public void unlock(){

        Thread cur = Thread.currentThread();

        if ( cur == cas.get() ) {

            if ( count > 0 ) {// 如果大于0，表示当前线程多次获取了该锁，释放锁通过count减一来模拟

                count--;

            } else {  // 如果count==0，可以将锁释放，这样就能保证获取锁的次数与释放锁的次数是一致的了。

                cas.compareAndSet(cur,null);

            }
        }
    }


}
