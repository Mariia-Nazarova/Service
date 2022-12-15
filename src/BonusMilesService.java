public class BonusMilesService {
    public int calculate(int cost) {
        int priceMile = 20; //цена бонусной мили, руб
        int miles = cost / priceMile;

        return miles;
    }
}
