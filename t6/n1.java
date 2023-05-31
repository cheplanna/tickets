package t1.t6;
//
//import java.util.Scanner;
//import java.util.Random;
//
//// Интерфейс InArray
//interface InArray {
//    int[] sumArrays(int[] array1, int[] array2); // Метод для сложения двух массивов
//}
//
//// Класс ArraySum
//class ArraySum implements InArray {
//    @Override
//    public int[] sumArrays(int[] array1, int[] array2) {
//        if (array1.length != array2.length) {
//            throw new IllegalArgumentException("Размеры массивов должны быть одинаковыми");
//        }
//
//        int[] result = new int[array1.length];
//        for (int i = 0; i < array1.length; i++) {
//            result[i] = array1[i] + array2[i];
//        }
//        return result;
//    }
//}
//
//// Класс OrArray
//class OrArray implements InArray {
//    @Override
//    public int[] sumArrays(int[] array1, int[] array2) {
//        if (array1.length != array2.length) {
//            throw new IllegalArgumentException("Размеры массивов должны быть одинаковыми");
//        }
//
//        int[] result = new int[array1.length];
//        for (int i = 0; i < array1.length; i++) {
//            result[i] = array1[i] | array2[i];
//        }
//        return result;
//    }
//}
//
//public class ArrayCalculator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//
//        int[] array1 = generateRandomArray(size);
//        int[] array2 = generateRandomArray(size);
//
//        InArray arraySum = new ArraySum();
//        int[] sumResult = arraySum.sumArrays(array1, array2);
//        System.out.println("Сумма массивов (ArraySum): " + java.util.Arrays.toString(sumResult));
//
//        InArray orArray = new OrArray();
//        int[] orResult = orArray.sumArrays(array1, array2);
//        System.out.println("Логическая операция ИЛИ между массивами (OrArray): " + java.util.Arrays.toString(orResult));
//    }
//
//    // Метод для генерации случайного массива заданного размера
//    public static int[] generateRandomArray(int size) {
//        int[] array = new int[size];
//        Random random = new Random();
//        for (int i = 0; i < size; i++) {
//            array[i] = random.nextInt(100); // Случайное число от 0 до 99
//        }
//        return array;
//    }
//}
// Интерфейс InArray:
//
//Определяет абстрактный метод sumArrays(), который принимает два массива и возвращает новый массив, полученный путем сложения соответствующих элементов.
//Этот интерфейс служит в качестве контракта, который гарантирует, что классы, реализующие его, будут иметь метод для сложения массивов.
//Класс ArraySum:
//
//Реализует интерфейс InArray.
//В методе sumArrays() выполняет сложение элементов двух массивов и возвращает новый массив с результатом сложения.
//Если размеры массивов не совпадают, выбрасывается исключение IllegalArgumentException.
//Класс OrArray:
//
//Реализует интерфейс InArray.
//В методе sumArrays() выполняет логическую операцию ИЛИ между элементами двух массивов и возвращает новый массив с результатом.
//Если размеры массивов не совпадают, выбрасывается исключение IllegalArgumentException.
//В методе main() осуществляется взаимодействие с пользователем:
//
//Запрашивается ввод размера массива с клавиатуры.
//Создаются два случайных массива с помощью метода generateRandomArray().
//Создаются экземпляры классов ArraySum и OrArray.
//Вызывается метод sumArrays() у каждого экземпляра, передавая в него созданные массивы.
//Результаты сложения выводятся в консоль.
//Метод generateRandomArray() генерирует случайный массив заданного размера, используя класс Random.
//
//Вся программа демонстрирует принципы наследования и интерфейсов в Java, а также простую работу с массивами и случайными числами.