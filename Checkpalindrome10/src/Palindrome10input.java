import java.util.Arrays;
import java.util.Scanner;

class StringReverse {

	static String sortString(String inputString) // Sorting String
	{
		char temp[] = inputString.toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}

	public static void main(String args[]) {
		Scanner a = new Scanner(System.in); // Scanner for input
		String myString[] = new String[10];
		String k[] = new String[10];
		System.out.println("Enter 10 inputs : ");// input
		for (int i = 0; i < 10; i++) {
			myString[i] = a.nextLine();
		}

		for (int i = 0; i < myString.length; i++) {
			StringBuilder str = new StringBuilder(myString[i]); // Convert immutable strings into mutable using
																// stringBuilder for Reverse
			k[i] = str.reverse().toString();// Reverse and storing in String Array
			if (k[i].equals(myString[i]))// Comparing Strings
			{
				System.out.print(myString[i] + " CharCount = " + myString[i].length()); // Display palindrome Strings
																						// and char count
				StringBuilder strnew = new StringBuilder(new String(sortString(myString[i]))); // Sorting in ascending
																								// order and converting
																								// into mutable for
																								// reverse
				System.out.println(new String("   Sort : " + strnew.reverse()));
			}
		}

	}
}