package t7.n2;

import java.util.Random;
import java.util.Scanner;

public class Ugadayka {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        Random random = new Random();

        boolean t = true;

        while (true){
            System.out.println("wanna play?");
            System.out.println("yes - 1");

            if (cs.nextInt() == 1){
                int count = 3;
                int num = random.nextInt(1,11);
                System.out.println("lets play! \n number is created");

                while (true){
                    System.out.print("your answer is >");
                    int answer = cs.nextInt();
                    if (answer == num){
                        System.out.println("right! \n");
                        break;
                    }else {
                        count--;
                        if (count == 0){
                            System.out.println("game over \n");
                            break;
                        }
                        System.out.println("nope");
                        if (answer < num){
                            System.out.println("the num is >");
                        }else {
                            System.out.println("the num is <");
                        }
                    }
                }

            }else {
                //t = false;
                break;
            }
        }
    }
}
