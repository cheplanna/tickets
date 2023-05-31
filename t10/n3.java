//Вот пример программы на Java, которая использует класс BitSet для реализации битовых операций AND, OR, XOR и маскирования:
//
//        java
//        Copy code
//import java.util.BitSet;
//
//public class BitSetExample {
//    public static void main(String[] args) {
//        BitSet bitSet1 = new BitSet(8);
//        BitSet bitSet2 = new BitSet(8);
//
//        // Установка битов в первом BitSet
//        bitSet1.set(0);
//        bitSet1.set(2);
//        bitSet1.set(4);
//        bitSet1.set(6);
//
//        // Установка битов во втором BitSet
//        bitSet2.set(1);
//        bitSet2.set(3);
//        bitSet2.set(4);
//        bitSet2.set(7);
//
//        // Операция AND
//        BitSet andResult = (BitSet) bitSet1.clone();
//        andResult.and(bitSet2);
//
//        // Операция OR
//        BitSet orResult = (BitSet) bitSet1.clone();
//        orResult.or(bitSet2);
//
//        // Операция XOR
//        BitSet xorResult = (BitSet) bitSet1.clone();
//        xorResult.xor(bitSet2);
//
//        // Маскирование
//        BitSet mask = new BitSet(8);
//        mask.set(1);
//        mask.set(3);
//        mask.set(5);
//        mask.set(7);
//
//        BitSet maskedResult = (BitSet) bitSet1.clone();
//        maskedResult.and(mask);
//
//        // Вывод результатов
//        System.out.println("BitSet 1: " + bitSet1);
//        System.out.println("BitSet 2: " + bitSet2);
//        System.out.println("AND результат: " + andResult);
//        System.out.println("OR результат: " + orResult);
//        System.out.println("XOR результат: " + xorResult);
//        System.out.println("Маскированный результат: " + maskedResult);
//    }
//}
//    В данном примере:
//
//        Мы создаем два объекта класса BitSet - bitSet1 и bitSet2 - для хранения битовых значений.
//        Метод set используется для установки битов в каждом из BitSet.
//        Операция AND выполняется путем создания копии bitSet1 и применения метода and с bitSet2.
//        Операция OR выполняется аналогично, но с использованием метода or.
//        Операция XOR выполняется аналогично, но с использованием метода xor.
//        Маска создается с использованием BitSet, где устанавливаются биты, которые будут использоваться для маскирования.
//        Маскированный результат получается путем создания копии bitSet1 и применения метода and с маской.
//        Результаты операций выводятся на экран.
//        Пример вывода:
//
//        css
//        Copy code
//        BitSet 1: {0, 2, 4, 6}
//        BitSet 2: {1, 3, 4, 7}
//        AND результат: {4}
//        OR результат: {0, 1, 2, 3, 4, 6, 7}
//        XOR результат: {0, 1, 2, 3, 6, 7}
//        Маскированный результат: {2, 6}
//        Обратите внимание, что индексы битов в BitSet начинаются с 0.