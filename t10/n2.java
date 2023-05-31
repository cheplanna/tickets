package t10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class n2 {

    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        //int comparisonCount=1;

        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) { //То же самое, что и &, но если операнд, находящийся слева от & является false, данный оператор возвращает false без проверки второго операнда.
            //comparisonCount++;
            if (array[position] > item) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " is successfully found");
        } else {
            System.out.println("no num in array");
        }
    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        Random random = new Random();

        System.out.print("num of array>");
        int num = cs.nextInt();

        int[] m = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print(i + 1 + "s num >");
            m[i] = cs.nextInt();
        }
        Arrays.sort(m);

        System.out.print("input num for search>");
        int item = cs.nextInt();
        int first = 0;
        int last = num - 1;

        binarySearch(m, first, last, item);
    }
}


//
//Вот пример программы на Java, которая заполняет список случайными числами, принимает от пользователя количество элементов и числовой диапазон, а затем проверяет, входит ли число (также введенное пользователем) в данный список с использованием бинарного поиска:
//
//        java
//        Copy code
//        import java.util.ArrayList;
//        import java.util.Collections;
//        import java.util.List;
//        import java.util.Random;
//        import java.util.Scanner;
//
//public class BinarySearchExample {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("Введите количество элементов списка: ");
//        int size = scanner.nextInt();
//
//        System.out.print("Введите нижнюю границу числового диапазона: ");
//        int min = scanner.nextInt();
//
//        System.out.print("Введите верхнюю границу числового диапазона: ");
//        int max = scanner.nextInt();
//
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < size; i++) {
//            int randomNumber = random.nextInt(max - min + 1) + min;
//            list.add(randomNumber);
//        }
//
//        Collections.sort(list);
//
//        System.out.print("Введите число для поиска: ");
//        int target = scanner.nextInt();
//
//        boolean found = binarySearch(list, target);
//
//        if (found) {
//            System.out.println("Число " + target + " найдено в списке.");
//        } else {
//            System.out.println("Число " + target + " не найдено в списке.");
//        }
//    }
//
//    public static boolean binarySearch(List<Integer> list, int target) {
//        int left = 0;
//        int right = list.size() - 1;
//
//        while (left <= right) {
//            int middle = left + (right - left) / 2;
//            int value = list.get(middle);
//
//            if (value == target) {
//                return true;
//            } else if (value < target) {
//                left = middle + 1;
//            } else {
//                right = middle - 1;
//            }
//        }
//
//        return false;
//    }
//}
//    В данной программе:
//
//        Мы сначала запрашиваем у пользователя количество элементов списка (size), а затем числовой диапазон, в котором должны находиться случайные числа (min и max).
//        Затем мы создаем список list и заполняем его случайными числами с использованием класса Random и метода nextInt.
//        После этого мы сортируем список в порядке возрастания с помощью метода Collections.sort.
//        Затем мы запрашиваем у пользователя число, которое он хочет найти в списке (target).
//        Мы выполняем бинарный поиск с использованием метода binarySearch.
//        Если число найдено, выводится сообщение о его нахождении, в противном случае выводится сообщение о его отсутствии.
//        Обратите внимание, что предполагается, что пользователь будет вводить числа в правильном формате. Дополнительные проверки и обработка ошибок могут быть добавлены при необходимости.