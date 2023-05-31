package t5.n2;
//https://skysmart.ru/articles/mathematic/arifmeticheskaya-progressiya
public class Arithmetic_progression implements Progress{
    int[] m = new int[] {1, 3, 5, 7, 9};

    @Override
    public void progression_denominator() {
        System.out.println("d(-) = " + (m[1] - m[0]));
    }

}
