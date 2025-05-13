import java.util.Random;

class NumberGenerator extends Thread {
    private final SharedNumber sharedNumber;
    private final Random random = new Random();

    public NumberGenerator(SharedNumber sharedNumber) {
        this.sharedNumber = sharedNumber;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int randomNumber = random.nextInt(100) + 2; // Generate random number > 1
                System.out.println("Generator Thread: Generated number - " + randomNumber);
                sharedNumber.setNumber(randomNumber);
                Thread.sleep(2000); // Sleep for 2 seconds
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class EvenNumberPrinter extends Thread {
    private final SharedNumber sharedNumber;

    public EvenNumberPrinter(SharedNumber sharedNumber) {
        this.sharedNumber = sharedNumber;
    }

    @Override
    public void run() {
        while (true) {
            int number = sharedNumber.getNumber();
            if (number > 0 && number % 2 == 0) { // Check if number is positive and even
                System.out.print("Even Printer Thread: Even numbers between 1 and " + number + " are: ");
                for (int i = 2; i <= number; i += 2) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            try {
                Thread.sleep(100); // Small delay to avoid busy-waiting if no new number
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break; // Exit the loop if interrupted
            }
            if (number == -1) { // Example termination condition
                break;
            }
        }
    }
}

class OddNumberPrinter extends Thread {
    private final SharedNumber sharedNumber;

    public OddNumberPrinter(SharedNumber sharedNumber) {
        this.sharedNumber = sharedNumber;
    }

    @Override
    public void run() {
        while (true) {
            int number = sharedNumber.getNumber();
            if (number > 0 && number % 2 != 0) { // Check if number is positive and odd
                System.out.print("Odd Printer Thread: Odd numbers between 1 and " + number + " are: ");
                for (int i = 1; i <= number; i += 2) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            try {
                Thread.sleep(100); // Small delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break; // Exit the loop if interrupted
            }
            if (number == -1) { // Example termination condition
                break;
            }
        }
    }
}

class SharedNumber {
    private volatile int number;

    public synchronized void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

public class ThreeThread {
    public static void main(String[] args) {
        SharedNumber sharedNumber = new SharedNumber();

        NumberGenerator generatorThread = new NumberGenerator(sharedNumber);
        EvenNumberPrinter evenPrinterThread = new EvenNumberPrinter(sharedNumber);
        OddNumberPrinter oddPrinterThread = new OddNumberPrinter(sharedNumber);

        generatorThread.start();
        evenPrinterThread.start();
        oddPrinterThread.start();

        // You might want to add logic here to eventually stop the threads
        // For example, after a certain number of generated numbers.
        // For now, they will run until the program is manually stopped.
    }
}
