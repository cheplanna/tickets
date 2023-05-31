package t5.n1;
public class Triangle {
    int a;
    int b;
    int c;

    public int perimetr(){
     return a+b+c;
    }
    public double square(){
        double s = perimetr()/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}
