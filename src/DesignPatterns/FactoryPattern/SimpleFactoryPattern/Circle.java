package DesignPatterns.FactoryPattern.SimpleFactoryPattern;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:18 2019/6/7
 */
public class Circle implements Shape{


    public Circle(){
        System.out.println("CirCle");
    }


    @Override
    public void draw() {
        System.out.println(" Draw CirCle");
    }
}
