package DesignPatterns.BuilderPattern;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:56 2019/6/7
 */
public class Test {

    public static void main(String[] args) {


        MealA a = new MealA();

        KFCWaiter kfcWaiter = new KFCWaiter(a);

        Meal meala = kfcWaiter.construct();

        System.out.println("套餐A的组成部分");

        System.out.println("食物 +" + meala.getFood()
        + meala.getDrink());

    }
}
