package DesignPatterns.FactoryPattern.SimpleFactoryPattern;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:21 2019/6/7
 */
public class ShapeFactory {


    //这样的实现有个问题，如果我们新增产品类的话，就需要修改工厂类中的getShape（）方法，这很明显不符合 开放-封闭原则 。
    public static Shape getShape(String shapeType){
        if (shapeType == null) {
            return  null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;

    }



}
