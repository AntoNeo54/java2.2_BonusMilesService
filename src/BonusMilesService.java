public class BonusMilesService {
    public int calculate(int cost) {
        int bonus_rub = 20;
        int miles = cost / bonus_rub;
        return miles;
    }
}
