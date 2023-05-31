package t6.n1;

public class OrArray implements InArray{
    @Override
    public void Sum(int[] m, int[] m1) {
        Boolean[] sm = new Boolean[m.length];
        for (int i = 0; i < m.length; i++){
            if (m[i] != 0 || m1[i] != 0){
                sm[i] = true;
            }else{
                sm[i] = false;
            }
        }
        for (int i = 0; i < m.length; i++) {
            System.out.print(sm[i] + " ");
        }
    }
}
