class MultiCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 100; // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
        }
    }
}
