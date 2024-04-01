public class NormalHouseBuilder extends HouseBuilderTemplate{
    NormalHouseBuilder(){
        System.out.println("Normal House...");
    }
    @Override
    public void makeCeiling() {
        System.out.println("Made cement ceiling");
    }

    @Override
    public void makeFlooring() {
        System.out.println("Made tiles flooring");
    }
}
