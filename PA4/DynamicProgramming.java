

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicProgramming {

    public static int numberOfBinaryStringsWithNoConsecutiveOnes(int n) { // complete this method
        int a = 1, b = 1;

        for (int i = 1; i < n; i++) {
            int tmp = a;
            a = a + b;
            b = tmp;
        }

        return a + b;
    }

    public static ArrayList<Integer> longestIncreasingSubsequence(int[] arr, int len) { // complete this method
        int lis[] = new int[len], pred[] = new int[len];
        for (int i = 0; i < len; i++) {
            lis[i] = 1;
            pred[i] = i;
        }

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    if (lis[j] + 1 > lis[i]) {
                        lis[i] = lis[j] + 1;
                        pred[i] = j;
                    }
                }
            }
        }

        int maxIndex = 0;
        for (int i = 0; i < len; i++) {
            if (lis[i] > lis[maxIndex]) {
                maxIndex = i;
            }
        }

        ArrayList<Integer> solution = new ArrayList<>();
        int tmp = maxIndex;
        solution.add(arr[tmp]);
        int tmp2 = pred[tmp];

        while (tmp != tmp2) {
            tmp = tmp2;
            solution.add(arr[tmp]);
            tmp2 = pred[tmp];
        }

        reverse(solution);
        return solution;
    }

    private static void reverse(ArrayList<Integer> list) {
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            int temp = list.get(j);
            list.set(j, list.get(i));
            list.set(i, temp);
        }
    }
}
