public class LuxuryHouseBuilder extends HouseBuilderTemplate{
    LuxuryHouseBuilder(){
        System.out.println("Luxury house...");
    }
    @Override
    public void makeCeiling() {
        System.out.println("Made wooden ceiling");
    }

    @Override
    public void makeFlooring() {
        System.out.println("Made granite flooring");
    }

    @Override
    public void makePlumbing(){
        System.out.println("Plumbing made with brass pipes");
    }
}
