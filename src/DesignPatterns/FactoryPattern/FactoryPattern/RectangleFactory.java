package DesignPatterns.FactoryPattern.FactoryPattern;

import DesignPatterns.FactoryPattern.SimpleFactoryPattern.Rectangle;
import DesignPatterns.FactoryPattern.SimpleFactoryPattern.Shape;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:33 2019/6/7
 */
public class RectangleFactory implements Factory{
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
