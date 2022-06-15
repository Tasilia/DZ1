public class BonusMilesService {
    public int calculate (int cost){
        int priceForMile = 20; // кол-во рублей за одну милю
        int mile = cost / priceForMile;
        return mile;
    }
}
