package t11;

import java.util.Random;
import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        Random random = new Random();

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
                if (j == num2 - 1){
                    System.out.println(m[i][j] + " ");
                } else {
                    System.out.print(m[i][j] + " ");
                }
            }
        }
    }
}
