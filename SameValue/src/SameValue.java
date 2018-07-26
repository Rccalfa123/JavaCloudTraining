import java.util.Scanner;

public class SameValue {

	static void sameValue(int[] k, int limit) {
		for (int i = 0; i < k.length; i++) {
			for (int j = i + 1; j < k.length; j++) {
				if (k[i] == k[j] && (j - i) <= limit)
					System.out.println("Such Elements : " + k[i]);

			}
		}

	}

	public static void main(String[] args) {

		int k[] = new int[8], limit;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for (int i = 0; i < 8; i++) {
			k[i] = a.nextInt();
		}
		System.out.println("Enter the Limit : ");
		limit = a.nextInt();
		sameValue(k, limit);
	}
}
