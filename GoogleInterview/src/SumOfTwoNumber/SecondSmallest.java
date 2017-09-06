package SumOfTwoNumber;

public class SecondSmallest {

	public static int secondSmall(int[] arr) {
		int firstSmall = Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= firstSmall) {
				secondSmall = firstSmall;
				firstSmall = arr[i];
			} else if (arr[i] < secondSmall)
				secondSmall = arr[i];
		}
		return secondSmall;
	}

	public static void main(String[] args) {
		int arr[] = { 8, 4, 2, 0, 5, 1 };
		System.out.println(secondSmall(arr));
	}

}
