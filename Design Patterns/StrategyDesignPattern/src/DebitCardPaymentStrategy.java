public class DebitCardPaymentStrategy implements PaymentStrategy{
    private int cardNo;
    private int cvv;

    public DebitCardPaymentStrategy(int cardNo, int cvv) {
        this.cardNo = cardNo;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" with debit card numbered "+cardNo);
    }
}
