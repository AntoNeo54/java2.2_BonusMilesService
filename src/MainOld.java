public class MainOld { //проверка разных сцинариев цены билета - при проверки домашнего задания не смотрите
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int bonus = service.calculate(10_899);
        System.out.println(bonus);

        int bonus1 = service.calculate(100_899);
        System.out.println(bonus1);

        int bonus2 = service.calculate(899);
        System.out.println(bonus2);

        //      int ticket_price = 10_89990;
        //      int bonus_rub = 20;
        //      int miles = (int) (ticket_price / 100) / bonus_rub;
        //      System.out.println(miles);
    }
}
