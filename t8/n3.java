package t1.t8;
//
//public class User {
//    protected String name;
//    protected int age;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}
//
//public class Worker extends User {
//    private double salary;
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//}
//
//public class Student extends User {
//    private double scholarship;
//    private int course;
//
//    public void setScholarship(double scholarship) {
//        this.scholarship = scholarship;
//    }
//
//    public double getScholarship() {
//        return scholarship;
//    }
//
//    public void setCourse(int course) {
//        this.course = course;
//    }
//
//    public int getCourse() {
//        return course;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Worker ivan = new Worker();
//        ivan.setName("Иван");
//        ivan.setAge(25);
//        ivan.setSalary(1000);
//
//        Worker vasya = new Worker();
//        vasya.setName("Вася");
//        vasya.setAge(26);
//        vasya.setSalary(2000);
//
//        double totalSalary = ivan.getSalary() + vasya.getSalary();
//        System.out.println("Сумма зарплат Ивана и Васи: " + totalSalary);
//
//        Student student = new Student();
//        student.setName("Анна");
//        student.setAge(20);
//        student.setScholarship(500);
//        student.setCourse(3);
//
//        System.out.println("Имя студента: " + student.getName());
//        System.out.println("Возраст студента: " + student.getAge());
//        System.out.println("Студенческая стипендия: " + student.getScholarship());
//        System.out.println("Курс студента: " + student.getCourse());
//    }
//}
//    В данном коде класс User содержит защищенные (protected) поля name (имя) и age (возраст), а также методы setName, getName, setAge и getAge для установки и получения значений этих полей.
//
//        Класс Worker является подклассом User и наследует его поля и методы. Он также включает дополнительное приватное (private) поле salary (зарплата), а также публичные (public) методы setSalary и getSalary для работы с зарплатой.
//
//        Класс Student также наследует от класса User и добавляет приватные поля scholarship (стипендия) и course (курс), а также геттеры и сеттеры для этих полей.
//
//        В методе main создаются объекты классов Worker и Student, их поля заполняются значениями с помощью методов сеттеров, а затем выводятся на экран значения полей объектов. В случае с Worker также выполняется подсчет суммы зарплат двух рабочих.
