public class UPIPyamentStrategy implements PaymentStrategy{
    private String upiID;

    public UPIPyamentStrategy(String upiID) {
        this.upiID = upiID;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" with UPI named "+upiID);
    }
}
