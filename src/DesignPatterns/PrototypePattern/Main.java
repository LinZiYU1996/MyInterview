package DesignPatterns.PrototypePattern;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:19 2019/6/7
 */
public class Main {


    public static void main(String[] args) {

        Manager manager = new Manager();

        UnderlinePen underlinePen = new UnderlinePen('~');

        MessageBox messageBox = new MessageBox('*');

        MessageBox smessageBox = new MessageBox('/');

        manager.register(" Strong message",underlinePen);

        manager.register("Waring Box",messageBox);

        manager.register("Slash box",smessageBox);

        Product p1 = manager.create("Strong message");

        p1.use("hello world");

        Product p2 = manager.create("Waring Box");

        p2.use("hello world");

        Product p3 = manager.create("Slash Box");

        p3.use("hello world");
    }
}
