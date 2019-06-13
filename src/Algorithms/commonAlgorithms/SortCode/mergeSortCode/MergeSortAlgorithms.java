package Algorithms.commonAlgorithms.SortCode.mergeSortCode;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 归并排序
 *
 *
 * @Date: Create in 20:21 2019/6/13
 */
public class MergeSortAlgorithms {


    public static void mergeSort(int[] A,int low,int high){

        int mid = (low + high) / 2 ;

        if ( low < high) {

            mergeSort(A,low,mid);

            mergeSort(A,mid+1,high);

            //左右归并
            merge(A,low,mid,high);

        }
    }


    public static void merge(int[] A,int low,int mid,int high){

        int[] temp = new int[high - low + 1];

        int i = low;

        int j = mid + 1;

        int k = 0;


        // 把较小的数先移到新数组中
        while (i <= mid && j <=high) {

            if (A[i] < A[j]) {

                temp[k++] = A[i++];

            } else {

                temp[k++] = A[j++];
            }

        }

        // 把左边剩余的数移入数组
        while ( i<=mid) {

            temp[k++] = A[i++];

        }

        // 把右边边剩余的数移入数组
        while ( j <= high) {

            temp[k++] = A[j++];

        }

        // 把新数组中的数覆盖nums数组
        for(int x = 0 ; x < temp.length ; x++){

            A[x + low] = temp[x];
        }

    }




}
