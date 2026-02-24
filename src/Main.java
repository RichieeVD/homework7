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

        // Задание 3
        int budget = 1000;
        int dailyCost = 100;

            // while
        System.out.println("--- Расчет через while ---");
        int dayWhile = 0;
        int currentBudgetWhile = budget;

        while (currentBudgetWhile >= dailyCost) {
            dayWhile++;

            if (dayWhile % 5 == 0) {
                System.out.println("День " + dayWhile + " — акция! Парковка бесплатная.");
                continue; // Пропускаем списание денег и идем на следующий круг
            }

            currentBudgetWhile -= dailyCost;
        }
        System.out.println("Бюджета хватит на " + dayWhile + " дней.");

            // for
        System.out.println("\n--- Расчет через for ---");
        int currentBudgetFor = budget;
        int dayFor = 1;

        for (; currentBudgetFor >= dailyCost; dayFor++) {
            if (dayFor % 5 == 0) {
                System.out.println("День " + dayFor + " — акция! Парковка бесплатная.");
                continue;
            }
            currentBudgetFor -= dailyCost;
        }
        System.out.println("Бюджета хватит на " + (dayFor - 1) + " дней.");
    }
}