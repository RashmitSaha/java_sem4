class ThrowKeyword {
    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not valid age");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        }
        System.out.println("Program continues...");
    }
}
