package DesignPatterns.SingletonPatterm.LazyWay;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 懒汉式
 *
 * 所谓 “ 懒汉式” 就是说单例实例在第一次被使用时构建，而不是在JVM在加载这个类时就马上创建此唯一的单例实例。
 *
 * @Date: Create in 15:56 2019/6/7
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton(){}

    //没有加入synchronized关键字的版本是线程不安全的
    //如果多个线程同时访问getInstance()方法时就会出现问题。
    public static Singleton getInstance(){
        //判断当前单例是否已经存在，若存在则返回，不存在则再建立单例

        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

// 一种比较常见的方式就是在getInstance() 方法前加上synchronized关键字，如



    //程序中每次使用getInstance() 都要经过synchronized加锁这一层，这难免会增加getInstance()的方法的时间消费，而且还可能会发生阻塞。
//    public static synchronized Singleton getInstance() {
//        if (uniqueInstance == null) {
//            uniqueInstance = new Singleton();
//        }
//        return uniqueInstance;
//    }


}

