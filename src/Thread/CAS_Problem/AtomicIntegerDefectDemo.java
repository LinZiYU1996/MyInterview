package Thread.CAS_Problem;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 分析CAS ABA问题
 * @Date: Create in 15:43 2019/6/15
 */
public class AtomicIntegerDefectDemo {

    public static void main(String[] args) {


        defectOfABA();

    }

    static void defectOfABA() {

        final AtomicInteger atomicInteger = new AtomicInteger();

        Thread coreThread = new Thread(

                () -> {

                    final int currentValue = atomicInteger.get();

                    System.out.println( Thread.currentThread().getName());

                    try {

                        Thread.sleep( 300 );

                    } catch ( InterruptedException e) {

                        e.printStackTrace();

                    }

                    boolean casResult = atomicInteger.compareAndSet(1, 2);
                    System.out.println(Thread.currentThread().getName()
                            + " ------ currentValue=" + currentValue
                            + ", finalValue=" + atomicInteger.get()
                            + ", compareAndSet Result=" + casResult);
                }
        );

        coreThread.start();

        try {

            Thread.sleep( 100 );
        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        Thread amateurThread = new Thread(

                () -> {

                    int currentValue = atomicInteger.get();
                    boolean casResult = atomicInteger.compareAndSet(1, 2);
                    System.out.println(Thread.currentThread().getName()
                            + " ------ currentValue=" + currentValue
                            + ", finalValue=" + atomicInteger.get()
                            + ", compareAndSet Result=" + casResult);

                    currentValue = atomicInteger.get();
                    casResult = atomicInteger.compareAndSet(2, 1);
                    System.out.println(Thread.currentThread().getName()
                            + " ------ currentValue=" + currentValue
                            + ", finalValue=" + atomicInteger.get()
                            + ", compareAndSet Result=" + casResult);

                }

        );

        amateurThread.start();

    }

}
