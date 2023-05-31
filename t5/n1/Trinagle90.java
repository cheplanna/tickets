package t5.n1;

class Trinagle90 extends Triangle {
    boolean is90(){
        return ((a*a + b*b == c*c) || (b*b + c*c  == a*a) || (a*a + c*c == b*b));
    }
}
