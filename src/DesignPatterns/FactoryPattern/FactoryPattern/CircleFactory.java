package DesignPatterns.FactoryPattern.FactoryPattern;

import DesignPatterns.FactoryPattern.SimpleFactoryPattern.Circle;
import DesignPatterns.FactoryPattern.SimpleFactoryPattern.Shape;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:32 2019/6/7
 */
public class CircleFactory implements Factory{


    @Override
    public Shape getShape() {
        return new Circle();
    }
}
