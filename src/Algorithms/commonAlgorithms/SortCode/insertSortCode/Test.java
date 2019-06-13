package Algorithms.commonAlgorithms.SortCode.insertSortCode;

import java.util.Arrays;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:40 2019/6/13
 */
public class Test {


    public static void main(String[] args) {


        int[] arr = {
                10,9,8,7,6,5,4,3,2,1
        };

        InsertSortAlgorithms.insertSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
