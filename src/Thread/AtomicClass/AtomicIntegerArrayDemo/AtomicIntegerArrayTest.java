package Thread.AtomicClass.AtomicIntegerArrayDemo;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:04 2019/6/15
 */
public class AtomicIntegerArrayTest {

    public static void main(String[] args) {

        int temvalue = 0;

        int[] nums = {1,2,3,4,5,6};

        AtomicIntegerArray integerArray = new AtomicIntegerArray(nums);

        for (int i = 0; i < nums.length ; i++) {

            System.out.println( integerArray.get(i));

        }

        temvalue = integerArray.getAndSet(0, 2);

        System.out.println("temvalue:" + temvalue + ";  i:" + integerArray);

        temvalue = integerArray.getAndIncrement(0);

        System.out.println("temvalue:" + temvalue + ";  i:" + integerArray);

        temvalue = integerArray.getAndAdd(0, 5);

        System.out.println("temvalue:" + temvalue + ";  i:" + integerArray);

    }
}
