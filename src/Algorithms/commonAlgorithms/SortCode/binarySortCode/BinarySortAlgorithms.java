package Algorithms.commonAlgorithms.SortCode.binarySortCode;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 *
 * 二分排序
 *
 *
 * @Date: Create in 16:22 2019/6/13
 */
public class BinarySortAlgorithms {


    public static void binarySort(int[] array){

        for (int i = 0; i < array.length ; i++) {

            int temp = array[i];

            int left = 0;

            int right = i - 1;

            int middle = 0;

            while ( left <= right) {

                middle = ( left + right) / 2;

                if ( temp < array[middle]) {

                    right = middle - 1;

                }

                if ( temp > array[middle]) {

                    left = middle + 1;

                }

            }

            for( int j = i -1; j >= left; j--){

                array[j+1] = array[j];
            }

            if ( left != i) {

                array[left] = temp;

            }

        }

    }
}
