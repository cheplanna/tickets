//package t1.t9;
//public abstract class ColorModel {
//    protected int red;
//    protected int green;
//    protected int blue;
//
//    public abstract void convert();
//
//    public void display() {
//        System.out.println("Red: " + red);
//        System.out.println("Green: " + green);
//        System.out.println("Blue: " + blue);
//    }
//}
//
//public class RGBConverter extends ColorModel {
//    private double cyan;
//    private double magenta;
//    private double yellow;
//    private double black;
//
//    public RGBConverter(double cyan, double magenta, double yellow, double black) {
//        this.cyan = cyan;
//        this.magenta = magenta;
//        this.yellow = yellow;
//        this.black = black;
//    }
//
//    @Override
//    public void convert() {
//        red = (int) (255 * (1 - cyan) * (1 - black));
//        green = (int) (255 * (1 - magenta) * (1 - black));
//        blue = (int) (255 * (1 - yellow) * (1 - black));
//    }
//}
//
//public class CMYKConverter extends ColorModel {
//    private int red;
//    private int green;
//    private int blue;
//
//    public CMYKConverter(int red, int green, int blue) {
//        this.red = red;
//        this.green = green;
//        this.blue = blue;
//    }
//
//    @Override
//    public void convert() {
//        double cyan = 1 - (red / 255.0);
//        double magenta = 1 - (green / 255.0);
//        double yellow = 1 - (blue / 255.0);
//        double black = Math.min(cyan, Math.min(magenta, yellow));
//
//        this.red = (int) (255 * (1 - cyan) * (1 - black));
//        this.green = (int) (255 * (1 - magenta) * (1 - black));
//        this.blue = (int) (255 * (1 - yellow) * (1 - black));
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Пример конвертации CMYK в RGB
//        CMYKConverter cmykConverter = new CMYKConverter(100, 120, 150);
//        cmykConverter.convert();
//        System.out.println("RGB values:");
//        cmykConverter.display();
//
//        // Пример конвертации RGB в CMYK
//        RGBConverter rgbConverter = new RGBConverter(0.2, 0.3, 0.4, 0.1);
//        rgbConverter.convert();
//        System.out.println("CMYK values:");
//        rgbConverter.display();
//    }
//}
//    В данном коде ColorModel является абстрактным классом, который определяет общие поля и методы для цветовых моделей. Он включает абстрактный метод convert, который должен быть реализован в подклассах.
//
//        RGBConverter наследует от ColorModel и реализует метод convert для конвертации цвета из CMYK в RGB. Он принимает значения цветовых компонент CMYK (cyan, magenta, yellow, black) и использует указанные формулы для вычисления значений красного (red), зеленого (green) и синего (blue) компонентов.
//
//        CMYKConverter также наследует от ColorModel и реализует метод convert для конвертации цвета из RGB в CMYK. Он принимает значения цветовых компонент RGB (red, green, blue) и использует формулы для вычисления значений компонентов CMYK (cyan, magenta, yellow, black).
//
//        В методе main демонстрируется пример использования обоих классов для конвертации цвета. Создаются объекты CMYKConverter и RGBConverter с заданными значениями цветовых компонент. Затем вызывается метод convert, чтобы выполнить конвертацию, и метод display, чтобы вывести значения компонентов на экран.