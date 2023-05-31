
//Хорошо! Вот обновленная версия программы, которая реализует работу с классом Matrix через консоль:
//
//java
//Copy code
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class MatrixConsole {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Выберите операцию:");
//            System.out.println("1. Сложение матриц");
//            System.out.println("2. Вычитание матриц");
//            System.out.println("3. Умножение матрицы на число");
//            System.out.println("4. Произведение двух матриц");
//            System.out.println("5. Транспонированная матрица");
//            System.out.println("6. Возведение матрицы в степень");
//            System.out.println("0. Выход");
//
//            System.out.print("Ваш выбор: ");
//            int choice = scanner.nextInt();
//
//            if (choice == 0) {
//                System.out.println("Программа завершена");
//                break;
//            }
//
//            switch (choice) {
//                case 1:
//                    performMatrixAddition(scanner);
//                    break;
//                case 2:
//                    performMatrixSubtraction(scanner);
//                    break;
//                case 3:
//                    performMatrixScalarMultiplication(scanner);
//                    break;
//                case 4:
//                    performMatrixMultiplication(scanner);
//                    break;
//                case 5:
//                    performMatrixTransposition(scanner);
//                    break;
//                case 6:
//                    performMatrixPower(scanner);
//                    break;
//                default:
//                    System.out.println("Некорректный выбор операции");
//                    break;
//            }
//
//            System.out.println();
//        }
//    }
//
//    private static void performMatrixAddition(Scanner scanner) {
//        System.out.println("Введите размеры матрицы 1:");
//        int rows1 = scanner.nextInt();
//        int columns1 = scanner.nextInt();
//        Matrix matrix1 = createMatrixFromInput(scanner, rows1, columns1);
//
//        System.out.println("Введите размеры матрицы 2:");
//        int rows2 = scanner.nextInt();
//        int columns2 = scanner.nextInt();
//        Matrix matrix2 = createMatrixFromInput(scanner, rows2, columns2);
//
//        if (rows1 != rows2 || columns1 != columns2) {
//            System.out.println("Несовместимые размеры матриц");
//            return;
//        }
//
//        Matrix result = matrix1.add(matrix2);
//        System.out.println("Результат сложения матриц:");
//        System.out.println(result);
//    }
//
//    private static void performMatrixSubtraction(Scanner scanner) {
//        System.out.println("Введите размеры матрицы 1:");
//        int rows1 = scanner.nextInt();
//        int columns1 = scanner.nextInt();
//        Matrix matrix1 = createMatrixFromInput(scanner, rows1, columns1);
//
//        System.out.println("Введите размеры матрицы 2:");
//        int rows2 = scanner.nextInt();
//        int columns2 = scanner.nextInt();
//        Matrix matrix2 = createMatrixFromInput(scanner, rows2, columns2);
//
//        if (rows1 != rows2 || columns1 != columns2) {
//            System.out.println("Несовместимые размеры матриц");
//            return;
//        }
//
//        Matrix result = matrix1.subtract(matrix2);
//        System.out.println("Результат вычитания матриц:");
//        System.out.println(result);
//    }
//
//    private static void performMatrixScalarMultiplication(Scanner scanner) {
//        System.out.println("Введите размеры матрицы:");
//        int rows = scanner.nextInt();
//        int columns = scanner.nextInt();
//        Matrix matrix = createMatrixFromInput(scanner, rows, columns);
//
//        System.out.print("Введите скаляр: ");
//        int scalar = scanner.nextInt();
//
//        Matrix result = matrix.multiplyByScalar(scalar);
//        System.out.println("Результат умножения матрицы на скаляр:");
//        System.out.println(result);
//    }
//
//    private static void performMatrixMultiplication(Scanner scanner) {
//        System.out.println("Введите размеры матрицы 1:");
//        int rows1 = scanner.nextInt();
//        int columns1 = scanner.nextInt();
//        Matrix matrix1 = createMatrixFromInput(scanner, rows1, columns1);
//
//        System.out.println("Введите размеры матрицы 2:");
//        int rows2 = scanner.nextInt();
//        int columns2 = scanner.nextInt();
//        Matrix matrix2 = createMatrixFromInput(scanner, rows2, columns2);
//
//        if (columns1 != rows2) {
//            System.out.println("Несовместимые размеры матриц для умножения");
//            return;
//        }
//
//        Matrix result = matrix1.multiply(matrix2);
//        System.out.println("Результат произведения матриц:");
//        System.out.println(result);
//    }
//
//    private static void performMatrixTransposition(Scanner scanner) {
//        System.out.println("Введите размеры матрицы:");
//        int rows = scanner.nextInt();
//        int columns = scanner.nextInt();
//        Matrix matrix = createMatrixFromInput(scanner, rows, columns);
//
//        Matrix result = matrix.transpose();
//        System.out.println("Транспонированная матрица:");
//        System.out.println(result);
//    }
//
//    private static void performMatrixPower(Scanner scanner) {
//        System.out.println("Введите размеры матрицы:");
//        int rows = scanner.nextInt();
//        int columns = scanner.nextInt();
//        Matrix matrix = createMatrixFromInput(scanner, rows, columns);
//
//        System.out.print("Введите степень: ");
//        int exponent = scanner.nextInt();
//
//        Matrix result = matrix.power(exponent);
//        System.out.println("Результат возведения матрицы в степень:");
//        System.out.println(result);
//    }
//
//    private static Matrix createMatrixFromInput(Scanner scanner, int rows, int columns) {
//        Matrix matrix = new Matrix(rows, columns);
//        System.out.println("Введите элементы матрицы:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                matrix.setData(i, j, scanner.nextInt());
//            }
//        }
//        return matrix;
//    }
//}
//В этой обновленной версии программы:
//
//Метод main является точкой входа и предлагает пользователю выбрать операцию, вводя соответствующее число.
//Каждая операция имеет отдельный метод: performMatrixAddition, performMatrixSubtraction, performMatrixScalarMultiplication, performMatrixMultiplication, performMatrixTransposition, performMatrixPower.
//В каждом из этих методов считываются размеры матриц и элементы матриц с клавиатуры с помощью метода createMatrixFromInput.
//После выполнения операции, результат выводится на экран.
//Программа запрашивает у пользователя выбор операции и соответствующие данные для каждой операции, а затем выводит результат. Она продолжает работу до тех пор, пока пользователь не выберет выход (ввод 0).
//
//Пример работы программы:
//
//markdown
//Copy code
//Выберите операцию:
//1. Сложение матриц
//2. Вычитание матриц
//3. Умножение матрицы на число
//4. Произведение двух матриц
//5. Транспонированная матрица
//6. Возведение матрицы в степень
//0. Выход
//Ваш выбор: 1
//Введите размеры матрицы 1:
//2 2
//Введите элементы матрицы:
//1 2
//3 4
//Введите размеры матрицы 2:
//2 2
//Введите элементы матрицы:
//5 6
//7 8
//Результат сложения матриц:
//6 8
//10 12
//
//Выберите операцию:
//1. Сложение матриц
//2. Вычитание матриц
//3. Умножение матрицы на число
//4. Произведение двух матриц
//5. Транспонированная матрица
//6. Возведение матрицы в степень
//0. Выход
//Ваш выбор: 2
//Введите размеры матрицы 1:
//2 2
//Введите элементы матрицы:
//1 2
//3 4
//Введите размеры матрицы 2:
//2 2
//Введите элементы матрицы:
//5 6
//7 8
//Результат вычитания матриц:
//-4 -4
//-4 -4
//
//Выберите операцию:
//1. Сложение матриц
//2. Вычитание матриц
//3. Умножение матрицы на число
//4. Произведение двух матриц
//5. Транспонированная матрица
//6. Возведение матрицы в степень
//0. Выход
//Ваш выбор: 0
//Программа завершена
//Теперь пользователь может выбирать операции и вводить данные для каждой операции через консоль. Результаты операций выводятся на экран. Программа работает до выбора выхода (ввод 0).