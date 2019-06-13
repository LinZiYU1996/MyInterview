package Algorithms.commonAlgorithms.SortCode.insertSortCode;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 *
 * 插入排序
 *
 *
 * @Date: Create in 16:40 2019/6/13
 */
public class InsertSortAlgorithms {

    public static void insertSort(int[] array){

        int i , j;

        int n = array.length;

        int target;

        for ( i = 1; i < n ; i++) {

            j = i;

            target = array[i];

            while ( j > 0 && target<array[j-1]) {

                array[j] = array[j-1];

                j--;
            }

            array[j] = target;

        }


    }


}
