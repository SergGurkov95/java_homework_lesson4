package alevel.lesson4.homework;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        System.out.println(minimumOrMaximumValue(inputArray(), questionMinOrMax()));

    }

    public static double[] inputArray() {

        double[] input = new double[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите последовательность из 10 чисел: ");

        for (int i = 0; i < 10; i++) {

            input[i] = scanner.nextDouble();

        }

        return input;
    }

    public static String questionMinOrMax() {

        String minOrMax;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Найти минимальное или максимально значение последовательности?\nВвведите \"min\" или \"max\"):");

        while (true) {
            minOrMax = scanner.nextLine();
            if (Objects.equals(minOrMax, "min") || Objects.equals(minOrMax, "max"))
                break;
            else System.out.println("Некорректное значение! Повторите ввод: ");
        }

        return minOrMax;
    }

    public static double minimumOrMaximumValue(double[] array, String countDirection) {

        double answer = array[0];

        if (Objects.equals(countDirection, "min")) {
            for (int i = 1; i < 10; i++) {
                if (answer > array[i])
                    answer = array[i];
            }
        } else {
            for (int i = 1; i < 10; i++) {
                if (answer < array[i])
                    answer = array[i];
            }
        }

        return answer;
    }
}
