public abstract class HouseBuilderTemplate {
    public final void buildHouse(){
        System.out.println("Building house is started...");
        layFoundation();
        buildPillars();
        buildWalls();
        makePlumbing();
        makeCeiling();
        makeFlooring();
        System.out.println();
    }
    public void layFoundation(){
        System.out.println("Foundation laid");
    }
    public void buildPillars(){
        System.out.println("Built pillars");
    }
    public void buildWalls(){
        System.out.println("Built walls");
    }
    public abstract void makeCeiling();
    public abstract void makeFlooring();
    public void makePlumbing(){
        System.out.println("Plumbing made with steel pipes");
    }
}
