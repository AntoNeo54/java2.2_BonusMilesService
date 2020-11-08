public class BonusMilesService {
    public int calculate(int cost) {
        int bonus_rub = 20;
        int miles = (int) (cost) / bonus_rub;
        //       System.out.println(miles);
        return miles;
    }
}
