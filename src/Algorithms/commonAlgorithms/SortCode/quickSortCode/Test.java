package Algorithms.commonAlgorithms.SortCode.quickSortCode;

import java.util.Arrays;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:39 2019/6/12
 */
public class Test {

    public static void main(String[] args) {

        int[] data = {
                1,22,3,42,0,123,23
        };

        QuickSortAlgorithms.quickSort(data,0,data.length-1);

        System.out.println(Arrays.toString(data));


    }
}
