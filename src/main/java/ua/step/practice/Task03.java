package ua.step.practice;
import java.text.BreakIterator;
import java.util.Scanner;
/**
 * Задание: Написать программу, которая проверяет, все ли значения
 * элементов массива одинаковые. Вывести: Yes – если все оди-
 * наковы и No – если имеется хоть одно различие.
 * Размер массива задается и инициализируется в начале программы.
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();
        // TODO: Пишите код здесь
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int a = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.print("No");
                break;
            }
            if (arr[i] == arr[i - 1]) {
                a++;
            }
            }
        if(a == len){
            System.out.print("Yes");
        }
    }
}
