package t6.n2;
import java.util.Random;
public class Matrix {
    public int[][] Matrix_generation(int ms){
        int[][] m = new int[ms][ms];
        Random random = new Random();
        for (int i = 0; i < ms; i++){
            for (int j = 0; j < ms; j++){
                m[i][j] = random.nextInt(1,101);
            }
        }
        return  m;
    }

    public int[][] Identity_matrix(int ms){
        int[][] m = new int[ms][ms];
        for (int i = 0; i < ms; i++){
            for (int j = 0; j < ms; j++){
                if (i == j){
                    m[i][j] = 1;
                }else {
                    m[i][j] = 0;
                }
            }
        }
        return  m;
    }
    public int[][] Sum_matrix(int[][] m, int[][] m1){
        int[][] matsum = new int[m.length][m.length];
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++) {
                matsum[i][j] = m[i][j] + m1[i][j];
            }
        }
        return matsum;
    }
    public void Print_matrix(int[][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++) {
                if (j == m.length-1){
                    System.out.println(m[i][j] + " ");
                }else {
                    System.out.print(m[i][j] + " ");
                }
            }
        }
    }
}
