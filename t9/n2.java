//package t1.t9;
//
//import java.util.Scanner;
//
//public class Number {
//    public static String decimalToBinary(int decimal) {
//        return Integer.toBinaryString(decimal);
//    }
//
//    public static String decimalToOctal(int decimal) {
//        return Integer.toOctalString(decimal);
//    }
//
//    public static String decimalToHexadecimal(int decimal) {
//        return Integer.toHexString(decimal);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите десятичное число: ");
//        int decimal = scanner.nextInt();
//
//        System.out.println("В какой численный вид конвертировать?");
//        System.out.println("1. Бинарный");
//        System.out.println("2. Восьмеричный");
//        System.out.println("3. Шестнадцатеричный");
//        System.out.print("Выберите опцию: ");
//        int option = scanner.nextInt();
//
//        String result = "";
//        switch (option) {
//            case 1:
//                result = decimalToBinary(decimal);
//                break;
//            case 2:
//                result = decimalToOctal(decimal);
//                break;
//            case 3:
//                result = decimalToHexadecimal(decimal);
//                break;
//            default:
//                System.out.println("Некорректная опция");
//                return;
//        }
//
//        System.out.println("Результат конвертации: " + result);
//    }
//}
//    В данном коде класс Number содержит статические методы для конвертации десятичного числа в бинарный (decimalToBinary), восьмеричный (decimalToOctal) и шестнадцатеричный (decimalToHexadecimal) виды.
//
//        Метод main представляет точку входа в программу. Он считывает десятичное число с клавиатуры и запрашивает у пользователя, в какой численный вид он хочет конвертировать число. Затем выбирается соответствующий метод конвертации на основе выбранной опции и выводится результат на экран.
//
//        Пример использования:
//
//        markdown
//        Copy code
//        Введите десятичное число: 42
//        В какой численный вид конвертировать?
//        1. Бинарный
//        2. Восьмеричный
//        3. Шестнадцатеричный
//        Выберите опцию: 3
//        Результат конвертации: 2a
//        Обратите внимание, что в данном примере используется стандартный метод Integer.toBinaryString, Integer.toOctalString и Integer.toHexString для выполнения конвертации числа в соответствующие системы счисления.