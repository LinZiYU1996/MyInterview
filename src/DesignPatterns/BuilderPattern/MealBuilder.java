package DesignPatterns.BuilderPattern;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 创建一个Product对象的各个部件指定的抽象接口。
 *
 *
 * @Date: Create in 16:49 2019/6/7
 */
public abstract class MealBuilder {

    Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal(){
        return meal;
    }
}
