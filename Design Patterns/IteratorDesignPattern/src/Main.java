public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("ball",10);
        Product p2 = new Product("bat",2);
        Product p3 = new Product("wicket",20);
        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        Iterator<Product> productIterator = cart.createIterator();
        while (productIterator.hasNext()){
            Product p = productIterator.next();
            System.out.println("*****"+p+"*****");
        }
    }
}