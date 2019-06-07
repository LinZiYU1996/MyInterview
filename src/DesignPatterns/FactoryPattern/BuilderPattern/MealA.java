package DesignPatterns.FactoryPattern.BuilderPattern;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:53 2019/6/7
 */
public class MealA extends MealBuilder{


    @Override
    public void buildFood() {
        meal.setFood("薯条");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
    }
}
