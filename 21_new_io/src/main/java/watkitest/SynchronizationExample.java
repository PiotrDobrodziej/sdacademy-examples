package watkitest;

import java.util.ArrayList;
import java.util.List;

public class SynchronizationExample {
  public static void main(String[] args) {
ProductCatalog catalog = new ProductCatalog();



  }



  static class ProductCatalog {
    private List<String> produsts;

    public ProductCatalog() {
      produsts = new ArrayList<>();
    }

    void addProduct(String newProduct) {
      produsts.add(newProduct);
    }

    void removeProduct(int index) {
      produsts.remove(index);
    }
  }


}
