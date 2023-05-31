//package t1.t7;
//
//import java.time.DayOfWeek;
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class n3{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите месяц (число от 1 до 12): ");
//        int monthNumber = scanner.nextInt();
//
//        LocalDate startDate = LocalDate.of(2022, Month.of(monthNumber), 1);
//        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());
//
//        List<LocalDate> schedule = generateWorkerSchedule(startDate, endDate);
//
//        System.out.println("Расписание смен слесаря:");
//        for (LocalDate date : schedule) {
//            System.out.println(date);
//        }
//    }
//
//    public static List<LocalDate> generateWorkerSchedule(LocalDate startDate, LocalDate endDate) {
//        List<LocalDate> schedule = new ArrayList<>();
//
//        LocalDate date = startDate;
//        while (!date.isAfter(endDate)) {
//            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
//                date = date.plusDays(1);
//            }
//
//            schedule.add(date);
//
//            date = date.plusDays(4);
//        }
//
//        return schedule;
//    }
//}

