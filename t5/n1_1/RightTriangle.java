package t1.t5.n1_1;

import java.util.Scanner;

// Класс-наследник, определяющий прямоугольный треугольник
class RightTriangle extends Triangle {
    public RightTriangle(double side1, double side2) {
        super(side1, side2, Math.sqrt(side1 * side1 + side2 * side2));
    }
}

