package t5.n1;
public class Factorial {
    static int num = 1;
    static int len;
    static int factorial(){
        num = 1;
        for (int i = 1; i < len; i++){
            num *= i;
        }
        return num;
    }
}
