public class CodeTest {
    private static int testsRun = 0;
    private static int testsFailed = 0;

    public static void main(String[] args) {
        testAdd();
        testReverse();
        testIsPalindrome();

        System.out.println();
        System.out.printf("Tests run: %d, Failures: %d\n", testsRun, testsFailed);
        if (testsFailed > 0) System.exit(1);
    }

    private static void assertEquals(Object expected, Object actual, String name) {
        testsRun++;
        if (expected == null) {
            if (actual != null) {
                System.out.printf("FAIL %s: expected null but was %s\n", name, actual);
                testsFailed++;
            }
        } else if (!expected.equals(actual)) {
            System.out.printf("FAIL %s: expected %s but was %s\n", name, expected, actual);
            testsFailed++;
        } else {
            System.out.printf("OK   %s\n", name);
        }
    }

    private static void assertTrue(boolean cond, String name) {
        testsRun++;
        if (!cond) {
            System.out.printf("FAIL %s: expected true but was false\n", name);
            testsFailed++;
        } else {
            System.out.printf("OK   %s\n", name);
        }
    }

    // Tests
    private static void testAdd() {
        assertEquals(5, code.add(2, 3), "add(2,3)");
        assertEquals(-1, code.add(2, -3), "add(2,-3)");
    }

    private static void testReverse() {
        assertEquals("cba", code.reverse("abc"), "reverse abc");
        assertEquals(null, code.reverse(null), "reverse null");
    }

    private static void testIsPalindrome() {
        assertTrue(code.isPalindrome("level"), "isPalindrome level");
        assertTrue(!code.isPalindrome("hello"), "isPalindrome hello");
        assertTrue(!code.isPalindrome(null), "isPalindrome null");
    }
}
