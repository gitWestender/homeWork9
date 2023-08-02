import java.util.concurrent.ThreadLocalRandom;

public class Main {

    static int counter = 1;

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static int[] generateRandomArray(int lenght) {
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            // подсмотрел в доп заданиях про ThreadLocalRandom, что лучше использовать его
            array[i] = ThreadLocalRandom.current().nextInt(100_000, 200_000 + 1);

        }
        return array;
    }

    public static int sumOfArray(int[] array) {
        int result = 0;

        for (int i : array) {
            result += i;
        }

        return result;
    }

    public static double averageOfArray(int[] array, int daysPerMounth) {
        double result = 0.0;
        return result = (double)sumOfArray(array) / daysPerMounth;
    }

    static void task1() {
        System.out.printf("\nЗадание %d:", counter++);

        int[] book = generateRandomArray(30);

        System.out.printf("\nСумма трат за месяц составила %d рублей\n", sumOfArray(book));
    }

    static void task2() {
        System.out.printf("\nЗадание %d:", counter++);

        int[] book = generateRandomArray(30);
        int minCost = Integer.MAX_VALUE;
        int maxCost = Integer.MIN_VALUE;

        for (int i = 0; i < book.length; i++) {
            if (book[i] > maxCost) maxCost = book[i];
            if (book[i] < minCost) minCost = book[i];
        }

        System.out.printf("\nМинимальная сумма трат за день составила %d рублей."
                + "Максимальная сумма трат за день составила %d рублей\n", minCost, maxCost);
    }

    static void task3() {
        System.out.printf("\nЗадание %d:", counter++);

        int[] book = generateRandomArray(30);

        System.out.printf("\nСредняя сумма трат за месяц составила %f рублей\n", averageOfArray(book, 30));
    }
}