//Разработайте программу, в которой создайте две коллекции с именами людей
//        (строковые переменные). Затем последовательно выводите в консоль имена
//
//        ChatGPT
//        Вот пример программы на Java, где создаются две коллекции с именами людей и затем имена последовательно выводятся в консоль:
//
//        java
//        Copy code
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class NamesExample {
//    public static void main(String[] args) {
//        List<String> names1 = new ArrayList<>(Arrays.asList("Иван", "Мария", "Александр"));
//        List<String> names2 = new ArrayList<>(Arrays.asList("Анна", "Дмитрий", "Екатерина"));
//
//        System.out.println("Первая коллекция имен:");
//        printNames(names1);
//
//        System.out.println("\nВторая коллекция имен:");
//        printNames(names2);
//    }
//
//    public static void printNames(List<String> names) {
//        for (String name : names) {
//            System.out.println(name);
//        }
//    }
//}
//    В данном коде:
//
//        Создаются две коллекции names1 и names2 с помощью класса ArrayList и метода Arrays.asList. В каждую коллекцию добавляются строки с именами людей.
//        Метод printNames принимает список имен и последовательно выводит их в консоль с помощью цикла for-each.
//        В методе main вызывается метод printNames для каждой из созданных коллекций с именами.
//        Пример вывода:
//
//        Copy code
//        Первая коллекция имен:
//        Иван
//        Мария
//        Александр
//
//        Вторая коллекция имен:
//        Анна
//        Дмитрий
//        Екатерина
//        Обратите внимание, что порядок имен в коллекциях сохраняется, как определено при их добавлении.
//
//
//
//
//
//        User
//        Пусть имена в коллекции вводятся с клавиатуры
//        ChatGPT
//        Вот обновленный пример программы, где имена в коллекции вводятся с клавиатуры:
//
//        java
//        Copy code
//        import java.util.ArrayList;
//        import java.util.List;
//        import java.util.Scanner;
//
//public class NamesExample {
//    public static void main(String[] args) {
//        List<String> names1 = readNamesFromInput();
//        List<String> names2 = readNamesFromInput();
//
//        System.out.println("Первая коллекция имен:");
//        printNames(names1);
//
//        System.out.println("\nВторая коллекция имен:");
//        printNames(names2);
//    }
//
//    public static List<String> readNamesFromInput() {
//        List<String> names = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите количество имен: ");
//        int count = scanner.nextInt();
//        scanner.nextLine(); // Чтение символа новой строки после ввода количества
//
//        for (int i = 0; i < count; i++) {
//            System.out.print("Введите имя " + (i + 1) + ": ");
//            String name = scanner.nextLine();
//            names.add(name);
//        }
//
//        return names;
//    }
//
//    public static void printNames(List<String> names) {
//        for (String name : names) {
//            System.out.println(name);
//        }
//    }
//}
//    В данном обновленном примере:
//
//        Метод readNamesFromInput используется для ввода имен с клавиатуры. В начале запрашивается количество имен, а затем в цикле запрашиваются имена от пользователя. Введенные имена добавляются в список names.
//        В методе main вызывается readNamesFromInput дважды для создания двух коллекций имен с вводом с клавиатуры.
//        Остальная часть кода остается без изменений.
//        Теперь при выполнении программы пользователю будет предложено ввести количество имен и сами имена для каждой из коллекций.
//
//        Пример вывода:
//
//        yaml
//        Copy code
//        Введите количество имен: 3
//        Введите имя 1: Иван
//        Введите имя 2: Мария
//        Введите имя 3: Александр
//        Первая коллекция имен:
//        Иван
//        Мария
//        Александр
//
//        Введите количество имен: 2
//        Введите имя 1: Анна
//        Введите имя 2: Дмитрий
//        Вторая коллекция имен:
//        Анна
//        Дмитрий
//        Теперь имена в коллекции вводятся пользователем с клавиатуры.
