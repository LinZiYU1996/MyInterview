package DesignPatterns.BuilderPattern;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:54 2019/6/7
 */
public class MealB extends MealBuilder{
    @Override
    public void buildFood() {
        meal.setDrink("果汁");
    }

    @Override
    public void buildDrink() {
        meal.setFood("鸡翅");
    }
}
