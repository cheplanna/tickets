package t6.n1;

public class main {
    public static void main(String[] args) {
        int[] array = new int[]{1,4,57,0,3,0,0,1,0,6};
        int[] array1 = new int[]{1,0,18,5,0,0,0,1,0,0};

        InArray x = new ArraySum();
        System.out.print("Sum: ");
        x.Sum(array, array1);
        System.out.println();
        InArray x1 = new OrArray();
        System.out.print("orSum: ");
        x1.Sum(array, array1);
    }
}
