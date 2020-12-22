package alevel.lesson4.homework;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sort(inputArray(), questionIncOrDec())));

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

    public static String questionIncOrDec() {

        String incOrDec;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Отсортировать по возрастанию или убыванию?\nВвведите \"increase\" или \"decrease\"):");

        while (true) {
            incOrDec = scanner.nextLine();
            if (Objects.equals(incOrDec, "increase") || Objects.equals(incOrDec, "decrease"))
                break;
            else System.out.println("Некорректное значение! Повторите ввод: ");
        }

        return incOrDec;
    }

    public static double[] sort(double[] array, String sortDirection) {

        double sort;
        if (Objects.equals(sortDirection, "increase")) {
            for (int j = 0; j < 9; j++) {
                for (int i = 0; i < 9; i++) {
                    if (array[i] > array[i + 1]) {
                        sort = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = sort;
                    }
                }
            }
        } else {
            for (int j = 0; j < 9; j++) {
                for (int i = 0; i < 9; i++) {
                    if (array[i] < array[i + 1]) {
                        sort = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = sort;
                    }

                }
            }

        }

        return array;
    }
}
