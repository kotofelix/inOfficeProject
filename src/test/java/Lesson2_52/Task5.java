/*
Напишите программу, которая создает зубчатый массив целочисленных элементов, сгенеренных случайным образов в диапазоне -9 до 9.
Массив должен содержать не более 5 строк и каждая строка иметь не более 7 столбцов.
Выведите массив на экран в порядке убывания сумм элементов строк.
 */
package Lesson2_52;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
    int[][] arr = new int[5][];
    Random rand = new Random();

    // заполнение массива случайными значениями в диапазоне [-9, 9]
    for (int i = 0; i < arr.length; i++) {
        arr[i] = new int[rand.nextInt(7) + 1]; // случайное количество столбцов от 1 до 7
        for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = rand.nextInt(19) - 9; // случайное значение от -9 до 9
        }
    }

    // вывод массива на экран
    System.out.println("Исходный массив:");
    for (int i = 0; i < arr.length; i++) {
        System.out.println(Arrays.toString(arr[i]) + " сумма: " + getRowSum(arr[i]));
    }

    // сортировка массива по суммам строк в порядке убывания
    Arrays.sort(arr, (a, b) -> Integer.compare(getRowSum(b), getRowSum(a)));

    // вывод отсортированного массива на экран
    System.out.println("Массив в порядке убывания сумм элементов строк:");
    for (int i = 0; i < arr.length; i++) {
        System.out.println(Arrays.toString(arr[i]) + " сумма: " + getRowSum(arr[i]));
    }
}

    // функция для получения суммы элементов в строке массива
    private static int getRowSum(int[] row) {
        int sum = 0;
        for (int i = 0; i < row.length; i++) {
            sum += row[i];
        }
        return sum;
    }
}