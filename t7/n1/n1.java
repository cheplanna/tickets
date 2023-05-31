package t1.t7.n1;

//19. Реализовать класс MyMath для работы с числами. Реализовать статический метод
//класса MyMath.round(), который округляет дробь до целого числа. Также статический метод
//abs(), который находит модуль числа. Статический метод MyMath.pow() для нахождения степени
//числа. Библиотеку Math не использовать.

//public class MyMath {
//    // Метод для округления числа до целого значения
//    public static int round(double number) {
//        int integerPart = (int) number; // Получаем целую часть числа
//
//        // Если дробная часть числа больше или равна 0.5, увеличиваем целую часть на 1
//        if (number - integerPart >= 0.5) {
//            integerPart++;
//        }
//
//        return integerPart;
//    }
//
//    // Метод для нахождения модуля числа
//    public static int abs(int number) {
//        return number >= 0 ? number : -number; // Если число положительное, возвращаем его, иначе возвращаем отрицательное значение
//    }
//
//    // Метод для нахождения степени числа
//    public static int pow(int base, int exponent) {
//        int result = 1;
//
//        // Перемножаем число само с собой exponent раз
//        for (int i = 0; i < exponent; i++) {
//            result *= base;
//        }
//
//        return result;
//    }
//}
//Пример использования класса MyMath:
//
//java
//Copy code
//public class Main {
//    public static void main(String[] args) {
//        double number = 4.7;
//        int roundedNumber = MyMath.round(number);
//        System.out.println(roundedNumber); // Вывод: 5
//
//        int negativeNumber = -10;
//        int absoluteValue = MyMath.abs(negativeNumber);
//        System.out.println(absoluteValue); // Вывод: 10
//
//        int base = 2;
//        int exponent = 5;
//        int powerResult = MyMath.pow(base, exponent);
//        System.out.println(powerResult); // Вывод: 32
//    }
//}
//В этой программе мы использовали класс MyMath для округления числа до целого значения, нахождения модуля числа и нахождения степени числа. Результаты вычислений выводятся в консоль.