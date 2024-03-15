public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        int account = 100;
        int refill = 300;

            int bonus;
            if (refill > 1000) {
                bonus = refill / 100 + account / 100;
            } else {
                bonus = 0;
            }

        System.out.println(" Итоговый бонус " + bonus);

            int result = account + refill + bonus;

        System.out.println(" Сумма на счету " + result);


        }
    }
}