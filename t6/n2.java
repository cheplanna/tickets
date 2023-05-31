// . Создать класс Binary для работы с двоичными числами фиксированной длины. Число
//должно быть массивом тип char, каждый элемент которого принимает значение 0 или 1.
//Младший бит имеет младший индекс. Отрицательные числа представляются в дополнительном
//коде. Дополнительный код получается инверсией всех битов с прибавлением 1 к младшему биту.
//Например, +1 – это в двоичном коде будет выглядеть, как 0000 0001. А -1 в двоичном коде будет
//выглядеть, как 1111 1110 + 0000 0001 = 1111 1111. Создать методы конвертации десятичного
//числа в массив и обратно.

// public class Binary {
//    private char[] binaryArray; // Массив для хранения двоичного числа
//
//    // Конструктор класса, принимающий длину двоичного числа
//    public Binary(int length) {
//        binaryArray = new char[length];
//        for (int i = 0; i < length; i++) {
//            binaryArray[i] = '0'; // Инициализируем массив нулями
//        }
//    }
//
//    // Метод для получения двоичного числа в виде массива
//    public char[] getBinaryArray() {
//        return binaryArray;
//    }
//
//    // Метод для установки двоичного числа из массива
//    public void setBinaryArray(char[] binaryArray) {
//        this.binaryArray = binaryArray;
//    }
//
//    // Метод для конвертации десятичного числа в двоичное число
//    public void convertDecimalToBinary(int decimal) {
//        if (decimal < 0) {
//            convertNegativeDecimalToBinary(decimal);
//        } else {
//            for (int i = binaryArray.length - 1; i >= 0; i--) {
//                binaryArray[i] = (decimal % 2 == 0) ? '0' : '1';
//                decimal /= 2;
//            }
//        }
//    }
//
//    // Метод для конвертации отрицательного десятичного числа в двоичное число в дополнительном коде
//    private void convertNegativeDecimalToBinary(int decimal) {
//        decimal = Math.abs(decimal);
//        for (int i = binaryArray.length - 1; i >= 0; i--) {
//            binaryArray[i] = (decimal % 2 == 0) ? '1' : '0';
//            decimal /= 2;
//        }
//
//        // Дополнительный код получается инверсией всех битов с прибавлением 1 к младшему биту
//        int carry = 1;
//        for (int i = binaryArray.length - 1; i >= 0; i--) {
//            if (binaryArray[i] == '0') {
//                binaryArray[i] = '1';
//                carry = 0;
//                break;
//            } else {
//                binaryArray[i] = '0';
//            }
//        }
//
//        if (carry == 1) {
//            // Если все биты были инвертированы и прибавлен 1 к младшему биту, значит число было -1
//            // В таком случае, преобразуем его в отрицательное число с помощью прямой инверсии всех битов
//            for (int i = 0; i < binaryArray.length; i++) {
//                binaryArray[i] = (binaryArray[i] == '0') ? '1' : '0';
//            }
//        }
//    }
//
//    // Метод для конвертации двоичного числа в десятичное число
//    public int convertBinaryToDecimal() {
//        int decimal = 0;
//        int power = binaryArray.length - 1;
//
//        for (int i = 0; i < binaryArray.length; i++) {
//            int bitValue = (binaryArray[i] == '1') ? 1 : 0;
//            decimal += bitValue * Math.pow(2, power);
//            power--;
//        }
//
//        return decimal;
//    }
//}
//    Пример использования класса Binary:
//
//        java
//        Copy code
//public class Main {
//    public static void main(String[] args) {
//        Binary binary = new Binary(8); // Создаем объект класса Binary с длиной двоичного числа 8
//
//        binary.convertDecimalToBinary(10); // Конвертируем десятичное число 10 в двоичное число
//        System.out.println(binary.getBinaryArray()); // Выводим двоичное число
//
//        binary.convertDecimalToBinary(-5); // Конвертируем отрицательное десятичное число -5 в двоичное число
//        System.out.println(binary.getBinaryArray()); // Выводим двоичное число
//
//        int decimal = binary.convertBinaryToDecimal(); // Конвертируем двоичное число в десятичное число
//        System.out.println(decimal); // Выводим десятичное число
//    }
//}
//    В этой программе мы создаем объект класса Binary с заданной длиной двоичного числа. Затем мы используем методы класса для конвертации десятичного числа в двоичное число и наоборот. Выводим результаты конвертации в консоль.
//
//        Программа демонстрирует работу с двоичными числами и применение дополнительного кода для представления отрицательных чисел.