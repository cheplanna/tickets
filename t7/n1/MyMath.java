package t7.n1;

import java.util.Arrays;
import java.util.Scanner;

public class MyMath {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        float n = cs.nextFloat()/cs.nextFloat();
        System.out.print(n + " -> ");
        System.out.println(round(n));
        System.out.println();

        System.out.println(abs(cs.nextInt()));
        System.out.println();

        System.out.println(pow(cs.nextInt(), cs.nextInt()));


    }
    public static int round(Float n){
        String sn = n.toString();
        String[] m = sn.split("\\.");
        if (Float.parseFloat("0"+m[1]) > 5){
            return Integer.parseInt(m[0]) + 1;
        }else {
            return Integer.parseInt(m[0]);
        }
    }
    public static int abs(int n){
        if (n >= 0){
            return n;
        } else return n * (-1);
    }
    public static int pow(int num, int n){
        int sum = num;
        for (int i = 0; i < n; i++){
            sum *= n;
        }
        return sum;
    }
}
