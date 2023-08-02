import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] generateRandomArray(int lenght) {
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            // подсмотрел в доп заданиях про TLRnd, что лучше использовать его
            array[i] = ThreadLocalRandom.current().nextInt(100_000, 200_000+1);

        }
        return array;
    }

}