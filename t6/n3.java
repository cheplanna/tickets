package t1.t6;

// 18. Создать класс Matrix для работы с двумерными матрицами. Создать методы для
//генерации нулевой матрицы, а также для генерации матрицы со случайными величинами –
//применить Math.random(). Реализовать метод сложения матриц.

//public class Matrix {
//    private double[][] matrix; // Массив для хранения элементов матрицы
//
//    // Конструктор класса, принимающий количество строк и столбцов матрицы
//    public Matrix(int rows, int columns) {
//        matrix = new double[rows][columns];
//    }
//
//    // Метод для получения элемента матрицы по указанным индексам
//    public double getElement(int row, int column) {
//        return matrix[row][column];
//    }
//
//    // Метод для установки значения элемента матрицы по указанным индексам
//    public void setElement(int row, int column, double value) {
//        matrix[row][column] = value;
//    }
//
//    // Метод для генерации нулевой матрицы
//    public void generateZeroMatrix() {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = 0;
//            }
//        }
//    }
//
//    // Метод для генерации матрицы со случайными значениями
//    public void generateRandomMatrix() {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = Math.random();
//            }
//        }
//    }
//
//    // Метод для сложения двух матриц
//    public Matrix addMatrix(Matrix otherMatrix) {
//        if (matrix.length != otherMatrix.matrix.length || matrix[0].length != otherMatrix.matrix[0].length) {
//            throw new IllegalArgumentException("Размеры матриц не совпадают");
//        }
//
//        Matrix resultMatrix = new Matrix(matrix.length, matrix[0].length);
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                resultMatrix.matrix[i][j] = matrix[i][j] + otherMatrix.matrix[i][j];
//            }
//        }
//
//        return resultMatrix;
//    }
//}
//Пример использования класса Matrix:
//
//java
//Copy code
//public class Main {
//    public static void main(String[] args) {
//        Matrix matrix1 = new Matrix(3, 3); // Создаем объект класса Matrix с размером 3x3
//
//        matrix1.generateZeroMatrix(); // Генерируем нулевую матрицу
//        printMatrix(matrix1); // Выводим матрицу
//
//        Matrix matrix2 = new Matrix(3, 3); // Создаем другой объект класса Matrix с таким же размером
//
//        matrix2.generateRandomMatrix(); // Генерируем матрицу со случайными значениями
//        printMatrix(matrix2); // Выводим матрицу
//
//        Matrix sumMatrix = matrix1.addMatrix(matrix2); // Складываем две матрицы
//        printMatrix(sumMatrix); // Выводим матрицу-результат сложения
//    }
//
//    // Метод для вывода матрицы в консоль
//    public static void printMatrix(Matrix matrix) {
//        for (int i = 0; i < matrix.getRowCount(); i++) {
//            for (int j = 0; j < matrix.getColumnCount(); j++) {
//                System.out.print(matrix.getElement(i, j) + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//}
//В этой программе мы создаем объекты класса Matrix, генерируем нулевую матрицу и матрицу со случайными значениями, а затем складываем две матрицы с использованием метода addMatrix(). Результат сложения выводится в консоль с помощью метода printMatrix().