package DesignPatterns.SingletonPatterm.staticInner;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 静态内部实现的单例是懒加载的且线程安全。
 *
 *
 *只有通过显式调用 getInstance 方法时，才会显式装载
 * SingletonHolder 类，从而实例化 instance
 * （只有第一次使用这个单例的实例的时候才加载，
 * 同时不会有线程安全问题）。
 * @Date: Create in 16:13 2019/6/7
 */
public class Singleton {

    private static class SingletonHolder{

        private static final Singleton INSTANCE
                 = new Singleton();
    }

    private Singleton(){}

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
