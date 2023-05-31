// Вот пример программы, которая находит наибольший общий делитель (НОД) двух натуральных чисел с использованием рекурсии и без рекурсии:
//
//java
//Copy code
//import java.util.Scanner;
//
//public class GCD {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите первое число: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("Введите второе число: ");
//        int num2 = scanner.nextInt();
//
//        int gcdRecursive = calculateGCDRecursive(num1, num2);
//        int gcdIterative = calculateGCDIterative(num1, num2);
//
//        System.out.println("Наибольший общий делитель (рекурсивный): " + gcdRecursive);
//        System.out.println("Наибольший общий делитель (итеративный): " + gcdIterative);
//    }
//
//    public static int calculateGCDRecursive(int num1, int num2) {
//        if (num2 == 0) {
//            return num1;
//        }
//
//        return calculateGCDRecursive(num2, num1 % num2);
//    }
//
//    public static int calculateGCDIterative(int num1, int num2) {
//        while (num2 != 0) {
//            int remainder = num1 % num2;
//            num1 = num2;
//            num2 = remainder;
//        }
//
//        return num1;
//    }
//}
//В этой программе:
//
//Пользователь вводит два натуральных числа (num1 и num2).
//Метод calculateGCDRecursive вычисляет НОД рекурсивно с помощью алгоритма Евклида. Если второе число равно 0, то первое число является НОД. В противном случае, метод рекурсивно вызывает себя, передавая в качестве аргументов второе число и остаток от деления первого числа на второе число.
//Метод calculateGCDIterative вычисляет НОД итеративно также с помощью алгоритма Евклида. В цикле while проверяется, пока второе число не станет равным 0. Внутри цикла вычисляется остаток от деления первого числа на второе число, а затем значения обновляются, присваивая второму числу значение остатка, а первому числу значение второго числа.
//Найденные значения НОД выводятся на экран.
//Пример работы программы:
//
//Copy code
//Введите первое число: 24
//Введите второе число: 18
//Наибольший общий делитель (рекурсивный): 6
//Наибольший общий делитель (итеративный): 6
//В данном примере были введены числа 24 и 18. Оба метода вычислили, что наибольший общий делитель этих чисел равен 6. Результаты выводятся на экран.