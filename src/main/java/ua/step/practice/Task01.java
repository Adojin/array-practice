package ua.step.practice;
/**
 * Заполнить массив на 15 элементов числами Фибоначчи.
 * Вывести на консоль только четные элементы массива.
 * <p>
 * Пример вывода:
 * 1 2 5 13 34 89 233 610
 */
public class Task01 {
    public static void main(String[] args) {
        int mas[]= new int[15];
        mas [0] = 1;
        mas [1] = 1;
        for (int i = 2; i < mas.length; i++) {
            mas[i] = mas[i - 1] + mas[i - 2];
        }
        for(int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                System.out.print(mas[i] + " ");
            }
        }
    }
}