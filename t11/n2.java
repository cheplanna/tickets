package t11;

import java.util.Random;
import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        Random random = new Random();
        int max = 0;
        String imax = "";
        int min = 1000;
        String imin = "";


        System.out.println("input 2 numbers >");
        int num1 = cs.nextInt();
        int num2 = cs.nextInt();

        int[][] m = new int[num1][num2];

        for (int i = 0; i < num1; i++){
            for (int j = 0; j < num2; j++){
                m[i][j] = random.nextInt(1,101);
            }
        }

        for (int i = 0; i < num1; i++){
            for (int j = 0; j < num2; j++){
                if (m[i][j] < min){
                    min = m[i][j];
                    imin = "index - " + i + " " + j;
                }
                if (m[i][j] > max){
                    max = m[i][j];
                    imax = "index - " + i + " " + j;
                }
            }
        }
        System.out.println("max - " + max + " " + imax);
        System.out.println("min - " + min + " " + imin);
    }
}
