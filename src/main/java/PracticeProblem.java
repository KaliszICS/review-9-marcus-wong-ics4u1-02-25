public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(lettersToFive("Water", 'r'));
		System.out.println(countLetter("Jewlery", 'e'));
		System.out.println(oddSum(101, 100));

	}
	public static int lettersToFive(String word, char c) {
		int count = 0;
		int letter = 0;
		

		while (letter < word.length()) {
			if (word.charAt(letter) == c) {
				count++;
				if (count == 5) {
					return letter + 1;

				}
			}
			letter++;


			

		}
		return -1;
	}
	public static int countLetter(String word2, char c2) {
		int count2 = 0;
		for (int i = 0; i < word2.length(); i++) {
			if (word2.charAt(i) == c2) {
				count2++;
			}
			

		}
		return count2;


	}
	public static int oddSum(int num, int num2) {
		int sum = 0;
		int smallestNum = Math.min(num, num2);
		int largestNum = Math.max(num, num2);

		for (int i = smallestNum; i <= largestNum; i++) {
			if (i % 2 != 0) {
				sum += i;

			}
		}
		return sum;

	}

}
