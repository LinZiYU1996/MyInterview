package DesignPatterns.FactoryPattern.BuilderPattern;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 构建一个使用Builder接口的对象。它主要是用于创建一个复杂的对象，它主要有两个作用，一是：隔离了客户与对象的生产过程，二是：负责控制产品对象的生产过程。
 *
 *
 * @Date: Create in 16:54 2019/6/7
 */
public class KFCWaiter {

    private MealBuilder mealBuilder;

    public KFCWaiter(MealBuilder mealBuilder){
        this.mealBuilder = mealBuilder;
    }

    public Meal construct(){

        mealBuilder.buildFood();

        mealBuilder.buildDrink();;

        return mealBuilder.getMeal();


    }
}
