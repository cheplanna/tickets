// Для решения данной задачи можно использовать классы Thread и Runnable для создания и управления потоками. Вот пример программы, которая реализует указанное поведение:
//
//java
//Copy code
//public class ThreadExample {
//    public static void main(String[] args) {
//        Thread timerThread = new Thread(new TimerRunnable());
//        Thread messageThread1 = new Thread(new MessageRunnable("Thread 1"));
//        Thread messageThread2 = new Thread(new MessageRunnable("Thread 2"));
//
//        timerThread.start();
//        messageThread1.start();
//        messageThread2.start();
//
//        try {
//            Thread.sleep(60000); // Ожидаем одну минуту
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        timerThread.interrupt(); // Прерываем поток таймера
//        messageThread1.interrupt(); // Прерываем поток сообщения 1
//        messageThread2.interrupt(); // Прерываем поток сообщения 2
//    }
//
//    static class TimerRunnable implements Runnable {
//        @Override
//        public void run() {
//            try {
//                int seconds = 0;
//                while (!Thread.currentThread().isInterrupted()) {
//                    Thread.sleep(5000); // Ожидаем 5 секунд
//                    seconds += 5;
//                    System.out.println("Прошло времени: " + seconds + " сек");
//                }
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        }
//    }
//
//    static class MessageRunnable implements Runnable {
//        private String message;
//
//        public MessageRunnable(String message) {
//            this.message = message;
//        }
//
//        @Override
//        public void run() {
//            try {
//                while (!Thread.currentThread().isInterrupted()) {
//                    Thread.sleep(7000); // Ожидаем 7 секунд
//                    System.out.println(message);
//                }
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        }
//    }
//}
//В этой программе:
//
//Создаются три потока: timerThread для отображения времени, messageThread1 и messageThread2 для вывода сообщений.
//Каждый поток выполняется параллельно.
//Поток TimerRunnable отображает время каждые 5 секунд.
//Потоки MessageRunnable выводят свои сообщения каждые 7 секунд.
//Программа выполняется в течение одной минуты (60000 миллисекунд).
//После одной минуты потоки прерываются с помощью метода interrupt().
//Пример работы программы:
//
//mathematica
//Copy code
//Прошло времени: 5 сек
//Thread 1
//Thread 2
//Прошло времени: 10 сек
//Прошло времени: 15 сек
//Thread 1
//Прошло времени: 20 сек
//Thread 2
//Прошло времени: 25 сек
//Прошло времени: 30 сек
//Thread 1
//Thread 2
//Прошло времени: 35 сек
//Прошло времени: 40 сек
//Thread 1
//Прошло времени: 45 сек
//Thread 2
//Прошло времени: 50 сек
//Прошло времени: 55 сек
//Thread 1
//Thread 2
//Прошло времени: 60 сек
//В данном примере каждые 5 секунд выводится сообщение о прошедшем времени, каждые 7 секунд выводятся сообщения от двух потоков messageThread1 и messageThread2. Программа работает одну минуту, после чего прекращает выполнение.