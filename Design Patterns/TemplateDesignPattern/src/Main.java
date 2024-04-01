public class Main {
    public static void main(String[] args) {
        HouseBuilderTemplate houseBuilder = new LuxuryHouseBuilder();
        houseBuilder.buildHouse();
        houseBuilder = new NormalHouseBuilder();
        houseBuilder.buildHouse();
    }
}