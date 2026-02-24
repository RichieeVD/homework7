public class Main {
    public static void main(String[] args) {
        // Задание 1
        int firstFriday = 3; // Предположим, первая пятница выпала на 3-е число

        for (int currentDay = firstFriday; currentDay <= 31; currentDay += 7) {
            System.out.println("Сегодня пятница, " + currentDay + "-е число. Необходимо подготовить отчет");

        }

        // Задание 2
        int finish = 42195;
        int step = 500;

          // do-while
        System.out.println("--- Версия с do-while ---");
        int distanceDoWhile = 0;
        do {
            int remaining = finish - distanceDoWhile;
            System.out.println("Держитесь! Осталось " + remaining + " метров");
            distanceDoWhile += step;
        } while (distanceDoWhile <= finish);

            // for
        System.out.println("\n--- Версия с for ---");
        for (int distanceFor = 0; distanceFor <= finish; distanceFor += step) {
            int remaining = finish - distanceFor;
            System.out.println("Держитесь! Осталось " + remaining + " метров");
        }
    }
}