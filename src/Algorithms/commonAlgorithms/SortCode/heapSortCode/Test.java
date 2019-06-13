package Algorithms.commonAlgorithms.SortCode.heapSortCode;

import java.util.Arrays;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:24 2019/6/13
 */
public class Test {

    public static void main(String[] args) {


        int[] a = {

               100, 1,2,3,4,5,6,7

        };

        HeapSortAlgorithms.HeapSort(a);

        System.out.println(Arrays.toString(a));

    }
}
