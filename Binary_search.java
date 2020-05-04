package lecture_14;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 7, 2, 3, 6, 9, 1 };
		System.out.println(binary_search(arr, 6));

	}

	public static int binary_search(int[] arr, int key) {
		int si = 0, ei = arr.length - 1;
		while (si <= ei) {
			int mid = (si + ei) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				si = mid + 1;
			} else {
				ei = mid - 1;
			}
		}
		return -1;
	}

}
