package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

/**
 * Задание: Заполнить массив на 30 элементов случайными числами
 * от -70 до +50.
 * Найти минимальный элемент и максимальный элементы и вывести их на консоль через пробел
 */
public class Task02 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - необходимо для тестирования @see ua.step.homework.TaskTest02
        long seed = 0;// args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);
        int mas1[]= new int[30];
        int min, max;
        // TODO: Пишите код здесь
        for (int i = 0; i < 30; i++) {
            mas1[i] = rnd.nextInt(51+70) - 70;
        }
        min = mas1[0];
        max = mas1[0];
        for (int i = 0; i < 30; i++) {
            if(min > mas1[i]) {
                min = mas1[i];
            }
            if (max < mas1[i]) {
                max = mas1[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
