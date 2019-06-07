package DesignPatterns.FactoryPattern.FactoryPattern;

import DesignPatterns.FactoryPattern.SimpleFactoryPattern.Shape;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:34 2019/6/7
 */
public class Test {

    public static void main(String[] args) {
        Factory circlefactory = new CircleFactory();
        Shape circle = circlefactory.getShape();
        circle.draw();
    }
}
