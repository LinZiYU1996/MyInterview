package DesignPatterns.SingletonPatterm.double_checked_locking;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 利用双重检查加锁（double-checked locking），首先检查是否实例已经创建，如果尚未创建，“才”进行同步。这样以来，只有一次同步，这正是我们想要的效果。
 *
 *
 *
 * @Date: Create in 16:00 2019/6/7
 */
public class Singleton {

    //volatile保证，当uniqueInstance变量被初始化成Singleton实例时，多个线程可以正确处理uniqueInstance变量

    private volatile static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance(){
        //检查实例，如果不存在，就进入同步代码块

        if (uniqueInstance == null){
            //只有第一次才彻底执行这里的代码

            synchronized (Singleton.class){
                //进入同步代码块后，再检查一次，如果仍是null，才创建实例

                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }

        }
        //很明显，这种方式相比于使用synchronized关键字的方法，可以大大减少getInstance() 的时间消费。
        return uniqueInstance;
    }


}
