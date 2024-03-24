

public class Main {
    public static void main(String[] args) {

        int score = 500;
        int refill = 1200;

        int bonus;

        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int result = score + refill + bonus;

        System.out.println(" Итоговый счет " + result);
        System.out.println(" Начислено бонусов " + bonus);


    }
}