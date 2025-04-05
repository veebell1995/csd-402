public class overloadedmethods {

    // Method to calculate the average of an array of shorts
    public static short average(short[] array) {
        short sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method to calculate the average of an array of ints
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the average of an array of longs
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the average of an array of doubles
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Test the methods with arrays of different sizes
        short[] shortArray = {1, 2, 3};
        int[] intArray = {1, 2, 3, 4, 5};
        long[] longArray = {1, 2, 3, 4, 5, 6, 7};
        double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};

        System.out.println("Short Array:");
        printArray(shortArray);
        System.out.println("Average: " + average(shortArray));

        System.out.println("\nInt Array:");
        printArray(intArray);
        System.out.println("Average: " + average(intArray));

        System.out.println("\nLong Array:");
        printArray(longArray);
        System.out.println("Average: " + average(longArray));

        System.out.println("\nDouble Array:");
        printArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }

    // Helper method to print the elements of an array
    public static void printArray(short[] array) {
        for (short num : array) {
            System.out.print(num + " ");
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void printArray(long[] array) {
        for (long num : array) {
            System.out.print(num + " ");
        }
    }

    public static void printArray(double[] array) {
        for (double num : array) {
            System.out.print(num + " ");
        }
    }
}
