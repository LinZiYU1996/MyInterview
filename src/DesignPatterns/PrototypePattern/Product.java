package DesignPatterns.PrototypePattern;


/*
*
 * @Author Mr.Lin
 * @Description
 * Product接口是复制功能接口，该接口继承了java.lang.Cloneable(只有实现了该接口的类的实例才可以调用clone()方法复制实例,否则会抛出异常).

 * @Date 17:12 2019/6/7
 **/
public interface Product extends Cloneable{
    //use方法是用于“使用”的方法，具体怎么“使用”，则被交给子类去实现。

    public abstract void use(String s);
    //creatClone方法是用于复制实例的方法

    public abstract Product createClone();
}
