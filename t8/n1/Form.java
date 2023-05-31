package t8.n1;

// Создайте класс Form - оболочку для создания и ввода пароля. Он должен иметь методы
//input, submit, password. Создайте класс SmartForm, который будет наследовать от Form и
//сохранять значения password.

import java.util.Scanner;

public class Form {
    public String input(){
        Scanner cs = new Scanner(System.in);
        System.out.print("input password>");
        String p =  cs.nextLine();
        return p;
    }
    public String password(String p){
        return p;
    }
    public boolean submit(String input){
        if (input == "1"){
            return false;
        }
        return false;
    }
}
