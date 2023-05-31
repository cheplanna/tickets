package t1.t5.n1_1;

import java.util.Scanner;

public class TriangleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину первой стороны треугольника: ");
        double side1 = scanner.nextDouble();

        System.out.print("Введите длину второй стороны треугольника: ");
        double side2 = scanner.nextDouble();

        System.out.print("Введите длину третьей стороны треугольника: ");
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        System.out.println("Площадь треугольника: " + triangle.getArea());

        RightTriangle rightTriangle = new RightTriangle(side1, side2);
        System.out.println("Периметр прямоугольного треугольника: " + rightTriangle.getPerimeter());
        System.out.println("Площадь прямоугольного треугольника: " + rightTriangle.getArea());
    }
}

