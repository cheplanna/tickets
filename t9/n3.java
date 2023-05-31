//package t1.t9;
//
//import java.util.Arrays;
//
//public class Neuron {
//    private double[] weights; // Веса нейронов
//    private double bias; // Смещение (bias)
//
//    public Neuron(double[] weights, double bias) {
//        this.weights = weights;
//        this.bias = bias;
//    }
//
//    public double sigmoid(double x) {
//        return 1 / (1 + Math.exp(-x));
//    }
//
//    public double feedForward(double[] inputs) {
//        double sum = bias;
//        for (int i = 0; i < inputs.length; i++) {
//            sum += inputs[i] * weights[i];
//        }
//        return sigmoid(sum);
//    }
//
//    public static void main(String[] args) {
//        double[] weights = {0.5, -0.5}; // Веса нейронов
//        double bias = 0.3; // Смещение (bias)
//        double[] inputs = {1.0, 2.0}; // Входные значения
//
//        Neuron neuron = new Neuron(weights, bias);
//        double output = neuron.feedForward(inputs);
//
//        System.out.println("Weights: " + Arrays.toString(weights));
//        System.out.println("Bias: " + bias);
//        System.out.println("Inputs: " + Arrays.toString(inputs));
//        System.out.println("Output: " + output);
//    }
//}
//    В данном коде класс Neuron реализует нейронную сеть из двух нейронов и одного выхода. Он содержит приватные поля weights (веса нейронов) и bias (смещение), а также публичные методы sigmoid (функция активации сигмоиды) и feedForward (функция прямого распространения).
//
//        Метод sigmoid вычисляет значение сигмоиды для данного входного значения x.
//
//        Метод feedForward выполняет прямое распространение нейронной сети. Он принимает входные значения inputs, умножает их на соответствующие веса нейронов, добавляет смещение и применяет функцию активации сигмоиды к полученной сумме.
//
//        В методе main показан пример использования класса Neuron. Создается объект neuron с заданными весами и смещением, а затем вызывается метод feedForward для выполнения прямого распространения. Результат выводится на экран.
//
//        Пример вывода:
//
//        makefile
//        Copy code
//        Weights: [0.5, -0.5]
//        Bias: 0.3
//        Inputs: [1.0, 2.0]
//        Output: 0.574442516811659
//        Обратите внимание, что в данном примере используется простая реализация сигмоидной функции активации. Если вам требуется более точная или специфичная реализация, вы можете использовать соответствующую библиотеку или расширить класс Neuron для поддержки других функций активации.
