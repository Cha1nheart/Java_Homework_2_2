public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int incomingPayment = 1100;
        int bonus;
        int balance;

        if (incomingPayment > 1000) {
            bonus = (incomingPayment / 100);
            balance = (initialBalance + incomingPayment + bonus);
        } else {
            bonus = 0;
            balance = (initialBalance + incomingPayment);
        }
        System.out.println("Итоговый баланс: " + balance + " рублей(бонус: +" + bonus + " руб.)");
    }
}