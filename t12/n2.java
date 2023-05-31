// Для решения этой задачи можно использовать классы File, Scanner и PrintWriter из пакета java.io. Вот пример программы, которая выполняет требуемую обработку файлов:
//
//java
//Copy code
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.util.Scanner;
//
//public class TextFileProcessing {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите номер файла (n): ");
//        int fileNumber = scanner.nextInt();
//        scanner.nextLine(); // Считываем символ новой строки после ввода числа
//
//        System.out.print("Введите операцию (+, *, -): ");
//        String operation = scanner.nextLine();
//
//        String inputFileName = fileNumber + ".txt";
//        String outputFileName = fileNumber + "_out.txt";
//
//        double result = processFile(inputFileName, operation);
//
//        System.out.println("Результат: " + result);
//
//        writeResultToFile(outputFileName, result);
//
//        System.out.println("Результат записан в файл " + outputFileName);
//    }
//
//    public static double processFile(String fileName, String operation) {
//        double number1 = 0;
//        double number2 = 0;
//
//        try (Scanner scanner = new Scanner(new File(fileName))) {
//            if (scanner.hasNextDouble()) {
//                number1 = scanner.nextDouble();
//            }
//
//            if (scanner.hasNextDouble()) {
//                number2 = scanner.nextDouble();
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Файл не найден: " + fileName);
//            e.printStackTrace();
//        }
//
//        double result = 0;
//
//        switch (operation) {
//            case "+":
//                result = number1 + number2;
//                break;
//            case "*":
//                result = number1 * number2;
//                break;
//            case "-":
//                result = number1 - number2;
//                break;
//            default:
//                System.out.println("Некорректная операция");
//        }
//
//        return result;
//    }
//
//    public static void writeResultToFile(String fileName, double result) {
//        try (PrintWriter writer = new PrintWriter(fileName)) {
//            writer.println(result);
//        } catch (FileNotFoundException e) {
//            System.out.println("Ошибка при записи в файл: " + fileName);
//            e.printStackTrace();
//        }
//    }
//}
//В данном примере:
//
//В методе main пользователь вводит номер файла (n) и требуемую операцию (+, * или -).
//Генерируются имена входного и выходного файлов на основе номера файла.
//Вызывается метод processFile, который открывает входной файл, считывает два числа из него и выполняет требуемую операцию.
//Результат выводится на экран.
//Вызывается метод writeResultToFile, который записывает результат в выходной файл.
//В случае ошибок при открытии файлов или записи в файлы, выводится соответствующее сообщение об ошибке.
//Пример работы программы:
//
//makefile
//Copy code
//Введите номер файла (n): 3
//Введите операцию (+, *, -): *
//Результат: 12.0
//Результат записан в файл 3_out.txt
//В данном примере был выбран файл 3.txt, в котором первое число равно 4.0, а второе число равно 3.0. Была выбрана операция умножения (*). Результатом умножения 4.0 и 3.0 является 12.0. Результат был записан в файл 3_out.txt.