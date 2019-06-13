package Algorithms.commonAlgorithms.SortCode.mergeSortCode;

import java.util.Arrays;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:22 2019/6/13
 */
public class Test {

    public static void main(String[] args) {


        int[] a = {

                10,9,8,7,6,5,4,3,2,1
        };

        MergeSortAlgorithms.mergeSort(a,0,a.length-1);

        System.out.println(Arrays.toString(a));
    }
}
