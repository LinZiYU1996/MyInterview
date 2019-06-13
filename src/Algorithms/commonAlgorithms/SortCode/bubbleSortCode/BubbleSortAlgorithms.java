package Algorithms.commonAlgorithms.SortCode.bubbleSortCode;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 冒泡排序
 *
 *
 * @Date: Create in 17:38 2019/6/13
 */
public class BubbleSortAlgorithms {


    public static void bubbleSort(int[] array) {

            for (int i = 0 ; i < array.length ; i++) {

                for (int j = 0 ; j < array.length - 1 - i ; j++) {

                    if (array[j] > array[j+1]) {

                        int temp = array[j];

                        array[j] = array[j+1];

                        array[j+1] = temp;

                    }

                }
            }


    }
}
