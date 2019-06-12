package Algorithms.commonAlgorithms.SortCode;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 快速排序
 *
 * @Date: Create in 22:31 2019/6/12
 */
public class QuickSortAlgorithms {


    public static void quickSort(int[] array,int left,int right){


        //只有一个元素，直接返回
            if (left >= right) {
                return;
            }

            int key = array[left];

            int i = left;

            int j = right;

            while ( i < j ) {

                //j向左移，直到遇到比key小的值
                while ( array[j] >= key && i < j) {
                    j--;
                }

                //i向右移，直到遇到比key大的值
                while ( array[i] <= key && i < j) {
                    i++;
                }

                if ( i < j) {
                    int temp = array[i];

                    array[i] = array[j];

                    array[j] = temp;
                }

            }

            array[left] = array[i];

            array[i] = key;

            quickSort(array,left,i-1);

            quickSort(array,i+1,right);

    }



}
