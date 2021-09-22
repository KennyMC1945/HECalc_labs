import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Lab1Main {
    public static void main(String[] args){
        // Task 1: Ввести целочисленное и вывести на экран последнюю цифру.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        System.out.println("Последняя цифра: " + in.nextInt()%10); // Вывод последней цифры
        // Task 2: Ввести целое трехзначное число и найти сумму его цифр.
        System.out.print("Введите целое трехзначное число: ");
        int t2 = in.nextInt();
        int digitSum = (t2/100 + (t2/10 - ((t2/100)*10)) + t2%10);
        System.out.println("Сумма цифр: " + digitSum);
        // Task 3: Ввести целое число, если оно положительное то ++, иначе не изменять.
        System.out.print("Введите целое число: ");
        int t3 = in.nextInt();
        t3 += (t3 > 0)?1:0;
        System.out.println("Полученное число: " + t3);
        // Task 4: Ввести целое число, >0 => +1; <0 => -2; 0 => 10
        System.out.print("Введите целое число: ");
        int t4 = in.nextInt();
        if (t4 == 0) t4 = 10;
        else if (t4 > 0) t4 += 1;
        else t4 -= 2;
        System.out.println("Полученное число: " + t4);
        // Task 5: Ввести три целых числа с консоли, вывести наименьшее
        System.out.print("Введите три числа: ");
        int t51 = in.nextInt();
        int temp = in.nextInt();
        int min = Math.min(t51, temp);
        temp = in.nextInt();
        min = Math.min(min, temp);
        System.out.println("Минимальное: " + min);
        // Task 6: Ввести целое число в консоли, вывести описательную строку вида (отр/пол чет/нечет число)
        System.out.print("Введите целое число: ");
        int t6 = in.nextInt();
        String desc = "";
        if (t6 > 0) desc += "Положительное ";
        else if (t6 < 0) desc += "Отрицательное ";
        if (t6 % 2 == 0) desc += "четное число";
        else desc += "нечетное число";
        if (t6 == 0) desc = "Нулевое число";
        System.out.println("Ваше число: " + desc);
        // Task 7: Написать прогу вычисляющую стоимость 10мин разговора по коду города
        // 905 = 4.15, 194 = 1.98, 491 = 2.69. 800 = 5.00
        double price = 0;
        int time = 10;
        System.out.print("Введите код города: ");
        switch (in.nextInt()) {
            case 905: price = 4.15; break;
            case 194: price = 1.98; break;
            case 491: price = 2.69; break;
            case 800: price = 5.00; break;
        }
        System.out.println("Стоимость "+time+" минут разговора составит: "+ price*time);
        // Task 8: Дан массив [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]
        // Найти
        // Макс, сумму пол. элементов, сумму четных отрицательных, кол-во полож., среднее арифм отриц.
        int[] t8_array = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        System.out.println("Максимальное: "+ max(t8_array));
        System.out.println("Сумма положительных: "+ sumPositive(t8_array));
        System.out.println("Сумма четных отрицательных: "+ sumEvenNegative(t8_array));
        System.out.println("Кол-во положительных: "+ countPositive(t8_array));
        System.out.println("Среднее арифметическое отрицательных: "+ avgNegative(t8_array));
        // Task 9: Дан массив [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52] Вывести в обратном порядке
        int[] t9_array = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        for (int i = 0, j = t9_array.length -1; i<=j; i++, j--) {
            int temp_swap = t9_array[j];
            t9_array[j] = t9_array[i];
            t9_array[i] = temp_swap;
        }
        for (int i : t9_array) System.out.print(i + " ");
        System.out.println("");
        // Task 10: Дан массив [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52] переместить нули в конец
        int[] t10_array = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};

        for (int i = t10_array.length-1; i >= 0; i--) {
            if (t10_array[i] == 0) {
                for (int j = i; j < t10_array.length-1; j++) {
                    if (t10_array[j+1] != 0) {
                        int temp10 = t10_array[j];
                        t10_array[j] = t10_array[j+1];
                        t10_array[j+1] = temp10;
                    }
                }
            }
        }
        for (int d:t10_array ) {
            System.out.print(d+" ");
        }
    }

    public static int max(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    public static int sumPositive(int[] arr){
        return Arrays.stream(arr).filter(x -> x > 0).sum();
    }

    public static int sumEvenNegative(int[] arr) {
        return Arrays.stream(arr).filter(x -> (x < 0) && (x%2 == 0)).sum();
    }
    public static int countPositive(int[] arr) {
        return (int) Arrays.stream(arr).filter(x->x>0).count();
    }

    public static double avgNegative(int[] arr){
        return Arrays.stream(arr).filter(x->x<0).average().getAsDouble();
    }
}
