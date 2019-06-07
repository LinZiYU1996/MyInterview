package DesignPatterns.FactoryPattern.AbstractFactoryPattern;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:41 2019/6/7
 */
public class AK_Factory implements Factory{
    @Override
    public Gun produceGun() {
        return new AK();
    }

    @Override
    public Bullet produceBullet() {
        return new AK_Bullet();
    }
}
