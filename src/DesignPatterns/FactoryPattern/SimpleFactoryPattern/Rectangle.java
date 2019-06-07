package DesignPatterns.FactoryPattern.SimpleFactoryPattern;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:20 2019/6/7
 */
public class Rectangle implements Shape{


    public Rectangle(){
        System.out.println("Rectangle ");
    }

    @Override
    public void draw() {
        System.out.println(" Draw Rectangle ");
    }
}
