import java.util.Scanner;

class StringReverse {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String n = a.nextLine(); // input Sentence
		System.out.println("Entered a Sentence : " + n);
		String A[] = n.split(" ");// Split Sentence by spaces into Arrays of Strings

		for (int i = 0; i < A.length; i++) {
			StringBuilder str = new StringBuilder(A[i]); // Convert immutable strings into mutable
			System.out.print(str.reverse() + " ");// Reverse Strings
		}
	}
}