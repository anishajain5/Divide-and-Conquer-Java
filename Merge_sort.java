package lecture_14;

public class Merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 7, 2, 3, 6, 9, 1 };

		int[] sorted = mergesort(arr, 0, arr.length - 1);

		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}

	}

	public static int[] mergesort(int[] arr, int si, int ei) {
		if (si == ei) {
			int[] br = new int[1];
			br[0] = arr[si];
			return br;
		}

		int mid = (ei + si) / 2;
		int[] one = mergesort(arr, si, mid);
		int[] two = mergesort(arr, mid + 1, ei);

		int[] sorted = merge(one, two);
		return sorted;
	}

	public static int[] merge(int[] one, int[] two) {
		int[] sorted = new int[one.length + two.length];
		int i = 0, j = 0, k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				sorted[k] = one[i];
				i++;
				k++;
			} else {
				sorted[k] = two[j];
				k++;
				j++;
			}
		}
		while (i < one.length) {
			sorted[k] = one[i];
			i++;
			k++;
		}
		while (j < two.length) {
			sorted[k] = two[j];
			j++;
			k++;
		}
		return sorted;
	}

}
