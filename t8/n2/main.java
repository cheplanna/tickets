package t8.n2;
//public getSalary и setSalary. Создайте объект этого класса 'Иван', возраст 25, зарплата 1000.
//Создайте второй объект этого класса 'Вася', возраст 26, зарплата 2000. Найдите сумму зарплата

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        Worker worker1 = new Worker();
        worker1.setName("Ivan");
        worker1.setAge(25);
        worker1.setSalary(1000);

        Worker worker2 = new Worker();
        worker2.setName("Vasya");
        worker2.setAge(26);
        worker2.setSalary(2000);

        System.out.println("sum salary = " + (worker1.getSalary() + worker2.getSalary()));
    }
}
