package Algorithms.commonAlgorithms.SortCode.shellSortCode;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 希尔排序
 *
 *
 * @Date: Create in 17:04 2019/6/13
 */
public class ShellSortAlgorithms {


    public static void shellSort(int[] array){

        int len = array.length;

        for (int gap = len/2 ; gap > 0 ; gap /= 2) {

            for ( int i = gap ; i < len ; i++) {

                int temp = array[i];

                int j;

                for ( j = i ; j >= gap && array[j-gap] > temp; j-=gap) {

                    array[j] = array[j-gap];

                }

                array[j] = temp;

            }
        }


    }
}
