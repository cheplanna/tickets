package t1.t3;
//8. Напишите программу, которая по дате определяет день недели, на который эта дата
//приходится.
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


public class n2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату (год-месяц-день): ");
        String inputDate = scanner.nextLine();

        try {
            LocalDate date = LocalDate.parse(inputDate); // Преобразуем введенную строку в объект LocalDate

            DayOfWeek dayOfWeek = date.getDayOfWeek(); // Получаем день недели для указанной даты

            String dayOfWeekName = dayOfWeek.getDisplayName(TextStyle.FULL, new Locale("ru", "RU")); // Получаем название дня недели на русском языке

            System.out.println("День недели: " + dayOfWeekName);
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка: неправильный формат даты. Пожалуйста, введите дату в формате год-месяц-день, например, 2023-05-31.");
        }
    }
}

//В начале программы создается объект Scanner для чтения ввода пользователя с консоли.
//
//Затем выводится приглашение пользователю для ввода даты: "Введите дату (год-месяц-день): ".
//
//Введенная пользователем строка сохраняется в переменной inputDate с помощью метода nextLine() объекта Scanner.
//
//Затем код находится в блоке try, где выполняется обработка введенной даты.
//
//Внутри блока try вызывается метод LocalDate.parse() для преобразования введенной строки в объект типа LocalDate, представляющий дату.
//
//Далее вызывается метод getDayOfWeek() объекта LocalDate, который возвращает день недели для указанной даты в виде объекта типа DayOfWeek.
//
//Метод getDisplayName() вызывается для получения полного названия дня недели на русском языке. Передается аргумент TextStyle.FULL, чтобы получить полное название, и объект Locale("ru", "RU"), чтобы указать локаль на русском языке.
//
//Полученное название дня недели сохраняется в переменной dayOfWeekName.
//
//Затем в блоке try выводится сообщение на консоль с помощью System.out.println(), содержащее название дня недели.
//
//Если в блоке try возникает исключение типа DateTimeParseException, перехватываем его и переходим в блок catch.
//
//В блоке catch выводится сообщение об ошибке: "Ошибка: неправильный формат даты. Пожалуйста, введите дату в формате год-месяц-день, например, 2023-05-31.".
//
//После выполнения блока try-catch программа завершается.
//
//Таким образом, программа запрашивает у пользователя ввод даты, преобразует ее в объект LocalDate, находит день недели и выводит его на русском языке.
// В случае неправильного формата ввода даты, программа сообщает об ошибке и предлагает пользователю ввести дату снова.


//public class n2 {
//    public static void main(String[] args) {
//        String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
//        int month = 30;
//        int count = 0;
//        Scanner cs = new Scanner(System.in);
//        System.out.print("date>");
//        int date = cs.nextInt();
//
//        for (int i = 1; i < month+1; i++){
//            if (i == date){
//                System.out.println(days[count]);
//            }else {
//                count++;
//                if (count == 7){
//                    count = 0;
//                }
//            }
//        }
//    }
//}
