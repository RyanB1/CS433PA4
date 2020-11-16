

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicProgramming {

	public static int numberOfBinaryStringsWithNoConsecutiveOnes(int n) { // complete this method
		int a[] = new int [n], b[] = new int [n];
		a[0] = b[0] = 1;

		for (int i = 1; i < n; i++) {
			a[i] = a[i-1] + b[i-1];
			b[i] = a[i-1];
		}

		return a[n-1] + b[n-1];
	}

	public static ArrayList<Integer> longestIncreasingSubsequence(int[] arr, int len) { // complete this method
		int[] LIS = new int[-1], PRED = new int[-1];
		int maxIndex;
		for (int i = 0; i < len -1; i++) {
			LIS[i] = 1;
			PRED[i] = -1;
			// something here...
		}

		int lisIndex = -1;
		for (int i : LIS) {
			if (lisIndex < i || lisIndex == -1) {
				lisIndex = i;
			}
		}

		ArrayList<Integer> solution = new ArrayList<>();
		// Starting from the lisIndex and by using the PRED array, add the values in the longest increasing subsequence to the dynamic array.
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
