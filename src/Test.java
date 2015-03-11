/**
 * Created by Степан on 11.03.2015.
 */
public class Test {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 58); // создаем время 23:59:58
        System.out.println(time);             // проверяем создалось ли, коректно ли выводится на экран
        for (int i = 0; i < 10; i++) {        // +10 сек с шагом 1 сек
            time = time.nextSecond();
            System.out.println(time);
        }
        for (int i = 0; i < 10; i++) {        // +10 мин с шагом 1 мин
            time = time.nextMinute();
            System.out.println(time);
        }
        for (int i = 0; i < 4; i++) {         // +4 часа с шагом 1 час
            time = time.nextHour();
            System.out.println(time);
        } for (int i = 0; i < 10; i++) {      // -10 сек с шагом 1 сек
            time = time.previousSecond();
            System.out.println(time);
        }
        for (int i = 0; i < 10; i++) {        // -10 мин с шагом 1 мин
            time = time.previousMinute();
            System.out.println(time);
        }
        for (int i = 0; i < 4; i++) {         // -4 часа с шагом 1 час
            time = time.previousHour();
            System.out.println(time);
        }                                     // ломаем часы
        try {
            time.setHour(28);
        } catch (IllegalArgumentException ex) {
            System.out.println(" hour must be >=0 and <=23");
        }

        System.out.println(time);

    }
}
