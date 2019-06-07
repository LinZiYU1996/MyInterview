package DesignPatterns.FactoryPattern.SimpleFactoryPattern;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:24 2019/6/7
 */
public class Test {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("CIRCLE");

        circle.draw();

        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw();



    }
}
