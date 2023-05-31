package t5.n1;
import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        Trinagle90 object = new Trinagle90();

        System.out.println("a:");
        object.a = cs.nextInt();

        System.out.println("b:");
        object.b = cs.nextInt();

        System.out.println("c:");
        object.c = cs.nextInt();

        System.out.println("perimetr");
        System.out.println(object.perimetr());

        System.out.println("square");
        System.out.println(object.square());

        System.out.println("is trinagle 90");
        System.out.println(object.is90());

        System.out.println("factorial");
        System.out.println("num:");

        Factorial.len = cs.nextInt();
        System.out.println(Factorial.factorial());
    }
}
