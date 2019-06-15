package Thread.AtomicClass.AtomicIntegerDemo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 原子类的使用
 * @Date: Create in 15:52 2019/6/15
 */
public class AtomicIntegerTest {

    public static void main(String[] args) {


        int temvalue = 0;

        AtomicInteger i = new AtomicInteger(0);

        temvalue = i.getAndSet(3);  //把0赋值给 temvalue，再自己变成3

        System.out.println("temvalue:" + temvalue + "; 原子类 i:" + i);//temvalue:0;  i:3

        temvalue = i.getAndIncrement();

        System.out.println("temvalue:" + temvalue + "; 原子类 i:" + i);//temvalue:3;  i:4

        temvalue = i.getAndAdd(5);

        System.out.println("temvalue:" + temvalue + ";原子类  i:" + i);//temvalue:4;  i:9
    }

}
