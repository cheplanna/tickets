package t1.t4;
// 12. Разработать программу, которая заполняет двумерный массив случайными
//положительными числами в диапазоне от 1 до 100 до тех пор, пока сумма граничных элементов
//не станет равной 666. Пользователь вначале вводит размер матрицы
import java.util.Random;
import java.util.Scanner;



public class n3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();

        System.out.print("Введите количество столбцов матрицы: ");
        int columns = scanner.nextInt();

        // Создание двумерного массива заданного размера
        int[][] matrix = new int[rows][columns];

        Random random = new Random();

        int sum = 0;
        int boundarySum = 666;

        // Заполнение матрицы случайными положительными числами и подсчет суммы граничных элементов
        while (sum != boundarySum) {
            // Заполнение матрицы случайными числами
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = random.nextInt(100) + 1;
                }
            }

            // Подсчет суммы граничных элементов
            sum = getBoundarySum(matrix);
        }

        // Вывод матрицы
        System.out.println("Сгенерированная матрица:");
        printMatrix(matrix);

        System.out.println("Сумма граничных элементов: " + sum);
    }

    // Метод для подсчета суммы граничных элементов матрицы
    public static int getBoundarySum(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int sum = 0;

        // Сумма верхней границы
        for (int j = 0; j < columns; j++) {
            sum += matrix[0][j];
        }

        // Сумма нижней границы
        for (int j = 0; j < columns; j++) {
            sum += matrix[rows - 1][j];
        }

        // Сумма левой границы
        for (int i = 1; i < rows - 1; i++) {
            sum += matrix[i][0];
        }

        // Сумма правой границы
        for (int i = 1; i < rows - 1; i++) {
            sum += matrix[i][columns - 1];
        }

        return sum;
    }

    // Метод для вывода матрицы в консоль
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}



//public class n3 {
//    public static void main(String[] args) {
//        Scanner cs = new Scanner(System.in);
//        Random random = new Random();
//        int[][] m = new int[100][100];
//        boolean t = true;
//
//        for (int i = 0; i < 100; i++){
//            if (t == false){
//                break;
//            }
//            for (int x = 0; x < 100; x++){
//                m[i][x] = random.nextInt(1,1001);
//                System.out.println(m[i][x]);
//                if (x > 0){
//                    if (m[i][x-1] + m[i][x] == 666){
//                        System.out.println(m[i][x-1] + " + " + m[i][x] + " = 666");
//                        t = false;
//                        break;
//                    }
//                }
//            }
//        }
//    }
//}
