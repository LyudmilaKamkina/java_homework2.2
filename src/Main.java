public class Main {
    public static void main(String[] args) {

        double balance = 115.50;                                // Объявляете переменные для входных данных и
        double refill = 1000.5;                                 // параметров программы: начального счёта,
        int oneBonus = 100;                                     // суммы пополнения и тп
        int bonus;

        System.out.println ("Текущий счёт: " + balance);
        System.out.println ("Сумма пополнения: " + refill);

        if (refill > 1000) {                                    // В условии задачи пополнение БОЛЕЕ чем на 1000
                                                                // Если бы было не менее я бы написала (>=)
            bonus = (int) (refill / oneBonus);                  // Но я не знаю, что вы имели в виду поэтому в коде написано так

        } else {                                                // Условным оператором проверяете превысила ли
                                                                // сумма пополнения порог и для этих двух разных
            bonus = 0;                                          // сценариев рассчитываете сумму бонуса и выводите
                                                                // на экран.
        }

        System.out.println ("Итоговый счёт:" + (balance + refill + bonus));

    }
}