import java.util.ArrayList;

public class ShoppingCartContext {
    PaymentStrategy paymentStrategy;
    ArrayList<String> items;
    ShoppingCartContext(){
        this.items = new ArrayList<>();
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(int amount){
        paymentStrategy.pay(amount);
    }
    public void addItem(String item){
        items.add(item);
    }
    public void deleteItem(String item){
        items.remove(item);
    }
}
