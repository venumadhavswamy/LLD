public class Main {
    //Client side
    public static void main(String[] args) {
        //We implement a simple Shopping Cart where we have two payment strategies - using Debit Card or using UPI
        ShoppingCartContext shoppingCartContext = new ShoppingCartContext();
        shoppingCartContext.addItem("Laptop");
        shoppingCartContext.addItem("Mouse");

        PaymentStrategy debitCardStrategy = new DebitCardPaymentStrategy(123456789,000);
        PaymentStrategy upiStrategy = new UPIPyamentStrategy("12345678@ybl");

        shoppingCartContext.setPaymentStrategy(debitCardStrategy);
        shoppingCartContext.pay(200);
        shoppingCartContext.setPaymentStrategy(upiStrategy);
        shoppingCartContext.pay(300);
        shoppingCartContext.setPaymentStrategy(debitCardStrategy);
        shoppingCartContext.pay(50000);
    }
}