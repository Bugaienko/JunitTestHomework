package homework20;

import java.util.Arrays;

/**
 * @author Sergii Bugaienko
 */

public class MainHomework20 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] array2 = {};

        ArraysUtils arraysUtils = new ArraysUtils();
        int[] newInts = arraysUtils.after4ArrayReturn(array);
        System.out.println(Arrays.toString(newInts));
    }
}
