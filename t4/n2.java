package t1.t4;

// 11. Разработать класс-оболочку для числового типа double. Реализовать статические
//методы сложения, деления, возведения в степень.
import java.util.Scanner;

public class n2 {
    class Double1 {
        // Статический метод для сложения двух чисел типа double
        static double DSum(double a, double b) {
            return Double.sum(a, b);
        }

        // Статический метод для деления двух чисел типа double
        static double DDiv(double a, double b) {
            return a / b;
        }

        // Статический метод для возведения числа в степень типа double
        static double DPow(double a, double b) {
            return Math.pow(a, b);
        }
    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println(">");
        double a = cs.nextDouble();
        double b = cs.nextDouble();

        // Вызов статических методов из класса Double1 для выполнения операций
        System.out.println(Double1.DSum(a, b));
        System.out.println(Double1.DDiv(a, b));
        System.out.println(Double1.DPow(a, b));
    }
}

// Создается класс n2 с вложенным классом Double1, который является оболочкой для работы с числовым типом double.
//
//В классе Double1 определены три статических метода: DSum, DDiv и DPow. Эти методы выполняют операции сложения, деления и возведения в степень соответственно.
//
//В методе main создается объект Scanner для чтения ввода пользователя с консоли.
//
//Выводится приглашение для ввода двух чисел с помощью System.out.println(">").
//
//Вводимые пользователем числа сохраняются в переменные a и b типа double.
//
//Вызываются статические методы DSum, DDiv и DPow из класса Double1 для выполнения операций над введенными числами.
//
//Результаты операций выводятся на консоль с помощью System.out.println().
