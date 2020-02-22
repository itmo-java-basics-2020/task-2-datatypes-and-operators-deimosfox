package ru.itmo.java;

import java.util.function.Function;

@SuppressWarnings("all")
public class Task2 {

    /**
     * Дано произвольное вещественное число. Выведите его дробную часть
     * <p>
     * Например
     * - дано 17.9
     * - вывод 0.9
     */
    double getFractionalPart(double realNumber) {
        int a = (int)realNumber;
        return realNumber - a;

    }

    /**
     * Дан символ, верните его код. Не используйте явное приведение типов и любые библиотечные функции
     */
    int charCode(char c) {
        return c;
    }

    /**
     * Даны 2 целых числа. Проверьте равны ли они
     */
    boolean testIfIntsEqual(Integer a, Integer b) {
        if (a - b == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Дано целое число. Выведите {@code true}, если оно входит в заданный диапазон или {@code false}
     * в иных случаях
     *
     * @param number      заданное число
     * @param leftBound   правая граница диапазона
     * @param rightBound  верхняя граница диапазона
     * @param inclusively входят ли границы в заданный даипазон
     */
    boolean numberInRange(Integer number, Integer leftBound, Integer rightBound, Boolean inclusively) {
        if(number == null || leftBound == null || rightBound == null || inclusively == null) { return false; }
        if(number > leftBound && number < rightBound) { return true; }
        else if ((number == leftBound || number == rightBound )&& inclusively == true) { return true; }
        else { return false; }

    }

    /**
     * Даны 3 символа. Определите является ли хотя бы один из них цифрой 1..9
     */
    boolean atLeastOneIsDigit(char c1, char c2, char c3) {
        int[] arr = new int [3];
        arr[0] = c1 - '0';
        arr[1] = c2 - '0';
        arr[2] = c3 - '0';
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0; j <= 9; j++) {
                if (arr[i] == j) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Даны два вещественных числа. Определите равны ли они
     */
    boolean areRealNumbersEqual(double a, double b) {
        double maxRelDiff = 1e-5;

        double diff = (Math.abs(a) - Math.abs(b));
        a = Math.abs(a);
        b = Math.abs(b);
        double largest = (b > a) ? b : a;

        if (diff <= largest * maxRelDiff)
            return true;

        return false;
    }

    /**
     * Дано трехзначное число 100 <= N <= 999. Найдите сумму его чисел.
     */
    int sumOfDigits(int n) {
        return (n%10 + n%100/10 + n/100);
    }

    /**
     * Дано натуральное число N <= 10000. Выведите следующее после N четное число. Например: N = 8, Result = 10
     */
    int nextEvenNumber(int n) {
        if(n%2 == 0) {
            return  n+2;
        }
        else {
            return n+1;
        }
    }

    /**
     * Школа №32 решила создать 3 дополнительных физмат класса и укомплектовать кабинеты новыми партами.
     * За одной партой может сидеть 2 ученика. Кол-во учеников в каждом из классов известно (num1, num2, num3).
     * Выведите минимальное кол-во парт, которые нужно приобрести школе, при условии что каждый из классов сидит в
     * своем кабинете
     */
    int schoolDesks(int num1, int num2, int num3) {
        int num=((num1+num1%2) / 2) + ((num2+num2%2) / 2) + ((num3+num3%2) / 2);
        return num;
    }

    /**
     * Дано натуральное число N >= 10. Выведите результат применения XOR к последним 2-м цифрам числа N
     */
    int xorDigits(int N) {
        int res = (N%10 ^ N%100/10);
        return res;
    }
}
