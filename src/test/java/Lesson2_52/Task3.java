/*
Реализуйте метод void bubbleSort(int[] a),
который сортирует целочисленные элементы в массиве a по возрастанию (первый элемент - минимальный) согласно алгоритму пузырьковой сортировки.
en.wikipedia.org/wiki/Bubble_sort

Используя метод fillArray из первого задания и метод bubbleSort, напишите программу, которая создает массив из 20 целочисленных элементов, выводит элементы в одну строку, разделив пробелами.
Затем, используя метод bubbleSort, сортирует созданный массив
и выводит элементы отсортированного массива в одну строку, разделив пробелами.
 */
package Lesson2_52;

import java.util.Arrays;
import java.util.Random;

import static Lesson2_52.Task3.BubbleSort.bubbleSort;

public class Task3 {
    public static void fillArray(int[] a) {
        // Создаем экземпляр класса Random для генерации случайных чисел
        Random rand = new Random();
        // Заполняем массив случайными числами от -9 до 9
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(19) - 9; // генерируем число в диапазоне от -9 до 9
        }
    }
    public static class BubbleSort {
        public static void bubbleSort(int[] a) {
            int n = a.length;
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (a[j] > a[j+1]) {
                        // меняем элементы местами
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[20];
        fillArray(arr); // заполняем массив случайными числами
        System.out.println("До сортировки: " + Arrays.toString(arr)); // выводим неотсортированный массив
        bubbleSort(arr); // сортируем массив методом пузырьковой сортировки
        System.out.println("После сортировки: " + Arrays.toString(arr)); // выводим отсортированный массив
    }
    }

