package DesignPatterns.FactoryPattern.SimpleFactoryPattern;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:20 2019/6/7
 */
public class Square implements Shape{

    public Square(){
        System.out.println("Square ");
    }

    @Override
    public void draw() {
        System.out.println("Draw Square ");
    }
}
