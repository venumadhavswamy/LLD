import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public Iterator<Product> createIterator(){
        return new ProductIterator();
    }
    class ProductIterator implements Iterator<Product>{
        Integer currentPos = 0;
        @Override
        public boolean hasNext() {
            if(products.size() == currentPos){
                return false;
            }else{
                return true;
            }
        }

        @Override
        public Product next() {
            return products.get(currentPos++);
        }
    }
}
