package DesignPatterns.PrototypePattern;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:18 2019/6/7
 */
public class UnderlinePen implements Product{


    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int len = s.getBytes().length;
        for (int i = 0; i < len + 2 ; i++) {
            System.out.println(ulchar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {

        Product product  = null;

        try {
            product =(Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return product;
    }
}
