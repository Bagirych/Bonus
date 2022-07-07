public class Main {

    public static void main(String[] args) {
        int founds = 100; // средства на счёте
        int scale = 100;  // сумма, за которую начисляется бонус
        int moneyUp = 1100; // пополнение средств
        int bonus; // бонусные баллы

        if (moneyUp >= 1000) {
            bonus = moneyUp / scale;
        }
        else {
            bonus = 0;
        }

        int all = founds + moneyUp + bonus; // общий баланс

        System.out.println("Пополнение счёта на " + moneyUp + " руб.");
        System.out.println("Ваш бонус " + bonus + " руб.");
        System.out.println("Общий баланс " + all + " руб.");
    }
}


