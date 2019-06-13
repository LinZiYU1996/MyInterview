package Algorithms.commonAlgorithms.SortCode.binarySortCode;

import java.util.Arrays;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:23 2019/6/13
 */
public class Test {


    public static void main(String[] args) {
            int[] array = {
              100,0,1,22,34,78,-1
            };

            BinarySortAlgorithms.binarySort(array);

        System.out.println(Arrays.toString(array));
    }
}
