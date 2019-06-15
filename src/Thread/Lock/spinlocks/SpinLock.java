package Thread.Lock.spinlocks;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 *
 * Java实现自旋锁
 * @Date: Create in 11:49 2019/6/15
 */
public class SpinLock {


    //lock（)方法利用的CAS，
    // 当第一个线程A获取锁的时候，能够成功获取到，不会进入while循环，如果此时线程A没有释放锁，
    // 另一个线程B又来获取锁，此时由于不满足CAS，所以就会进入while循环，不断判断是否满足CAS，
    // 直到A线程调用unlock方法释放了该锁。


    //它是不支持重入的，即当一个线程第一次已经获取到了该锁，在锁释放之前又一次重新获取该锁，第二次就不能成功获取到。
    // 由于不满足CAS，所以第二次获取会进入while循环等待，而如果是可重入锁，第二次也是应该能够成功获取到的。
    //
    //而且，即使第二次能够成功获取，那么当第一次释放锁的时候，第二次获取到的锁也会被释放，而这是不合理的。



    private AtomicReference<Thread> cas = new AtomicReference<>();

    public void lock(){

        Thread current = Thread.currentThread();

        while ( !cas.compareAndSet(null,current)) {
               // DO
        }
    }

    public void unlock(){

        Thread current = Thread.currentThread();

        cas.compareAndSet(current,null);
    }
}
