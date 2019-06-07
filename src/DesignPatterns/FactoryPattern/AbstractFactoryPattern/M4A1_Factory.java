package DesignPatterns.FactoryPattern.AbstractFactoryPattern;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:42 2019/6/7
 */
public class M4A1_Factory implements Factory{
    @Override
    public Gun produceGun() {
        return new M4A1();
    }

    @Override
    public Bullet produceBullet() {
        return new M4A1_Bullet();
    }
}
