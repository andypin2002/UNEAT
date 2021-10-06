package edai.tema1.ejercicio2;

public class Sorter {
    public static int[] bubbleSort(int[] numbers) {
        int tempInt;
        for(int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < (numbers.length - i); j++) {
                if (numbers[j] > numbers[j + 1]) {
                    tempInt = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tempInt;
                }
            }
        }
        return numbers;
    }
}
