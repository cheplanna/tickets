package t1.t4;

// 10. Разработайте программу, реализующую рекурсивное вычисление факториала.
import java.util.Scanner;

public class n1 {
    static int factorial(int x){
        if (x == 1 || x == 0){
            return 1;
        }
        return x * factorial(x - 1);
    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println(">");
        System.out.println(factorial(cs.nextInt()));
    }
}
//Вначале проверяется условие: если вводимое число не равно 1, то мы умножаем данное число на результат этой же функции,
// в которую в качестве параметра передается число x-1. То есть происходит рекурсивный спуск. И так дальше, пока не дойдем того момента,
// когда значение параметра не будет равно единице.
//
//Рекурсивная функция обязательно должна иметь некоторый базовый вариант, который использует оператор return и который
// помещается в начале функции. В случае с факториалом это if (x == 1) return 1;. И все рекурсивные вызовы должны обращаться к подфункциям,
// которые в конечном счете сходятся к базовому варианту. Так, при передаче в функцию положительного числа при дальнейших рекурсивных вызовах
// подфункций в них будет передаваться каждый раз число, меньшее на единицу. И в конце концов мы дойдем до ситуации, когда число будет равно 1,
// и будет использован базовый вариант.
