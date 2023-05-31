package t1.t5;

//import java.util.Scanner;
//
//// Абстрактный класс Function
//abstract class Function {
//    // Абстрактный метод для вычисления значения функции в точке
//    public abstract double compute(double x);
//}
//
//// Класс-наследник LinearFunction
//class LinearFunction extends Function {
//    private double k; // Коэффициент наклона прямой
//    private double b; // Коэффициент сдвига прямой
//
//    public LinearFunction(double k, double b) {
//        this.k = k;
//        this.b = b;
//    }
//
//    @Override
//    public double compute(double x) {
//        return k * x + b;
//    }
//}
//
//// Класс-наследник ParabolicFunction
//class ParabolicFunction extends Function {
//    private double a; // Коэффициент при x^2
//    private double b; // Коэффициент при x
//    private double c; // Свободный член
//
//    public ParabolicFunction(double a, double b, double c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }
//
//    @Override
//    public double compute(double x) {
//        return a * x * x + b * x + c;
//    }
//}
//
//public class FunctionCalculator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите коэффициенты прямой (k, b): ");
//        double k = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        Function linearFunction = new LinearFunction(k, b);
//
//        System.out.print("Введите коэффициенты параболы (a, b, c): ");
//        double a = scanner.nextDouble();
//        double parabolicB = scanner.nextDouble();
//        double c = scanner.nextDouble();
//        Function parabolicFunction = new ParabolicFunction(a, parabolicB, c);
//
//        System.out.print("Введите значение x: ");
//        double x = scanner.nextDouble();
//
//        System.out.println("Значение функции прямой: " + linearFunction.compute(x));
//        System.out.println("Значение функции параболы: " + parabolicFunction.compute(x));
//    }
//}
// В этой программе абстрактный класс Function содержит абстрактный метод compute(), который должен быть реализован в каждом классе-наследнике для вычисления значения функции в заданной точке.
//
//Классы-наследники LinearFunction и ParabolicFunction реализуют абстрактный метод compute() в соответствии с уравнениями прямой и параболы соответственно.
//
//В методе main программы пользователю предлагается ввести коэффициенты для прямой и параболы, а также значение x. Затем вычисляются значения функций прямой и параболы в заданной точке и выводятся в консоль.