package t1.t1;

//    3. Написать калькулятор для строковых выражений вида "<число> <операция> <число>",
//    где <число> - положительное целое число меньшее 10, записанное словами, например, "четыре",
//    <арифметическая операция> - одна из операций "плюс", "минус", "умножить". Результат
//     выполнения операции вернуть в виде текстового представления числа. Пример: "пять плюс
//     четыре" --> "девять"

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class n3 {
    private static Map<String, Integer> numberMap = new HashMap<>();  // Мап для хранения соответствия строкового представления чисел и их числового представления
    private static Map<String, String> operationMap = new HashMap<>();  // Мап для хранения соответствия строкового представления арифметических операций и их символьного представления

    static {
        // Заполняем мап numberMap
        numberMap.put("ноль", 0);
        numberMap.put("один", 1);
        numberMap.put("два", 2);
        numberMap.put("три", 3);
        numberMap.put("четыре", 4);
        numberMap.put("пять", 5);
        numberMap.put("шесть", 6);
        numberMap.put("семь", 7);
        numberMap.put("восемь", 8);
        numberMap.put("девять", 9);

        // Заполняем мап operationMap
        operationMap.put("плюс", "+");
        operationMap.put("минус", "-");
        operationMap.put("умножить", "*");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String expression = scanner.nextLine();

        String result = calculateExpression(expression);
        System.out.println("Результат: " + result);
    }

    public static String calculateExpression(String expression) {
        String[] parts = expression.split(" ");  // Разбиваем выражение на части по пробелам
        int operand1 = numberMap.get(parts[0]);  // Получаем первый операнд
        String operator = operationMap.get(parts[1]);  // Получаем оператор
        int operand2 = numberMap.get(parts[2]);  // Получаем второй операнд

        int result;
        switch (operator) {  // Выполняем операцию в зависимости от оператора
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            default:
                throw new IllegalArgumentException("Неверная арифметическая операция");  // Если оператор некорректный, выбрасываем исключение
        }

        if (result > 10) {
            return String.valueOf(result);  // Возвращаем результат в виде числа, если превышает 10
        } else {
            return numberToWord(result);  // Возвращаем результат в виде текстового представления числа
        }
    }

    public static String numberToWord(int number) {
        for (Map.Entry<String, Integer> entry : numberMap.entrySet()) {
            if (entry.getValue() == number) {
                return entry.getKey();
            }
        }
        throw new IllegalArgumentException("Неверное числовое представление");  // Если не находим соответствующее числовое представление, выбрасываем исключение
    }
}



//    Объяснение кода:
//
//        Создается класс StringCalculator.
//        Объявляются два статических Map: numberMap и operationMap.
//        numberMap используется для хранения соответствия строкового представления чисел и их числового представления.
//        operationMap используется для хранения соответствия строкового представления арифметических операций и их символьного представления.

//        В блоке static заполняются значения numberMap и operationMap с помощью метода put().
//        Для numberMap заполняются соответствия слов, представляющих числа, и их числовых значений от 0 до 9.
//        Для operationMap заполняются соответствия слов, представляющих арифметические операции, и их символьных представлений.
//        В методе main начинается выполнение программы.
//        Создается объект Scanner для чтения ввода пользователя с клавиатуры.
//        Выводится приглашение для ввода выражения.
//        Введенное выражение сохраняется в переменной expression.
//        Вызывается метод calculateExpression(), передавая введенное выражение.
//        Результат вычисления сохраняется в переменной result.
//        Результат выводится в консоль.
//        Метод calculateExpression выполняет вычисление заданного выражения.
//        Выражение разбивается на части с помощью метода split(" ").
//        Получаются первый операнд, оператор и второй операнд.
//        Выполняется соответствующая операция в зависимости от оператора.
//        Если результат превышает 10, возвращается строковое представление результата в виде числа.
//        Если результат не превышает 10, возвращается текстовое представление результата.
//        Метод numberToWord преобразует числовое представление числа в текстовое представление.
//        Перебираются записи в numberMap, пока не найдется соответствие числового представления искомому числу.
//        Если найдено соответствие, возвращается текстовое представление числа.
//        Если не найдено соответствие, выбрасывается исключение IllegalArgumentException.





