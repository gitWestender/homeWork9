import java.util.concurrent.ThreadLocalRandom;

public class Main {

    static int counter = 1;

    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray(int lenght) {
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            // подсмотрел в доп заданиях про TLRnd, что лучше использовать его
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

    static void task1() {
        System.out.printf("\nЗадание %d:", counter++);

        int[] book = generateRandomArray(30);

        System.out.printf("\nСумма трат за месяц составила %d рублей\n", sumOfArray(book));
    }
}