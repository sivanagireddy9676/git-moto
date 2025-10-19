public class code {
	// Simple utility methods to demonstrate unit tests.
	public static int add(int a, int b) {
		return a + b;
	}

	public static String reverse(String s) {
		if (s == null) return null;
		return new StringBuilder(s).reverse().toString();
	}

	public static boolean isPalindrome(String s) {
		if (s == null) return false;
		return s.equals(reverse(s));
	}

	public static void main(String[] args) {
		System.out.println("code class available");
	}
}
