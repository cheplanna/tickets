package t1.t3;

//
//       9. Написать класс, который при введении даты в формате ДД.ММ.ГГ (к примеру, 22.10.20)
//        выводит номер недели. Даты начиная с 2020 по 2022 годы. К примеру, первая неделя в 2020 году:
//        1-5 января, вторая неделя – 6-12 января. Значит при вводе 08.01.20 вывод должен быть: Неделя  2.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.IsoFields;
import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату в формате ДД.ММ.ГГ: ");
        String inputDate = scanner.nextLine();

        try {
            // Создание объекта DateTimeFormatter с указанным шаблоном для формата ДД.ММ.ГГ
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
            // Преобразование введенной строки в объект LocalDate
            LocalDate date = LocalDate.parse(inputDate, formatter);

            // Получение номера недели с использованием ISO Week Date System
            int weekNumber = date.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR);

            // Вывод номера недели
            System.out.println("Неделя " + weekNumber);
        } catch (DateTimeParseException e) {
            // Обработка исключения, если введенная дата имеет неправильный формат
            System.out.println("Ошибка: неправильный формат даты. Пожалуйста, введите дату в формате ДД.ММ.ГГ, например, 22.10.20.");
        }
    }
}

//Создание класса WeekNumberCalculator, который содержит метод main, являющийся точкой входа программы.
//
//Создание объекта Scanner для чтения ввода пользователя с консоли.
//
//Вывод приглашения пользователю для ввода даты в формате "ДД.ММ.ГГ" с помощью System.out.print().
//
//Сохранение введенной пользователем строки в переменной inputDate.
//
//Блок try, в котором выполняется обработка введенной даты.
//
//Создание объекта DateTimeFormatter с шаблоном "dd.MM.yy" для формата "ДД.ММ.ГГ".
//
//Вызов метода LocalDate.parse() для преобразования введенной строки в объект LocalDate, используя указанный форматтер.
//
//Получение номера недели с использованием IsoFields.WEEK_OF_WEEK_BASED_YEAR для объекта LocalDate.
//
//Сохранение номера недели в переменной weekNumber.
//
//Вывод номера недели с помощью System.out.println().
//
//Блок catch, в котором перехватывается исключение DateTimeParseException, возникающее при неправильном формате ввода даты.
//
//Вывод сообщения об ошибке при неправильном формате даты с помощью System.out.println().