package Algorithms.commonAlgorithms.SortCode.bubbleSortCode;

import java.util.Arrays;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:41 2019/6/13
 */
public class Test {

    public static void main(String[] args) {

        int[] array = {
                100,0,1,22,34,78,-1
        };

        BubbleSortAlgorithms.bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }
}
