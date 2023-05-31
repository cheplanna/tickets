//package t5;
//
//Вот пример реализации программы на Java, в которой создается интерфейс Progress с методами для вычисления элемента и суммы прогрессии, а также классы ArithmeticProgression (арифметическая прогрессия) и GeometricProgression (геометрическая прогрессия), которые реализуют интерфейс Progress:
//
//        java
//        Copy code
//import java.util.Scanner;
//
//// Интерфейс Progress
//interface Progress {
//    double computeElement(int n); // Метод для вычисления элемента прогрессии
//    double computeSum(int n); // Метод для вычисления суммы прогрессии
//}
//
//// Класс ArithmeticProgression (арифметическая прогрессия)
//class ArithmeticProgression implements Progress {
//    private double a; // Первый член прогрессии
//    private double d; // Разность прогрессии
//
//    public ArithmeticProgression(double a, double d) {
//        this.a = a;
//        this.d = d;
//    }
//
//    @Override
//    public double computeElement(int n) {
//        return a + (n - 1) * d;
//    }
//
//    @Override
//    public double computeSum(int n) {
//        return (n / 2.0) * (2 * a + (n - 1) * d);
//    }
//}
//
//// Класс GeometricProgression (геометрическая прогрессия)
//class GeometricProgression implements Progress {
//    private double a; // Первый член прогрессии
//    private double q; // Знаменатель прогрессии
//
//    public GeometricProgression(double a, double q) {
//        this.a = a;
//        this.q = q;
//    }
//
//    @Override
//    public double computeElement(int n) {
//        return a * Math.pow(q, n - 1);
//    }
//
//    @Override
//    public double computeSum(int n) {
//        return a * (Math.pow(q, n) - 1) / (q - 1);
//    }
//}
//
//public class ProgressProgram {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите первый член арифметической прогрессии: ");
//        double arithmeticFirst = scanner.nextDouble();
//        System.out.print("Введите разность арифметической прогрессии: ");
//        double arithmeticDiff = scanner.nextDouble();
//        Progress arithmeticProgression = new ArithmeticProgression(arithmeticFirst, arithmeticDiff);
//
//        System.out.print("Введите первый член геометрической прогрессии: ");
//        double geometricFirst = scanner.nextDouble();
//        System.out.print("Введите знаменатель геометрической прогрессии: ");
//        double geometricRatio = scanner.nextDouble();
//        Progress geometricProgression = new GeometricProgression(geometricFirst, geometricRatio);
//
//        System.out.print("Введите номер элемента для вычисления: ");
//        int n = scanner.nextInt();
//
//        System.out.println("Элемент арифметической прогрессии: " + arithmeticProgression.computeElement(n));
//        System.out.println("Сумма арифметической прогрессии: " + arithmeticProgression.computeSum(n));
//        System.out.println("Элемент геометрической прогрессии: " + geometricProgression.computeElement(n));
//        System.out.println("Сумма геометрической прогрессии: " + geometricProgression.computeSum(n));
//    }
//}
//    В этой программе создается интерфейс Progress, который содержит методы computeElement() и computeSum() для вычисления элемента и суммы прогрессии соответственно.
//
//        Классы ArithmeticProgression и GeometricProgression реализуют интерфейс Progress и предоставляют конкретную реализацию для арифметической и геометрической прогрессий соответственно.
//
//        В методе main программы пользователь вводит первый член и разность (для арифметической прогрессии) или первый член и знаменатель (для геометрической прогрессии). Затем пользователь вводит номер элемента, для которого нужно вычислить значение и сумму. Результаты вычислений выводятся в консоль.