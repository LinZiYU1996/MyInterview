package DesignPatterns.BuilderPattern;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 一个具体的产品对象。
 *
 *
 * @Date: Create in 16:47 2019/6/7
 */
public class Meal {

    private String food;

    private String drink;

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
