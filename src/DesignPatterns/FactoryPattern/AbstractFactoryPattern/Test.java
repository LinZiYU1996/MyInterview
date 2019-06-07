package DesignPatterns.FactoryPattern.AbstractFactoryPattern;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:43 2019/6/7
 */
public class Test {

    public static void main(String[] args) {

        Factory factory;

        Gun gun;

        Bullet bullet;

        factory = new AK_Factory();

        bullet = factory.produceBullet();

        bullet.load();

        gun = factory.produceGun();

        gun.shooting();



    }
}
