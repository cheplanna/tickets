package t10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        Random random = new Random();

        Integer[] m = new Integer[100];
        for (int i = 0; i < 100; i++){
            m[i] = random.nextInt(1,101);
        }

        Arrays.sort(m, Collections.reverseOrder());

        for (int i = 0; i < 10; i++){
            System.out.print(m[i] + " ");
        }
    }
}
