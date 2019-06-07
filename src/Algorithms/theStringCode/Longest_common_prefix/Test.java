package Algorithms.theStringCode.Longest_common_prefix;

import java.util.Arrays;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:18 2019/6/7
 */
public class Test {


    public static void main(String[] args) {
        String[] strings = {"flkdkdk","fdkdjjwhhfh","fjjwjejj"};

        Arrays.sort(strings);

        for (int i = 0; i < strings.length ; i++) {
            System.out.println(strings[i]);
        }
    }
}
