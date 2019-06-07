package Algorithms.theStringCode.ReplaceSpace;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:07 2019/6/7
 */
public class Test1 {


    public static String replace(String str){

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) != ' ') {
                stringBuffer.append(str.charAt(i));
            } else {
                stringBuffer.append("%20");
            }
        }

        return stringBuffer.toString();


    }

    public static void main(String[] args) {
        System.out.println(replace("We     Are H   appy"));
    }




}
