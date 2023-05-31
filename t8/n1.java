//package t1.t8;
//
//import java.util.Scanner;
//
//public class ComplexNumber {
//    private int real; // Вещественная часть
//    private int imaginary; // Мнимая часть
//
//    public ComplexNumber(int real, int imaginary) {
//        this.real = real;
//        this.imaginary = imaginary;
//    }
//
//    // Методы доступа (геттеры и сеттеры)
//    public int getReal() {
//        return real;
//    }
//
//    public void setReal(int real) {
//        this.real = real;
//    }
//
//    public int getImaginary() {
//        return imaginary;
//    }
//
//    public void setImaginary(int imaginary) {
//        this.imaginary = imaginary;
//    }
//
//    // Метод для выполнения сложения комплексных чисел
//    public ComplexNumber add(ComplexNumber other) {
//        int sumReal = this.real + other.real;
//        int sumImaginary = this.imaginary + other.imaginary;
//        return new ComplexNumber(sumReal, sumImaginary);
//    }
//
//    // Метод для выполнения вычитания комплексных чисел
//    public ComplexNumber subtract(ComplexNumber other) {
//        int diffReal = this.real - other.real;
//        int diffImaginary = this.imaginary - other.imaginary;
//        return new ComplexNumber(diffReal, diffImaginary);
//    }
//
//    // Метод для выполнения умножения комплексных чисел
//    public ComplexNumber multiply(ComplexNumber other) {
//        int productReal = (this.real * other.real) - (this.imaginary * other.imaginary);
//        int productImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
//        return new ComplexNumber(productReal, productImaginary);
//    }
//
//    // Переопределение метода toString для вывода комплексного числа в виде строки
//    @Override
//    public String toString() {
//        return real + " + " + imaginary + "i";
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите вещественную часть первого комплексного числа:");
//        int realPart1 = scanner.nextInt();
//        System.out.println("Введите мнимую часть первого комплексного числа:");
//        int imaginaryPart1 = scanner.nextInt();
//        ComplexNumber complex1 = new ComplexNumber(realPart1, imaginaryPart1);
//
//        System.out.println("Введите вещественную часть второго комплексного числа:");
//        int realPart2 = scanner.nextInt();
//        System.out.println("Введите мнимую часть второго комплексного числа:");
//        int imaginaryPart2 = scanner.nextInt();
//        ComplexNumber complex2 = new ComplexNumber(realPart2, imaginaryPart2);
//
//        ComplexNumber sum = complex1.add(complex2);
//        ComplexNumber difference = complex1.subtract(complex2);
//        ComplexNumber product = complex1.multiply(complex2);
//
//        System.out.println("Сумма: " + sum);
//        System.out.println("Разность: " + difference);
//        System.out.println("Произведение: " + product);
//    }
//}
//    Дополнения включают:
//
//        Импорт класса Scanner для считывания ввода с клавиатуры.
//        Добавление кода в метод main, который считывает вещественную и мнимую части комплексных чисел с клавиатуры с помощью объекта Scanner и создает экземпляры ComplexNumber на основе введенных значений.
//        Выполнение операций сложения, вычитания и умножения для этих комплексных чисел и вывод результатов на экран.