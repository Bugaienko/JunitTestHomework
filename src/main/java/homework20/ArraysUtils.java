package homework20;

import java.util.Arrays;

/**
 * @author Sergii Bugaienko
 */

public class ArraysUtils {
    public int[] after4ArrayReturn(int[] array) {
        if (array.length == 0) {
            return new int[0];
        }
        int cursor = -1;
        for (int i = array.length - 1; i >= 0 ; i--) {
            if (array[i] == 4) {
                cursor = i;
                break;
            }
        }
        System.out.println(cursor + " cursor");
        if (cursor == -1) {
            throw new RuntimeException();
        }
        if (cursor == array.length - 1) {
            return new int[0];
        }
        int[] result = Arrays.copyOfRange(array, cursor + 1, array.length);

        return result;

    }
}
