public class Main {
    public static void main(String[] args) {
        // Задание 1
        int firstFriday = 3; // Предположим, первая пятница выпала на 3-е число

        for (int currentDay = firstFriday; currentDay <= 31; currentDay += 7) {
            System.out.println("Сегодня пятница, " + currentDay + "-е число. Необходимо подготовить отчет");

        }
    }
}