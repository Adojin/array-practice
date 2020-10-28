package ua.step.practice;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;

/**
 * Задание: Заполнить массив на 10 элементов случайными числами
 * от -5 до +5. Посчитать количество повторяющихся значений.
 * Вывести на консоль только повторяющиеся элементы (больше одного повторения)
 * и количество повторений.
 * <p>
 * Пример:
 * 0 – 5 раз
 * 2 – 3 раза
 * 7 – 2 раза
 */
public class Task05 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest05
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);
        // TODO: Пишите код здесь
        int[] arr = new int[10];
            final int MAX = 5;
            final int MIN = -5;
            for(int i = 0; i < arr.length; i++) {
                arr[i] = rnd.nextInt(MAX - MIN + 1) + MIN;
            }
            Arrays.sort(arr);
            int[] count = new int[MAX - MIN + 1];
            for(int i = 0; i < arr.length; i++){
            if(count[i] > 1){
                System.out.printf("%d - %d", i + MIN, count[i]);
                switch (count[i]){
                    case 2:
                    case 3:
                    case 4:
                        System.out.println("раза");
                        break;
                        default:
                            System.out.println("раз");
                            break;
                }
            }
        }

    }
}
