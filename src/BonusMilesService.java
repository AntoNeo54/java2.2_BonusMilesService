public class BonusMilesService {
    public int calculate(int cost) {
        int bonusRub = 20;
        int miles = cost / bonusRub;
        return miles;
    }
}
