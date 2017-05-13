package problems.java;

public class ExceptionPractice {

    private static final BadFile badFile = new BadFile();

    public static void main(String[] args) {
        try {
            getMethod();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private static void recursionToInfinity() {
        recursionToInfinity();
    }

    private static void asserter(int i) {
        assert i == 0;
    }

    private static void getMethod() throws Throwable {
        Throwable suppressedException = null;
        try {
            return;
        } catch (RuntimeException e) {
            suppressedException = new RuntimeException("wrapper", e);
        } finally {
            try {
                badFile.close();
                if (suppressedException != null) {
                    throw suppressedException;
                }
            } catch (RuntimeException e) {
                e.addSuppressed(suppressedException);
                throw e;
            }
        }
    }
}
