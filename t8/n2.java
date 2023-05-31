package t1.t8;
//
//     23. Создайте класс Form - оболочку для создания и ввода пароля. Он должен иметь методы
//        input, submit, password. Создайте класс SmartForm, который будет наследовать от Form и
//        сохранять значения password.
//
//
//import java.util.Scanner;
//
//public class Form {
//    protected String password;
//
//    public void input() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите пароль: ");
//        password = scanner.nextLine();
//    }
//
//    public void submit() {
//        System.out.println("Отправка формы...");
//    }
//
//    public String getPassword() {
//        return password;
//    }
//}
//
//public class SmartForm extends Form {
//    public void password() {
//        System.out.println("Пароль: " + getPassword());
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        SmartForm smartForm = new SmartForm();
//        smartForm.input();
//        smartForm.submit();
//        smartForm.password();
//    }
//}
//    В данном коде Form является базовым классом (оболочкой) для создания и ввода пароля. Он содержит методы input, submit и getPassword. Метод input считывает пароль с клавиатуры, submit выводит сообщение о отправке формы, а getPassword возвращает значение введенного пароля.
//
//        SmartForm является подклассом Form и наследует его функциональность. Он добавляет метод password, который выводит сохраненное значение пароля с помощью метода getPassword.
//
//        В методе main создается экземпляр SmartForm, который затем выполняет ввод пароля, отправку формы и вывод сохраненного пароля на экран.
//
//        Пример работы программы:
//
//        makefile
//        Copy code
//        Введите пароль: mypassword
//        Отправка формы...
//        Пароль: mypassword
//        Обратите внимание, что поле password в классе Form имеет модификатор protected, чтобы его можно было использовать в подклассе SmartForm. Это обеспечивает наследование и доступ к полю из подкласса.