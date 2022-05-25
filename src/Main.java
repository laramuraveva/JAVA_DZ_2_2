public class Main {
    public static void main(String[] args) {
        int check = 100;    //сумма на счету
        int sumCheck = 1100;     //сумма пополнения
        int bonus = sumCheck / 100;     //размер бонуса
        int moneyBonus = check + sumCheck + bonus;   //итоговая сумма на счету после пополнения с бонусом
        int money = sumCheck + check; //итоговая сумма на счету без бонуса
        int totalBonus;     //количество бонусов
        if (sumCheck >= 1000) {
            System.out.println("На счету: " + moneyBonus);
            System.out.println("Бонус: " + bonus);
        } else {
            System.out.println("На счету: " + money);
            System.out.println("Бонус: " + 0);
        }

    }
}
