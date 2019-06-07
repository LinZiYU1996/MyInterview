package DesignPatterns.PrototypePattern;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 装饰方框样式的具体原型，实现了Product接口，实现复制现有实例并生成新实例的方法。
 *
 *
 * @Date: Create in 17:15 2019/6/7
 */
public class MessageBox implements Product{

    //保存的是装饰方框使用的字符样式

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int len = s.getBytes().length;

        for (int i = 0; i < len + 4; i++) {
            System.out.println(decochar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {

        Product product = null;

        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return product;
    }
}
