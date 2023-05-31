package t5.n2;

public class Geometric_progression implements Progress{
    int[] m = new int[] {1, 3, 9, 27, 81};

    @Override
    public void progression_denominator() {
        System.out.println("q(*) = " + (m[1]/m[0]));
    }
}
