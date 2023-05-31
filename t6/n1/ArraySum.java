package t6.n1;

public class ArraySum implements InArray{

    @Override
    public void Sum(int[] m, int[] m1) {
        int[] sm = new int[m.length];
        for (int i = 0; i < m.length; i++){
            sm[i] = m[i] + m1[i];
        }
        for (int i = 0; i < m.length; i++) {
            System.out.print(sm[i] + " ");
            }
    }
}
