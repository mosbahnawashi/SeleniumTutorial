package interviewQuestionsFollowUp;

public class DirectlyInterviewTest {
	static boolean isPrime(int n) {
		int num = n;
		boolean flag = true;

		if (num < 2) {
			flag = false;
			return flag;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}

		}
		return flag;
	}

	static void testPrime(int n, boolean expected) {
		boolean result = isPrime(n);
		if (result == expected) {
			System.out.printf("test passes for %d, result %b\n", n, result);
		} else {
			System.out.printf("test fails for %d, expected %b : result %b\n", n, expected, result);
		}
	}

	public static void main(String[] args) {
		testPrime(-13, false);
		testPrime(1, false);
		testPrime(2, true);
		testPrime(3, true);
		testPrime(4, false);
		testPrime(17, true);
		testPrime(1337, false); // 7 * 191
		testPrime(13337, true);
	}

}
