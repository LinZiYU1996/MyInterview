package DesignPatterns.FactoryPattern.FactoryPattern;

import DesignPatterns.FactoryPattern.SimpleFactoryPattern.Shape;
import DesignPatterns.FactoryPattern.SimpleFactoryPattern.Square;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:33 2019/6/7
 */
public class SquareFactory implements Factory{


    @Override
    public Shape getShape() {
        return new Square();
    }
}
