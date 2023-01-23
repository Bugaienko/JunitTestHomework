package homework20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sergii Bugaienko
 */

public class ArraysUtilTest {
    private List<int[]> arraysList;
    int[] exceptionArray = {1, 2,  3, 5, 6, 7};
    static int[] arr;
    static int[] arrResult;
    static ArraysUtils arraysUtils;


    @BeforeAll
    public static void initList() {
        arr = new int[] {1, 2, 4, 4, 2, 3, 4, 1, 7};
        arrResult = new int[] {1, 7};
        arraysUtils = new ArraysUtils();

        int[] arr1 = {1, 2, 4, 3, 5, 6, 7, 4};
        int[] arr2 = {};
        int[] arr3 = {4, 1, 2, 3, 5};
//        arraysList.add(arr);
//        arraysList.add(arr1);
//        arraysList.add(arr2);
//        arraysList.add(arr3);
    }
        @Test
        public void testAfter4ArrayReturn() {
            Assertions.assertArrayEquals(arrResult, arraysUtils.after4ArrayReturn(arr));
        }


}
